package omega.text.spotter

import org.bytedeco.opencv.helper.opencv_core.RGB
import org.bytedeco.opencv.opencv_core.Scalar


class Trainer {
    val RED: Scalar = RGB(255.0, 0.0, 0.0)
    val GREEN: Scalar = RGB(0.0, 255.0, 0.0)
    val BLUE: Scalar = RGB(0.0, 0.0, 255.0)
    val YELLOW: Scalar = RGB(255.0, 255.0, 0.0)
    val CYAN: Scalar = RGB(0.0, 255.0, 255.0)
    val MAGENTA: Scalar = RGB(255.0, 0.0, 255.0)
    val ORANGE: Scalar = RGB(255.0, 128.0, 0.0)
    val PINK: Scalar = RGB(255.0, 192.0, 203.0)
    val LIGHTBLUE: Scalar = RGB(153.0, 204.0, 255.0)
    val VIOLET: Scalar = RGB(238.0, 130.0, 238.0)

    val width = 608
    val heigh = 608
    val nChannels = 3

    val gridWidth = 13
    val gridHeight = 13

    val possibleCharacters = 61; // 26 cap 26 lowercase 9 regular


}