fun main(){
    val university = University()
    StudentUniversity("Roman", university)
    StudentUniversity("Svetlana", university)
    university.setNewsUniversity("новое расписание для студентов готово")

    val academy = Academy()
    StudentAcademy("Наталья", academy)
    StudentAcademy("Сергей", academy)
    academy.setNewsAcademy("новый график прохождения практики готов")
}