import org.junit.Test

class CalcTestSuite {

  @Test def GCDAlgol(): Unit = {
    case class Location(lat: Double, lon: Double)

    val AVERAGE_RADIUS_OF_EARTH_KM = 6371.0088

    def calculateDistanceInKilometer(userLocation: Location, warehouseLocation: Location): Int = {
      val latDistance = Math.toRadians(userLocation.lat - warehouseLocation.lat)
      val lngDistance = Math.toRadians(userLocation.lon - warehouseLocation.lon)
      val sinLat = Math.sin(latDistance / 2)
      val sinLng = Math.sin(lngDistance / 2)
      val a = sinLat * sinLat +
        (Math.cos(Math.toRadians(userLocation.lat)) *
          Math.cos(Math.toRadians(warehouseLocation.lat)) *
          sinLng * sinLng)
      val c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a))
      (AVERAGE_RADIUS_OF_EARTH_KM * c).toInt
    }

    val l1 = Location(45.0, -180.0)
    val l2 = Location(45.0, -179)

    println(calculateDistanceInKilometer(l1, l2))

  }

}
