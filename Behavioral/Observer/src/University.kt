class University() : Observable {
    private val studentsUniversity: MutableList<Observer> = mutableListOf()
    private var newsUniversity: String = ""

    fun setNewsUniversity(news: String) {
        newsUniversity = news
        notifyObservers()
    }

    override fun registerObserver(observer: Observer) {
        studentsUniversity.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        studentsUniversity.remove(observer)
    }

    override fun notifyObservers() {
        for (student in studentsUniversity) {
            student.upDate(newsUniversity)
        }
    }
}