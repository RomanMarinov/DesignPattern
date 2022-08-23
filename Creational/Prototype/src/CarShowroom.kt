class CarShowroom(
    var bmw: String,
    var nissan: String,
    var opel: String
) : Copyable<CarShowroom> {

    override fun copy(): CarShowroom {
        return CarShowroom(
            this.bmw,
            this.opel,
            this.nissan
        )
    }

        override fun toString(): String {
        return " bmv =$bmw nissan =$nissan opel =$opel"
    }
}