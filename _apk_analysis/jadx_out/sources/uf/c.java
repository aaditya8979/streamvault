package uf;

import android.os.Build;
import android.text.TextUtils;
import com.ironsource.Z7;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: RomUtils.java */
/* JADX INFO: loaded from: classes11.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f85656a = {"samsung"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Integer f85657b;

    public static int a() {
        String str = Build.DISPLAY;
        if (TextUtils.isEmpty(str) || !str.contains("Flyme")) {
            return 0;
        }
        return h(str.replaceAll("Flyme", "").replaceAll("OS", "").replaceAll(Z7.f30794r, "").substring(0, 1));
    }

    public static int b() {
        Integer num = f85657b;
        if (num != null) {
            return num.intValue();
        }
        if (g()) {
            Integer num2 = 1;
            f85657b = num2;
            return num2.intValue();
        }
        if (f()) {
            Integer num3 = 2;
            f85657b = num3;
            return num3.intValue();
        }
        if (e()) {
            Integer num4 = 3;
            f85657b = num4;
            return num4.intValue();
        }
        Integer num5 = 4;
        f85657b = num5;
        return num5.intValue();
    }

    public static int c() throws Throwable {
        String strD = d();
        if (TextUtils.isEmpty(strD)) {
            return 0;
        }
        try {
            return i(strD);
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public static String d() throws Throwable {
        BufferedReader bufferedReader;
        Throwable th2;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop ro.miui.ui.version.code").getInputStream()), 1024);
            try {
                String line = bufferedReader.readLine();
                bufferedReader.close();
                try {
                    bufferedReader.close();
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
                return line;
            } catch (IOException unused) {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e11) {
                        e11.printStackTrace();
                    }
                }
                return null;
            } catch (Throwable th3) {
                th2 = th3;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e12) {
                        e12.printStackTrace();
                    }
                }
                throw th2;
            }
        } catch (IOException unused2) {
            bufferedReader = null;
        } catch (Throwable th4) {
            bufferedReader = null;
            th2 = th4;
        }
    }

    public static boolean e() {
        return true;
    }

    public static boolean f() {
        return a() >= 4;
    }

    public static boolean g() throws Throwable {
        String strD = d();
        if (TextUtils.isEmpty(strD)) {
            return false;
        }
        try {
            return i(strD) >= 4;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static int h(String str) {
        if (Pattern.compile("^[-\\+]?[\\d]+$").matcher(str).matches()) {
            return i(str);
        }
        return 0;
    }

    public static int i(Object obj) {
        return j(obj, 0);
    }

    public static int j(Object obj, int i10) {
        if (obj == null) {
            return i10;
        }
        try {
            String strTrim = obj.toString().trim();
            return strTrim.contains(".") ? Integer.parseInt(strTrim.substring(0, strTrim.lastIndexOf("."))) : Integer.parseInt(strTrim);
        } catch (Exception unused) {
            return i10;
        }
    }
}
