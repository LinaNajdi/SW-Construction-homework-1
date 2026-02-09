const newRecentMistakesFirstSorter = () => {
    return {
        organize: (cards) => {

            const mistakes = cards.filter(card => !card.isCorrect());
            const correct = cards.filter(card => card.isCorrect());
            return [...mistakes, ...correct];

        }
    };
};

module.exports = newRecentMistakesFirstSorter;