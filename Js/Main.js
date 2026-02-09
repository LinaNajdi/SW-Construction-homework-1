
const cardd = require("./Cardd.js");
const newRecentMistakesFirstSorter = require("./newRecentMistakesFirstSorter.js");


const createCard = (correct , question) => ({
    isCorrect: () => correct,
    getQuestion: () => question
});


const cards = [
    createCard(true ,"is the capital of saudi riyadh?"),
    createCard(false ,"is 1+1=3?"),
    createCard(true, "are sw students Engineers ?"),
    createCard(false, "is the day 25 hours?"),
    createCard(true ,"3+9=12?"),
    createCard(true,"is coding fun but complex sometimes?")
];

const sorter = newRecentMistakesFirstSorter();
const sortedCards = sorter.organize(cards);

console.log("Sorted Cards:");
sortedCards.forEach(card => {
    console.log("Q : " + card.getQuestion() +"Card is " + card.isCorrect());
});