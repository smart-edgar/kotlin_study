package edgar.study.kotlin.effective.chapter06.item39

sealed class WorkoutState

//class PrepareState(val exercise: Exercise) : WorkoutState()
//
//class ExerciseState(val exercise: Exercise) : WorkoutState()
//
//object DoneState : WorkoutStats()
//
//fun List<Exercise>.toState(): List<WorkoutState> =
//    flatMap { exercise ->
//        listOf(PreoareState(exercise), PrepareState(exercise))
//    } + DoneState
