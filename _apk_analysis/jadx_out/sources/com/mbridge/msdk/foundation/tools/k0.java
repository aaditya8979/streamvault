package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: SameBase64Tool.java */
/* JADX INFO: loaded from: classes.dex */
public class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<Character, Character> f38117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map<Character, Character> f38118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static byte[] f38119c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, ExifInterface.START_CODE, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char[] f38120d = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    static {
        HashMap map = new HashMap();
        f38117a = map;
        map.put('v', 'A');
        f38117a.put('S', 'B');
        f38117a.put('o', 'C');
        f38117a.put('a', 'D');
        f38117a.put('j', 'E');
        f38117a.put('c', 'F');
        f38117a.put('7', 'G');
        f38117a.put('d', 'H');
        f38117a.put('R', 'I');
        f38117a.put('z', 'J');
        f38117a.put('p', 'K');
        f38117a.put('W', 'L');
        f38117a.put('i', 'M');
        f38117a.put('f', 'N');
        f38117a.put('G', 'O');
        f38117a.put('y', 'P');
        f38117a.put('N', 'Q');
        f38117a.put('x', 'R');
        f38117a.put('Z', 'S');
        f38117a.put('n', 'T');
        f38117a.put('V', 'U');
        f38117a.put('5', 'V');
        f38117a.put('k', 'W');
        f38117a.put('+', 'X');
        f38117a.put('D', 'Y');
        f38117a.put('H', 'Z');
        f38117a.put('L', 'a');
        f38117a.put('Y', 'b');
        f38117a.put('h', 'c');
        f38117a.put('J', 'd');
        f38117a.put('4', 'e');
        f38117a.put('6', 'f');
        f38117a.put('l', 'g');
        f38117a.put('t', 'h');
        f38117a.put('0', 'i');
        f38117a.put('U', 'j');
        f38117a.put('3', 'k');
        f38117a.put('Q', 'l');
        f38117a.put('r', 'm');
        f38117a.put('g', 'n');
        f38117a.put('E', 'o');
        f38117a.put('u', 'p');
        f38117a.put('q', 'q');
        f38117a.put('8', 'r');
        f38117a.put('s', 's');
        f38117a.put('w', 't');
        f38117a.put('/', 'u');
        f38117a.put('X', 'v');
        f38117a.put('M', 'w');
        f38117a.put('e', 'x');
        f38117a.put('B', 'y');
        f38117a.put('A', 'z');
        f38117a.put('T', '0');
        f38117a.put('2', '1');
        f38117a.put('F', '2');
        f38117a.put('b', '3');
        f38117a.put('9', '4');
        f38117a.put('P', '5');
        f38117a.put('1', '6');
        f38117a.put('O', '7');
        f38117a.put('I', '8');
        f38117a.put('K', '9');
        f38117a.put('m', '+');
        f38117a.put('C', '/');
        HashMap map2 = new HashMap();
        f38118b = map2;
        map2.put('A', 'v');
        f38118b.put('B', 'S');
        f38118b.put('C', 'o');
        f38118b.put('D', 'a');
        f38118b.put('E', 'j');
        f38118b.put('F', 'c');
        f38118b.put('G', '7');
        f38118b.put('H', 'd');
        f38118b.put('I', 'R');
        f38118b.put('J', 'z');
        f38118b.put('K', 'p');
        f38118b.put('L', 'W');
        f38118b.put('M', 'i');
        f38118b.put('N', 'f');
        f38118b.put('O', 'G');
        f38118b.put('P', 'y');
        f38118b.put('Q', 'N');
        f38118b.put('R', 'x');
        f38118b.put('S', 'Z');
        f38118b.put('T', 'n');
        f38118b.put('U', 'V');
        f38118b.put('V', '5');
        f38118b.put('W', 'k');
        f38118b.put('X', '+');
        f38118b.put('Y', 'D');
        f38118b.put('Z', 'H');
        f38118b.put('a', 'L');
        f38118b.put('b', 'Y');
        f38118b.put('c', 'h');
        f38118b.put('d', 'J');
        f38118b.put('e', '4');
        f38118b.put('f', '6');
        f38118b.put('g', 'l');
        f38118b.put('h', 't');
        f38118b.put('i', '0');
        f38118b.put('j', 'U');
        f38118b.put('k', '3');
        f38118b.put('l', 'Q');
        f38118b.put('m', 'r');
        f38118b.put('n', 'g');
        f38118b.put('o', 'E');
        f38118b.put('p', 'u');
        f38118b.put('q', 'q');
        f38118b.put('r', '8');
        f38118b.put('s', 's');
        f38118b.put('t', 'w');
        f38118b.put('u', '/');
        f38118b.put('v', 'X');
        f38118b.put('w', 'M');
        f38118b.put('x', 'e');
        f38118b.put('y', 'B');
        f38118b.put('z', 'A');
        f38118b.put('0', 'T');
        f38118b.put('1', '2');
        f38118b.put('2', 'F');
        f38118b.put('3', 'b');
        f38118b.put('4', '9');
        f38118b.put('5', 'P');
        f38118b.put('6', '1');
        f38118b.put('7', 'O');
        f38118b.put('8', 'I');
        f38118b.put('9', 'K');
        f38118b.put('+', 'm');
        f38118b.put('/', 'C');
    }

    public static String a(String str) {
        return r0.b(str);
    }

    public static String b(String str) {
        return TextUtils.isEmpty(str) ? "" : r0.c(str);
    }
}
