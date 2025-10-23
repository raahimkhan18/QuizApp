package com.example.myquizapp

object Constants {

    const val USER_NAME:String="user_name"
    const val TOTAL_QUESTIONS:String="total_questions"
    const val CORRECT_ANSWERS:String="correct_answer"

    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,"What country does this flag belong to ? ",
             R.drawable.img,
            "Argentina","Australia",
            "Armenia","Austria",
            1
        )
        questionsList.add(que1)

        val que2 = Question(
            2,"What country does this flag belong to ? ",
            R.drawable.img_10,
            "Argentina","New Zealand",
            "Armenia","Austria",
            2
        )
        questionsList.add(que2)

        val que3 = Question(
            3,"What country does this flag belong to ? ",
            R.drawable.img_11,
            "Australia","India",
            "Armenia","Austria",
            1
        )
        questionsList.add(que3)

        val que4 = Question(
            4,"What country does this flag belong to ? ",
            R.drawable.img_3,
            "Germany","India",
            "Belgium","Austria",
            3
        )
        questionsList.add(que4)

        val que5 = Question(
            5,"What country does this flag belong to ? ",
            R.drawable.img_6,
            "Pakistan","Australia",
            "Bangladesh","Fiji",
            4
        )
        questionsList.add(que5)

        val que6 = Question(
            6,"What country does this flag belong to ? ",
            R.drawable.img_8,
            "Pakistan","India",
            "China","Austria",
            2
        )
        questionsList.add(que6)

        val que7 = Question(
            7,"What country does this flag belong to ? ",
            R.drawable.img_4,
            "Brazil","Denmark",
            "Sweden","Austria",
            1
        )
        questionsList.add(que7)

        val que8 = Question(
            8,"What country does this flag belong to ? ",
            R.drawable.img_7,
            "France","Kenya",
            "Poland","Germany",
            4
        )
        questionsList.add(que8)

        val que9 = Question(
            9,"What country does this flag belong to ? ",
            R.drawable.img_9,
            "Kuwait","Jordan",
            "UAE","Palestine",
            1
        )
        questionsList.add(que9)

        val que10 = Question(
            10,"What country does this flag belong to ? ",
            R.drawable.img_5,
            "Sweden","Finland",
            "Denmark","England",
            3
        )
        questionsList.add(que10)

        return questionsList


    }


}