package news

import educationOrganizations.Observable

class StudentAcademy(private val _name: String, observable: Observable) : Observer {
    init { observable.registerObserver(this) }

    override fun upDate(news: String) {
        println(" =$_name узнал новость академии $news")
    }
}
