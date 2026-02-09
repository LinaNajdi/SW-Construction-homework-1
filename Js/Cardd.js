class Cardd{
    constructor(correct, question) {
        this.correct = correct;
        this.question = question;
    }

    isCorrect(){
        return this.correct;
    }

    getQuestion(){
        return this.question;
    }
}

module.exports = Cardd;