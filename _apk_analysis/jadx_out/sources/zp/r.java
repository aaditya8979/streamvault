package zp;

import android.content.Context;
import android.os.LocaleList;
import android.os.Process;
import android.util.Log;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.Enumeration;
import java.util.TimeZone;

/* JADX INFO: compiled from: VCUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f98403a;

    public static String a(String str) {
        return str.equalsIgnoreCase("ar") ? "ar" : str.equalsIgnoreCase("es") ? "es" : str.equalsIgnoreCase("fr") ? "fr" : str.equalsIgnoreCase("hi") ? "hi" : str.equalsIgnoreCase("it") ? "it" : str.equalsIgnoreCase("ml") ? "ml" : str.equalsIgnoreCase("pt") ? "pt" : str.equalsIgnoreCase("ru") ? "ru" : str.equalsIgnoreCase("ta") ? "ta" : str.equalsIgnoreCase("te") ? "te" : str.equalsIgnoreCase("th") ? "th" : str.equalsIgnoreCase("vi") ? "vi" : str.equalsIgnoreCase(ScarConstants.IN_SIGNAL_KEY) ? "id" : "en";
    }

    public static Context b() {
        Context context = f98403a;
        if (context != null) {
            return context;
        }
        throw new NullPointerException("should be initialized in application");
    }

    public static String c() {
        return TimeZone.getDefault().getDisplayName(false, 0);
    }

    public static String d() {
        try {
            LocaleList localeList = LocaleList.getDefault();
            return !localeList.isEmpty() ? a(localeList.get(0).getLanguage()) : "";
        } catch (Throwable th2) {
            th2.printStackTrace();
            return "";
        }
    }

    public static void e(Context context) {
        if (context == null) {
            throw new NullPointerException("Cannot are null of  context");
        }
        f98403a = context;
        int iMyPid = Process.myPid();
        Log.e("Myapplication", "creat");
        Log.e("Myapplication", "MyApplication pid is " + iMyPid);
        s.a(context);
    }

    public static boolean f() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces == null) {
                return false;
            }
            for (NetworkInterface networkInterface : Collections.list(networkInterfaces)) {
                if (networkInterface.isUp() && networkInterface.getInterfaceAddresses().size() != 0 && ("tun0".equals(networkInterface.getName()) || "ppp0".equals(networkInterface.getName()))) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return false;
        }
    }

    public static void g(Context context) {
        f98403a = context;
    }
}
