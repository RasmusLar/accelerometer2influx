package corpglory.android.accelerometer

/**
 * Created by evsluzh on 17.03.18.
 */
class AccelerometerState {
    var acceleration = DoubleArray(3)
    var speed = DoubleArray(3)
    var gravity = DoubleArray(3)
    var time: Long = 0

    constructor(acceleration: DoubleArray, speed: DoubleArray, gravity: DoubleArray, time: Long) {
        this.acceleration = acceleration
        this.speed = speed
        this.gravity = gravity
        this.time = time
    }
}