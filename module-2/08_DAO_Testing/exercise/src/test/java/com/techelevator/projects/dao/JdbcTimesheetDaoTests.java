package com.techelevator.projects.dao;

import com.techelevator.projects.model.Timesheet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.Time;
import java.time.LocalDate;
import java.util.List;

public class JdbcTimesheetDaoTests extends BaseDaoTests {

    private static final Timesheet TIMESHEET_1 = new Timesheet(1L, 1L, 1L, 
            LocalDate.parse("2021-01-01"), 1.0, true, "Timesheet 1");
    private static final Timesheet TIMESHEET_2 = new Timesheet(2L, 1L, 1L,
            LocalDate.parse("2021-01-02"), 1.5, true, "Timesheet 2");
    private static final Timesheet TIMESHEET_3 = new Timesheet(3L, 2L, 1L,
            LocalDate.parse("2021-01-01"), 0.25, true, "Timesheet 3");
    private static final Timesheet TIMESHEET_4 = new Timesheet(4L, 2L, 2L,
            LocalDate.parse("2021-02-01"), 2.0, false, "Timesheet 4");
    
    private JdbcTimesheetDao sut;

    private Timesheet testTimesheet;


    @Before
    public void setup() {
        sut = new JdbcTimesheetDao(dataSource);
        testTimesheet = new Timesheet(1L, 1L, 1L, LocalDate.parse("2021-01-01"), 1.0, true, "Timesheet1");
    }

    @Test
    public void getTimesheet_returns_correct_timesheet_for_id() {
        Timesheet timesheet = sut.getTimesheet(1L);
        Assert.assertNotNull("getTimesheet returns null", timesheet);
        assertTimesheetsMatch("getTimesheet returned incorrect data", TIMESHEET_1, timesheet);

        timesheet = sut.getTimesheet(2L);
        assertTimesheetsMatch("getTimesheet returned incorrect data", TIMESHEET_2, timesheet);
    }

    @Test
    public void getTimesheet_returns_null_when_id_not_found() {
        Timesheet timesheet = sut.getTimesheet(100L);
        Assert.assertNull(timesheet);
    }

    @Test
    public void getTimesheetsByEmployeeId_returns_list_of_all_timesheets_for_employee() {
        List<Timesheet> timesheets = sut.getTimesheetsByEmployeeId(1L);
        Assert.assertEquals(2, timesheets.size());
        assertTimesheetsMatch("Result", TIMESHEET_1, timesheets.get(0));
        assertTimesheetsMatch("Result", TIMESHEET_2, timesheets.get(1));

        timesheets = sut.getTimesheetsByEmployeeId(2L);
        Assert.assertEquals(2, timesheets.size());
        assertTimesheetsMatch("Result", TIMESHEET_3, timesheets.get(0));
        assertTimesheetsMatch("Result", TIMESHEET_4, timesheets.get(1));
    }

    @Test
    public void getTimesheetsByProjectId_returns_list_of_all_timesheets_for_project() {
        List<Timesheet> timesheets = sut.getTimesheetsByProjectId(1L);

        Assert.assertEquals(3, timesheets.size());
        assertTimesheetsMatch("Result", TIMESHEET_1, timesheets.get(0));
        assertTimesheetsMatch("Result", TIMESHEET_2, timesheets.get(1));
        assertTimesheetsMatch("Result", TIMESHEET_3, timesheets.get(2));

        timesheets = sut.getTimesheetsByProjectId(2L);

        Assert.assertEquals(1, timesheets.size());
        assertTimesheetsMatch("Result", TIMESHEET_4, timesheets.get(0));
    }

    @Test
    public void createTimesheet_returns_timesheet_with_id_and_expected_values() {
        Timesheet newTimesheet = sut.createTimesheet(testTimesheet);

        Assert.assertNotNull("createTimesheet returns null", newTimesheet);
        long newId = newTimesheet.getTimesheetId();
        Assert.assertTrue("createTimesheet returned incorrect data", newId > 0);

        testTimesheet.setTimesheetId(newId);
        assertTimesheetsMatch("createTimesheet returned incorrect data", testTimesheet, newTimesheet);
    }

    @Test
    public void created_timesheet_has_expected_values_when_retrieved() {
        Timesheet newTimesheet = sut.createTimesheet(testTimesheet);
        Assert.assertNotNull("createProject returns null", newTimesheet);

        long newId = newTimesheet.getTimesheetId();
        Assert.assertTrue(newId > 0);
        testTimesheet.setTimesheetId(newId);

        assertTimesheetsMatch("Incorrect results", newTimesheet, newTimesheet);
    }

    @Test
    public void updated_timesheet_has_expected_values_when_retrieved() {
        Timesheet timesheetUpdate = sut.getTimesheet(1L);
        Assert.assertNotNull("getTimesheet must work first", timesheetUpdate);

        timesheetUpdate.setEmployeeId(1L);
        timesheetUpdate.setProjectId(1L);
        timesheetUpdate.setDateWorked(LocalDate.parse("2021-01-01"));
        timesheetUpdate.setHoursWorked(1.0);
        timesheetUpdate.setBillable(true);
        timesheetUpdate.setDescription("Timesheet1");

        sut.updateTimesheet(timesheetUpdate);
        Timesheet returnedTimesheet = sut.getTimesheet(1L);
        assertTimesheetsMatch("Update failed to change values", timesheetUpdate, returnedTimesheet);
    }

    @Test
    public void deleted_timesheet_cant_be_retrieved() {
        sut.deleteTimesheet(1L);
        Timesheet returnedTimesheet = sut.getTimesheet(1L);
        Assert.assertNull(returnedTimesheet);
    }

    @Test
    public void getBillableHours_returns_correct_total() {
        Double result = sut.getBillableHours(1L, 1L);
        Assert.assertEquals(Double.valueOf(2.5), result);
    }

    private void assertTimesheetsMatch(String s, Timesheet expected, Timesheet actual) {
        Assert.assertEquals(expected.getTimesheetId(), actual.getTimesheetId());
        Assert.assertEquals(expected.getEmployeeId(), actual.getEmployeeId());
        Assert.assertEquals(expected.getProjectId(), actual.getProjectId());
        Assert.assertEquals(expected.getDateWorked(), actual.getDateWorked());
        Assert.assertEquals(expected.getHoursWorked(), actual.getHoursWorked(), 0.001);
        Assert.assertEquals(expected.isBillable(), actual.isBillable());
        Assert.assertEquals(expected.getDescription(), actual.getDescription());
    }

}
