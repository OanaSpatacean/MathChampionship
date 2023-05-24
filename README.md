# MathChampionship
Using Unit Testing On A Math Championship Example

Exercise given in Foundations of Software Engineering laboratory.

We are going to create a MathChampionship class that will handle the results of a Mathematics Championship.

The MathChampionship class will have a list of StudentScore objects, each representing a student's name and the score they have achieved. Additionally, the MathChampionship class will also have a maxAchievableScore representing the maximum score a student can achieve.

The main functionality of the MathChampionship class is to determine the prize a student has won based on their score. The criteria for awarding the prizes are as follows:

If a student's score is more than 95% of the maxAchievableScore, they get a Gold medal. If no student has achieved this performance, the student with the highest score will get a Gold medal.
If a student's score is more than 90% of the maxAchievableScore, they get a Silver medal. If no student has achieved this performance, the student with the second highest score will get a Silver medal.
If a student's score is more than 85% of the maxAchievableScore, they get a Bronze medal. If no student has achieved this performance, the student with the third highest score will get a Bronze medal.
If a student's score is more than 80% of the maxAchievableScore, they get an honourable mention. If no student has achieved this performance, the next five highest scoring students (with scores at least 50% of the maxAchievableScore) get honourable mentions. The method getPrize(String studentName) of the MathChampionship class will receive a student's name as input and return the prize they have won. If the student is not found in the list, it will throw a StudentNotFoundException.
Now, with a clear understanding of the problem, let's get started.
