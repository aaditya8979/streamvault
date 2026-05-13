package x2;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import androidx.core.view.ViewCompat;
import bo.a0;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.SmartLoginOption;
import com.facebook.internal.j0;
import com.facebook.internal.q;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.ironsource.C3978d4;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import k2.t;
import k8.f;
import kotlin.Metadata;
import o8.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import tn.p;

/* JADX INFO: compiled from: DeviceRequestsHelper.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u0005\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0007J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0007J\b\u0010\t\u001a\u00020\u0007H\u0007J\u0014\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0007J\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0007J\u0012\u0010\u000f\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0003J\u0012\u0010\u0010\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0003R\u001c\u0010\u0013\u001a\n \u0011*\u0004\u0018\u00010\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R4\u0010\u0018\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00150\u0014j\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0015`\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0017¨\u0006\u001b"}, d2 = {"Lx2/a;", "", "", "", "deviceInfo", "d", "userCode", "", InneractiveMediationDefs.GENDER_FEMALE, "e", "url", "Landroid/graphics/Bitmap;", "c", "Lbn/r;", "a", "g", "b", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "Ljava/util/HashMap;", "Landroid/net/nsd/NsdManager$RegistrationListener;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "deviceRequestsListeners", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f86717a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final String TAG = a.class.getCanonicalName();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final HashMap<String, NsdManager.RegistrationListener> deviceRequestsListeners = new HashMap<>();

    /* JADX INFO: renamed from: x2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DeviceRequestsHelper.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\f"}, d2 = {"x2/a$a", "Landroid/net/nsd/NsdManager$RegistrationListener;", "Landroid/net/nsd/NsdServiceInfo;", "NsdServiceInfo", "Lbn/r;", "onServiceRegistered", "serviceInfo", "onServiceUnregistered", "", IronSourceConstants.EVENTS_ERROR_CODE, "onRegistrationFailed", "onUnregistrationFailed", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class C1091a implements NsdManager.RegistrationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f86720a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f86721b;

        public C1091a(String str, String str2) {
            this.f86720a = str;
            this.f86721b = str2;
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onRegistrationFailed(@NotNull NsdServiceInfo nsdServiceInfo, int i10) {
            p.k(nsdServiceInfo, "serviceInfo");
            a aVar = a.f86717a;
            a.a(this.f86721b);
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onServiceRegistered(@NotNull NsdServiceInfo nsdServiceInfo) {
            p.k(nsdServiceInfo, "NsdServiceInfo");
            if (p.f(this.f86720a, nsdServiceInfo.getServiceName())) {
                return;
            }
            a aVar = a.f86717a;
            a.a(this.f86721b);
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onServiceUnregistered(@NotNull NsdServiceInfo nsdServiceInfo) {
            p.k(nsdServiceInfo, "serviceInfo");
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onUnregistrationFailed(@NotNull NsdServiceInfo nsdServiceInfo, int i10) {
            p.k(nsdServiceInfo, "serviceInfo");
        }
    }

    public static final void a(@Nullable String str) {
        if (c3.a.d(a.class)) {
            return;
        }
        try {
            f86717a.b(str);
        } catch (Throwable th2) {
            c3.a.b(th2, a.class);
        }
    }

    @Nullable
    public static final Bitmap c(@Nullable String url) {
        int iG;
        int iJ;
        int[] iArr;
        Bitmap bitmapCreateBitmap;
        Bitmap bitmap = null;
        if (c3.a.d(a.class)) {
            return null;
        }
        try {
            EnumMap enumMap = new EnumMap(EncodeHintType.class);
            enumMap.put(EncodeHintType.MARGIN, 2);
            try {
                b bVarA = new f().a(url, BarcodeFormat.QR_CODE, 200, 200, enumMap);
                iG = bVarA.g();
                iJ = bVarA.j();
                iArr = new int[iG * iJ];
                if (iG > 0) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        int i12 = i10 * iJ;
                        if (iJ > 0) {
                            int i13 = 0;
                            while (true) {
                                int i14 = i13 + 1;
                                iArr[i12 + i13] = bVarA.d(i13, i10) ? ViewCompat.MEASURED_STATE_MASK : -1;
                                if (i14 >= iJ) {
                                    break;
                                }
                                i13 = i14;
                            }
                        }
                        if (i11 >= iG) {
                            break;
                        }
                        i10 = i11;
                    }
                }
                bitmapCreateBitmap = Bitmap.createBitmap(iJ, iG, Bitmap.Config.ARGB_8888);
            } catch (WriterException unused) {
            }
            try {
                bitmapCreateBitmap.setPixels(iArr, 0, iJ, 0, 0, iJ, iG);
                return bitmapCreateBitmap;
            } catch (WriterException unused2) {
                bitmap = bitmapCreateBitmap;
                return bitmap;
            }
        } catch (Throwable th2) {
            c3.a.b(th2, a.class);
            return null;
        }
    }

    @NotNull
    public static final String d(@Nullable Map<String, String> deviceInfo) {
        if (c3.a.d(a.class)) {
            return null;
        }
        if (deviceInfo == null) {
            try {
                deviceInfo = new HashMap<>();
            } catch (Throwable th2) {
                c3.a.b(th2, a.class);
                return null;
            }
        }
        String str = Build.DEVICE;
        p.j(str, "DEVICE");
        deviceInfo.put(C3978d4.i.G, str);
        String str2 = Build.MODEL;
        p.j(str2, "MODEL");
        deviceInfo.put("model", str2);
        String string = new JSONObject(deviceInfo).toString();
        p.j(string, "JSONObject(deviceInfo as Map<*, *>).toString()");
        return string;
    }

    public static final boolean e() {
        if (c3.a.d(a.class)) {
            return false;
        }
        try {
            FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.f15289a;
            q qVarF = FetchedAppSettingsManager.f(t.m());
            if (qVarF != null) {
                return qVarF.j().contains(SmartLoginOption.Enabled);
            }
            return false;
        } catch (Throwable th2) {
            c3.a.b(th2, a.class);
            return false;
        }
    }

    public static final boolean f(@Nullable String userCode) {
        if (c3.a.d(a.class)) {
            return false;
        }
        try {
            if (e()) {
                return f86717a.g(userCode);
            }
            return false;
        } catch (Throwable th2) {
            c3.a.b(th2, a.class);
            return false;
        }
    }

    @TargetApi(16)
    public final void b(String str) {
        if (c3.a.d(this)) {
            return;
        }
        try {
            NsdManager.RegistrationListener registrationListener = deviceRequestsListeners.get(str);
            if (registrationListener != null) {
                Object systemService = t.l().getSystemService("servicediscovery");
                if (systemService == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
                }
                try {
                    ((NsdManager) systemService).unregisterService(registrationListener);
                } catch (IllegalArgumentException e10) {
                    j0 j0Var = j0.f15387a;
                    j0.d0(TAG, e10);
                }
                deviceRequestsListeners.remove(str);
            }
        } catch (Throwable th2) {
            c3.a.b(th2, this);
        }
    }

    @TargetApi(16)
    public final boolean g(String userCode) {
        if (c3.a.d(this)) {
            return false;
        }
        try {
            HashMap<String, NsdManager.RegistrationListener> map = deviceRequestsListeners;
            if (map.containsKey(userCode)) {
                return true;
            }
            String str = "fbsdk_" + p.t("android-", a0.R(t.B(), '.', '|', false, 4, null)) + '_' + ((Object) userCode);
            NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
            nsdServiceInfo.setServiceType("_fb._tcp.");
            nsdServiceInfo.setServiceName(str);
            nsdServiceInfo.setPort(80);
            Object systemService = t.l().getSystemService("servicediscovery");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
            }
            C1091a c1091a = new C1091a(str, userCode);
            map.put(userCode, c1091a);
            ((NsdManager) systemService).registerService(nsdServiceInfo, 1, c1091a);
            return true;
        } catch (Throwable th2) {
            c3.a.b(th2, this);
            return false;
        }
    }
}
