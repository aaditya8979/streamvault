package q2;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import bo.d0;
import com.applovin.sdk.AppLovinEventParameters;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k2.t;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import tn.p;

/* JADX INFO: compiled from: InAppPurchaseEventManager.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b:\u0010;J\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007JF\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\r\u001a\u00020\fH\u0007J*\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0007J*\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0007J*\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0007J\b\u0010\u0014\u001a\u00020\u0013H\u0007J\u000e\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\bJF\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\r\u001a\u00020\fH\u0002J,\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00182\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tH\u0002J\u001c\u0010\u001b\u001a\u00020\u00132\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u000eH\u0002J\"\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001c\u001a\u00020\bH\u0002J2\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001c\u001a\u00020\bH\u0002J0\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\bH\u0002J0\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\u0016\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tH\u0002J\u001e\u0010&\u001a\u0004\u0018\u00010%2\n\u0010#\u001a\u0006\u0012\u0002\b\u00030\"2\u0006\u0010$\u001a\u00020\bH\u0002J\u001e\u0010(\u001a\b\u0012\u0002\b\u0003\u0018\u00010\"2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\bH\u0002JC\u0010,\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\b2\u0006\u0010$\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010\u00012\u000e\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010*H\u0002¢\u0006\u0004\b,\u0010-R0\u00101\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020%0.j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020%`/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u00100R8\u00102\u001a&\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\"0.j\u0012\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\"`/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00100R\u001c\u00105\u001a\n 3*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u00104R\u001c\u00108\u001a\n 3*\u0004\u0018\u000106068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u00107R\u001c\u00109\u001a\n 3*\u0004\u0018\u000106068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00107¨\u0006<"}, d2 = {"Lq2/i;", "", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Landroid/os/IBinder;", NotificationCompat.CATEGORY_SERVICE, "a", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "skuList", "inAppBillingObj", "", "isSubscription", "", CampaignEx.JSON_KEY_AD_K, "i", "j", "g", "Lbn/r;", "b", "skuDetail", InneractiveMediationDefs.GENDER_MALE, "l", "", "p", "skuDetailsMap", "q", "type", "o", "h", InneractiveMediationDefs.GENDER_FEMALE, "purchases", "c", "Ljava/lang/Class;", "classObj", "methodName", "Ljava/lang/reflect/Method;", "e", "className", "d", IconCompat.EXTRA_OBJ, "", "args", "n", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "methodMap", "classMap", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "PACKAGE_NAME", "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "skuDetailSharedPrefs", "purchaseInappSharedPrefs", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final i f77627a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final HashMap<String, Method> methodMap = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final HashMap<String, Class<?>> classMap = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final String PACKAGE_NAME = t.l().getPackageName();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final SharedPreferences skuDetailSharedPrefs = t.l().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final SharedPreferences purchaseInappSharedPrefs = t.l().getSharedPreferences("com.facebook.internal.PURCHASE", 0);

    @Nullable
    public static final Object a(@NotNull Context context, @Nullable IBinder service) {
        if (c3.a.d(i.class)) {
            return null;
        }
        try {
            p.k(context, GAMConfig.KEY_CONTEXT);
            return f77627a.n(context, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", null, new Object[]{service});
        } catch (Throwable th2) {
            c3.a.b(th2, i.class);
            return null;
        }
    }

    public static final void b() {
        if (c3.a.d(i.class)) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = skuDetailSharedPrefs;
            long j10 = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
            if (j10 == 0) {
                sharedPreferences.edit().putLong("LAST_CLEARED_TIME", jCurrentTimeMillis).apply();
            } else if (jCurrentTimeMillis - j10 > 604800) {
                sharedPreferences.edit().clear().putLong("LAST_CLEARED_TIME", jCurrentTimeMillis).apply();
            }
        } catch (Throwable th2) {
            c3.a.b(th2, i.class);
        }
    }

    @NotNull
    public static final ArrayList<String> g(@NotNull Context context, @Nullable Object inAppBillingObj) {
        i iVar;
        Class<?> clsD;
        if (c3.a.d(i.class)) {
            return null;
        }
        try {
            p.k(context, GAMConfig.KEY_CONTEXT);
            ArrayList<String> arrayList = new ArrayList<>();
            return (inAppBillingObj == null || (clsD = (iVar = f77627a).d(context, "com.android.vending.billing.IInAppBillingService")) == null || iVar.e(clsD, "getPurchaseHistory") == null) ? arrayList : iVar.c(iVar.f(context, inAppBillingObj, "inapp"));
        } catch (Throwable th2) {
            c3.a.b(th2, i.class);
            return null;
        }
    }

    @NotNull
    public static final ArrayList<String> i(@NotNull Context context, @Nullable Object inAppBillingObj) {
        if (c3.a.d(i.class)) {
            return null;
        }
        try {
            p.k(context, GAMConfig.KEY_CONTEXT);
            i iVar = f77627a;
            return iVar.c(iVar.h(context, inAppBillingObj, "inapp"));
        } catch (Throwable th2) {
            c3.a.b(th2, i.class);
            return null;
        }
    }

    @NotNull
    public static final ArrayList<String> j(@NotNull Context context, @Nullable Object inAppBillingObj) {
        if (c3.a.d(i.class)) {
            return null;
        }
        try {
            p.k(context, GAMConfig.KEY_CONTEXT);
            i iVar = f77627a;
            return iVar.c(iVar.h(context, inAppBillingObj, "subs"));
        } catch (Throwable th2) {
            c3.a.b(th2, i.class);
            return null;
        }
    }

    @NotNull
    public static final Map<String, String> k(@NotNull Context context, @NotNull ArrayList<String> skuList, @Nullable Object inAppBillingObj, boolean isSubscription) {
        if (c3.a.d(i.class)) {
            return null;
        }
        try {
            p.k(context, GAMConfig.KEY_CONTEXT);
            p.k(skuList, "skuList");
            Map<String, String> mapP = f77627a.p(skuList);
            ArrayList<String> arrayList = new ArrayList<>();
            for (String str : skuList) {
                if (!mapP.containsKey(str)) {
                    arrayList.add(str);
                }
            }
            mapP.putAll(f77627a.l(context, arrayList, inAppBillingObj, isSubscription));
            return mapP;
        } catch (Throwable th2) {
            c3.a.b(th2, i.class);
            return null;
        }
    }

    public final ArrayList<String> c(ArrayList<String> purchases) {
        if (c3.a.d(this)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            SharedPreferences.Editor editorEdit = purchaseInappSharedPrefs.edit();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            for (String str : purchases) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String string = jSONObject.getString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
                    long j10 = jSONObject.getLong("purchaseTime");
                    String string2 = jSONObject.getString("purchaseToken");
                    if (jCurrentTimeMillis - (j10 / 1000) <= 86400 && !p.f(purchaseInappSharedPrefs.getString(string, ""), string2)) {
                        editorEdit.putString(string, string2);
                        arrayList.add(str);
                    }
                } catch (JSONException unused) {
                }
            }
            editorEdit.apply();
            return arrayList;
        } catch (Throwable th2) {
            c3.a.b(th2, this);
            return null;
        }
    }

    public final Class<?> d(Context context, String className) {
        if (c3.a.d(this)) {
            return null;
        }
        try {
            HashMap<String, Class<?>> map = classMap;
            Class<?> cls = map.get(className);
            if (cls != null) {
                return cls;
            }
            Class<?> clsB = m.b(context, className);
            if (clsB != null) {
                map.put(className, clsB);
            }
            return clsB;
        } catch (Throwable th2) {
            c3.a.b(th2, this);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final Method e(Class<?> classObj, String methodName) {
        Class[] clsArr;
        Method methodC;
        if (c3.a.d(this)) {
            return null;
        }
        try {
            HashMap<String, Method> map = methodMap;
            Method method = map.get(methodName);
            if (method != null) {
                return method;
            }
            switch (methodName.hashCode()) {
                case -1801122596:
                    if (methodName.equals("getPurchases")) {
                        Class cls = Integer.TYPE;
                        p.j(cls, "TYPE");
                        clsArr = new Class[]{cls, String.class, String.class, String.class};
                    }
                    break;
                case -1450694211:
                    if (methodName.equals("isBillingSupported")) {
                        Class cls2 = Integer.TYPE;
                        p.j(cls2, "TYPE");
                        clsArr = new Class[]{cls2, String.class, String.class};
                    }
                    break;
                case -1123215065:
                    clsArr = !methodName.equals("asInterface") ? null : new Class[]{IBinder.class};
                    break;
                case -594356707:
                    if (methodName.equals("getPurchaseHistory")) {
                        Class cls3 = Integer.TYPE;
                        p.j(cls3, "TYPE");
                        clsArr = new Class[]{cls3, String.class, String.class, String.class, Bundle.class};
                    }
                    break;
                case -573310373:
                    if (methodName.equals("getSkuDetails")) {
                        Class cls4 = Integer.TYPE;
                        p.j(cls4, "TYPE");
                        clsArr = new Class[]{cls4, String.class, String.class, Bundle.class};
                    }
                    break;
                default:
                    break;
            }
            if (clsArr == null) {
                methodC = m.c(classObj, methodName, null);
            } else {
                m mVar = m.f77648a;
                methodC = m.c(classObj, methodName, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            }
            if (methodC != null) {
                map.put(methodName, methodC);
            }
            return methodC;
        } catch (Throwable th2) {
            c3.a.b(th2, this);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList<java.lang.String> f(android.content.Context r19, java.lang.Object r20, java.lang.String r21) {
        /*
            r18 = this;
            boolean r0 = c3.a.d(r18)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L9b
            r0.<init>()     // Catch: java.lang.Throwable -> L9b
            boolean r2 = r18.o(r19, r20, r21)     // Catch: java.lang.Throwable -> L9b
            if (r2 == 0) goto L9a
            r2 = 0
            r3 = r1
            r4 = r2
            r5 = r4
        L17:
            r6 = 5
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L9b
            r6 = 6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L9b
            r12[r2] = r6     // Catch: java.lang.Throwable -> L9b
            java.lang.String r6 = q2.i.PACKAGE_NAME     // Catch: java.lang.Throwable -> L9b
            r13 = 1
            r12[r13] = r6     // Catch: java.lang.Throwable -> L9b
            r6 = 2
            r12[r6] = r21     // Catch: java.lang.Throwable -> L9b
            r6 = 3
            r12[r6] = r3     // Catch: java.lang.Throwable -> L9b
            r3 = 4
            android.os.Bundle r6 = new android.os.Bundle     // Catch: java.lang.Throwable -> L9b
            r6.<init>()     // Catch: java.lang.Throwable -> L9b
            r12[r3] = r6     // Catch: java.lang.Throwable -> L9b
            java.lang.String r9 = "com.android.vending.billing.IInAppBillingService"
            java.lang.String r10 = "getPurchaseHistory"
            r7 = r18
            r8 = r19
            r11 = r20
            java.lang.Object r3 = r7.n(r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L9b
            if (r3 == 0) goto L91
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L9b
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r8
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch: java.lang.Throwable -> L9b
            java.lang.String r10 = "RESPONSE_CODE"
            int r10 = r3.getInt(r10)     // Catch: java.lang.Throwable -> L9b
            if (r10 != 0) goto L91
            java.lang.String r10 = "INAPP_PURCHASE_DATA_LIST"
            java.util.ArrayList r10 = r3.getStringArrayList(r10)     // Catch: java.lang.Throwable -> L9b
            if (r10 != 0) goto L5e
            goto L91
        L5e:
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> L9b
        L62:
            boolean r11 = r10.hasNext()     // Catch: java.lang.Throwable -> L9b
            if (r11 == 0) goto L8a
            java.lang.Object r11 = r10.next()     // Catch: java.lang.Throwable -> L9b
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> L9b
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch: org.json.JSONException -> L62 java.lang.Throwable -> L9b
            r12.<init>(r11)     // Catch: org.json.JSONException -> L62 java.lang.Throwable -> L9b
            java.lang.String r14 = "purchaseTime"
            long r14 = r12.getLong(r14)     // Catch: org.json.JSONException -> L62 java.lang.Throwable -> L9b
            long r14 = r14 / r8
            long r14 = r6 - r14
            r16 = 1200(0x4b0, double:5.93E-321)
            int r12 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r12 <= 0) goto L84
            r5 = r13
            goto L8a
        L84:
            r0.add(r11)     // Catch: org.json.JSONException -> L62 java.lang.Throwable -> L9b
            int r4 = r4 + 1
            goto L62
        L8a:
            java.lang.String r6 = "INAPP_CONTINUATION_TOKEN"
            java.lang.String r3 = r3.getString(r6)     // Catch: java.lang.Throwable -> L9b
            goto L92
        L91:
            r3 = r1
        L92:
            r6 = 30
            if (r4 >= r6) goto L9a
            if (r3 == 0) goto L9a
            if (r5 == 0) goto L17
        L9a:
            return r0
        L9b:
            r0 = move-exception
            r2 = r18
            c3.a.b(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.i.f(android.content.Context, java.lang.Object, java.lang.String):java.util.ArrayList");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList<java.lang.String> h(android.content.Context r13, java.lang.Object r14, java.lang.String r15) {
        /*
            r12 = this;
            boolean r0 = c3.a.d(r12)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L63
            r0.<init>()     // Catch: java.lang.Throwable -> L63
            if (r14 != 0) goto L10
            return r0
        L10:
            boolean r2 = r12.o(r13, r14, r15)     // Catch: java.lang.Throwable -> L63
            if (r2 == 0) goto L62
            r2 = 0
            r3 = r1
            r4 = r2
        L19:
            r5 = 4
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L63
            r5 = 3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L63
            r11[r2] = r6     // Catch: java.lang.Throwable -> L63
            r6 = 1
            java.lang.String r7 = q2.i.PACKAGE_NAME     // Catch: java.lang.Throwable -> L63
            r11[r6] = r7     // Catch: java.lang.Throwable -> L63
            r6 = 2
            r11[r6] = r15     // Catch: java.lang.Throwable -> L63
            r11[r5] = r3     // Catch: java.lang.Throwable -> L63
            java.lang.String r8 = "com.android.vending.billing.IInAppBillingService"
            java.lang.String r9 = "getPurchases"
            r6 = r12
            r7 = r13
            r10 = r14
            java.lang.Object r3 = r6.n(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L63
            if (r3 == 0) goto L5b
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch: java.lang.Throwable -> L63
            java.lang.String r5 = "RESPONSE_CODE"
            int r5 = r3.getInt(r5)     // Catch: java.lang.Throwable -> L63
            if (r5 != 0) goto L5b
            java.lang.String r5 = "INAPP_PURCHASE_DATA_LIST"
            java.util.ArrayList r5 = r3.getStringArrayList(r5)     // Catch: java.lang.Throwable -> L63
            if (r5 == 0) goto L62
            int r6 = r5.size()     // Catch: java.lang.Throwable -> L63
            int r4 = r4 + r6
            r0.addAll(r5)     // Catch: java.lang.Throwable -> L63
            java.lang.String r5 = "INAPP_CONTINUATION_TOKEN"
            java.lang.String r3 = r3.getString(r5)     // Catch: java.lang.Throwable -> L63
            goto L5c
        L5b:
            r3 = r1
        L5c:
            r5 = 30
            if (r4 >= r5) goto L62
            if (r3 != 0) goto L19
        L62:
            return r0
        L63:
            r13 = move-exception
            c3.a.b(r13, r12)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.i.h(android.content.Context, java.lang.Object, java.lang.String):java.util.ArrayList");
    }

    public final Map<String, String> l(Context context, ArrayList<String> skuList, Object inAppBillingObj, boolean isSubscription) {
        int size;
        if (c3.a.d(this)) {
            return null;
        }
        try {
            Map<String, String> linkedHashMap = new LinkedHashMap<>();
            if (inAppBillingObj != null && !skuList.isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("ITEM_ID_LIST", skuList);
                Object[] objArr = new Object[4];
                int i10 = 0;
                objArr[0] = 3;
                objArr[1] = PACKAGE_NAME;
                objArr[2] = isSubscription ? "subs" : "inapp";
                objArr[3] = bundle;
                Object objN = n(context, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", inAppBillingObj, objArr);
                if (objN != null) {
                    Bundle bundle2 = (Bundle) objN;
                    if (bundle2.getInt("RESPONSE_CODE") == 0) {
                        ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                        if (stringArrayList != null && skuList.size() == stringArrayList.size() && skuList.size() - 1 >= 0) {
                            while (true) {
                                int i11 = i10 + 1;
                                String str = skuList.get(i10);
                                p.j(str, "skuList[i]");
                                String str2 = stringArrayList.get(i10);
                                p.j(str2, "skuDetailsList[i]");
                                linkedHashMap.put(str, str2);
                                if (i11 > size) {
                                    break;
                                }
                                i10 = i11;
                            }
                        }
                        q(linkedHashMap);
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th2) {
            c3.a.b(th2, this);
            return null;
        }
    }

    public final boolean m(@NotNull String skuDetail) {
        if (c3.a.d(this)) {
            return false;
        }
        try {
            p.k(skuDetail, "skuDetail");
            try {
                String strOptString = new JSONObject(skuDetail).optString("freeTrialPeriod");
                if (strOptString != null) {
                    return strOptString.length() > 0;
                }
                return false;
            } catch (JSONException unused) {
                return false;
            }
        } catch (Throwable th2) {
            c3.a.b(th2, this);
            return false;
        }
    }

    public final Object n(Context context, String className, String methodName, Object obj, Object[] args) {
        Method methodE;
        if (c3.a.d(this)) {
            return null;
        }
        try {
            Class<?> clsD = d(context, className);
            if (clsD == null || (methodE = e(clsD, methodName)) == null) {
                return null;
            }
            m mVar = m.f77648a;
            return m.e(clsD, methodE, obj, Arrays.copyOf(args, args.length));
        } catch (Throwable th2) {
            c3.a.b(th2, this);
            return null;
        }
    }

    public final boolean o(Context context, Object inAppBillingObj, String type) {
        if (c3.a.d(this) || inAppBillingObj == null) {
            return false;
        }
        try {
            Object objN = n(context, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", inAppBillingObj, new Object[]{3, PACKAGE_NAME, type});
            if (objN != null) {
                return ((Integer) objN).intValue() == 0;
            }
            return false;
        } catch (Throwable th2) {
            c3.a.b(th2, this);
            return false;
        }
    }

    public final Map<String, String> p(ArrayList<String> skuList) {
        if (c3.a.d(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            for (String str : skuList) {
                String string = skuDetailSharedPrefs.getString(str, null);
                if (string != null) {
                    List listU0 = d0.U0(string, new String[]{";"}, false, 2, 2, null);
                    if (jCurrentTimeMillis - Long.parseLong((String) listU0.get(0)) < 43200) {
                        p.j(str, AppLovinEventParameters.PRODUCT_IDENTIFIER);
                        linkedHashMap.put(str, listU0.get(1));
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th2) {
            c3.a.b(th2, this);
            return null;
        }
    }

    public final void q(Map<String, String> map) {
        if (c3.a.d(this)) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences.Editor editorEdit = skuDetailSharedPrefs.edit();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                editorEdit.putString(entry.getKey(), jCurrentTimeMillis + ';' + entry.getValue());
            }
            editorEdit.apply();
        } catch (Throwable th2) {
            c3.a.b(th2, this);
        }
    }
}
