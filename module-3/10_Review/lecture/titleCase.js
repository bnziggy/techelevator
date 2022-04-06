function strToLowercaseWords(wordStr) {
    return wordStr.split(' ').map((word) => word.toLowercase());
}

function isMinorWord(wordToCheck, minorWords) {
    return minorWords.contains(wordToCheck);
}

function titlecaseWord(word) {
    return word.substring(0, 1).toUpperCase() + word.substring(1);
}

function titleCase(title, minor = '') {
    let titleWords = strToLowercaseWords(title);
    let minorWords = strToLowercaseWords(minor);

    let result = '';

    titleWords.forEach((titleWord, idx) => {
        if (idx == 0 || isMinorWord(titleWord, minorWords)) {
            result += titleCaseWord(titleWord);
        } else {
            result += titleWord;
        }
        result += ' ';
    });

    return result;
}