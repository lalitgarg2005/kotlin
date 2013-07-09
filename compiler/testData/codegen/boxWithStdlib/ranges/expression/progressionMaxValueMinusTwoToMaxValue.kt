// Auto-generated by org.jetbrains.jet.generators.tests.GenerateRangesCodegenTestData. DO NOT EDIT!
import java.util.ArrayList
import java.lang as j

import java.lang.Integer.MAX_VALUE as MaxI
import java.lang.Integer.MIN_VALUE as MinI
import java.lang.Byte.MAX_VALUE as MaxB
import java.lang.Byte.MIN_VALUE as MinB
import java.lang.Short.MAX_VALUE as MaxS
import java.lang.Short.MIN_VALUE as MinS
import java.lang.Long.MAX_VALUE as MaxL
import java.lang.Long.MIN_VALUE as MinL
import java.lang.Character.MAX_VALUE as MaxC
import java.lang.Character.MIN_VALUE as MinC

fun box(): String {
    val list1 = ArrayList<Int>()
    val range1 = (MaxI - 2)..MaxI step 2
    for (i in range1) {
        list1.add(i)
        if (list1.size() > 23) break
    }
    if (list1 != listOf<Int>(MaxI - 2, MaxI)) {
        return "Wrong elements for (MaxI - 2)..MaxI step 2: $list1"
    }

    val list2 = ArrayList<Byte>()
    val range2 = (MaxB - 2).toByte()..MaxB step 2
    for (i in range2) {
        list2.add(i)
        if (list2.size() > 23) break
    }
    if (list2 != listOf<Byte>((MaxB - 2).toByte(), MaxB)) {
        return "Wrong elements for (MaxB - 2).toByte()..MaxB step 2: $list2"
    }

    val list3 = ArrayList<Short>()
    val range3 = (MaxS - 2).toShort()..MaxS step 2
    for (i in range3) {
        list3.add(i)
        if (list3.size() > 23) break
    }
    if (list3 != listOf<Short>((MaxS - 2).toShort(), MaxS)) {
        return "Wrong elements for (MaxS - 2).toShort()..MaxS step 2: $list3"
    }

    val list4 = ArrayList<Long>()
    val range4 = (MaxL - 2).toLong()..MaxL step 2
    for (i in range4) {
        list4.add(i)
        if (list4.size() > 23) break
    }
    if (list4 != listOf<Long>((MaxL - 2).toLong(), MaxL)) {
        return "Wrong elements for (MaxL - 2).toLong()..MaxL step 2: $list4"
    }

    val list5 = ArrayList<Char>()
    val range5 = (MaxC - 2).toChar()..MaxC step 2
    for (i in range5) {
        list5.add(i)
        if (list5.size() > 23) break
    }
    if (list5 != listOf<Char>((MaxC - 2).toChar(), MaxC)) {
        return "Wrong elements for (MaxC - 2).toChar()..MaxC step 2: $list5"
    }

    return "OK"
}
