package educationOrganizations

import news.Observer

class Academy() : Observable {
    private val studentsAcademy: MutableList<Observer> = mutableListOf()
    private var newsAcademy: String = ""

    fun setNewsAcademy(news: String) {
        newsAcademy = news
        notifyObservers()
    }

    override fun registerObserver(observer: Observer) {
        studentsAcademy.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        studentsAcademy.remove(observer)
    }

    override fun notifyObservers() {
        for (student in studentsAcademy) {
            student.upDate(newsAcademy)
        }
    }

}