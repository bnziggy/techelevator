// add pageTitle

let pageTitle = 'My Shopping List';

// add groceries

let groceries = ['apple', 'grape', 'pear', 'milk', 'eggs',
  'cheese', 'chicken', 'rice', 'tea', 'honey'];

/** 
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */
function setPageTitle() {

  document.querySelector('#title').innerText = pageTitle;
}

/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
function displayGroceries() {
  let list = document.getElementById('groceries');

  for (let i = 0; i < groceries.length; i++) {
    let itemList = document.createElement('li');
    itemList.setAttribute('id', 'listItem'+i);
    list.appendChild(itemList);
    itemList.innerText = groceries[i];
  }
}


/**
 * This function will be called when the button is clicked. You will need to get a reference
 * to every list item and add the class completed to each one
 */
function markCompleted() {
  for (let i = 0; i < groceries.length; i++) {
    let itemList = document.getElementById('listItem'+i);
    itemList.setAttribute('class', 'completed');
    console.log(itemList);
  }
}

setPageTitle();

displayGroceries();

// Don't worry too much about what is going on here, we will cover this when we discuss events.
document.addEventListener('DOMContentLoaded', () => {
  // When the DOM Content has loaded attach a click listener to the button
  const button = document.querySelector('.btn');
  button.addEventListener('click', markCompleted);
});
