package com.inmobi.media;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.inmobi.media.core.config.models.TelemetryConfig;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.net.URISyntaxException;
import java.util.List;

/* JADX INFO: renamed from: com.inmobi.media.l5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC3551l5 {
    public static int a(Context context, String str, ResolveInfo resolveInfo, InterfaceC3613nh interfaceC3613nh, String str2, InterfaceC3580m9 interfaceC3580m9) {
        try {
            return AbstractC3848x3.a(context, str, resolveInfo, interfaceC3613nh, str2);
        } catch (ActivityNotFoundException unused) {
            if (interfaceC3580m9 != null) {
                ((C3605n9) interfaceC3580m9).b("DeeplinkHandler", "ActivityNotFoundException for url: " + str);
            }
            return 6;
        } catch (NullPointerException unused2) {
            if (interfaceC3580m9 != null) {
                ((C3605n9) interfaceC3580m9).b("DeeplinkHandler", "NullPointerException for url: " + str);
            }
            return 13;
        } catch (SecurityException unused3) {
            if (interfaceC3580m9 != null) {
                ((C3605n9) interfaceC3580m9).b("DeeplinkHandler", "SecurityException for url: " + str);
            }
            return 12;
        } catch (URISyntaxException unused4) {
            if (interfaceC3580m9 != null) {
                ((C3605n9) interfaceC3580m9).b("DeeplinkHandler", "URISyntaxException for url: " + str);
            }
            return 5;
        } catch (Exception e10) {
            if (interfaceC3580m9 != null) {
                ((C3605n9) interfaceC3580m9).b("DeeplinkHandler", "Exception: " + e10);
            }
            return 9;
        }
    }

    public static int a(Context context, String str, InterfaceC3613nh interfaceC3613nh, String str2, InterfaceC3580m9 interfaceC3580m9) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(str, "url");
        tn.p.k(interfaceC3613nh, "redirectionValidator");
        tn.p.k(str2, "api");
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).c("DeeplinkHandler", "In appLinkOrDeepLinkHandled");
        }
        if (str.length() == 0) {
            if (interfaceC3580m9 == null) {
                return 2;
            }
            ((C3605n9) interfaceC3580m9).c("DeeplinkHandler", "AppLink url is Empty or null");
            return 2;
        }
        try {
            List listA = AbstractC3848x3.a(context, str);
            if (listA.isEmpty()) {
                if (interfaceC3580m9 != null) {
                    ((C3605n9) interfaceC3580m9).c("DeeplinkHandler", " Resolve Info Empty");
                }
                return b(context, str, interfaceC3613nh, str2, interfaceC3580m9);
            }
            if (interfaceC3580m9 != null) {
                ((C3605n9) interfaceC3580m9).c("DeeplinkHandler", "Resolve Info " + ((ResolveInfo) listA.get(0)).activityInfo.name);
            }
            return a(context, str, (ResolveInfo) listA.get(0), interfaceC3613nh, str2, interfaceC3580m9);
        } catch (URISyntaxException unused) {
            if (interfaceC3580m9 == null) {
                return 5;
            }
            ((C3605n9) interfaceC3580m9).b("DeeplinkHandler", "URISyntaxException for url: " + str);
            return 5;
        }
    }

    public static boolean a(String str, Context context, InterfaceC3613nh interfaceC3613nh, InterfaceC3580m9 interfaceC3580m9) {
        tn.p.k(str, "url");
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(interfaceC3613nh, "redirectionValidator");
        C3850x5.f28483a.getClass();
        if (!C3850x5.r() || !interfaceC3613nh.a()) {
            return false;
        }
        C3476i4 c3476i4 = Y3.f26611a;
        tn.p.k(TelemetryConfig.class, "clazz");
        if (!((TelemetryConfig) Y3.f26611a.a(TelemetryConfig.class)).getLpConfig().getUniversalLinkEnabled()) {
            return false;
        }
        try {
            Uri uri = Uri.parse(str);
            tn.p.j(uri, "Uri.parse(this)");
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            tn.p.k(intent, "<this>");
            intent.addCategory("android.intent.category.BROWSABLE");
            tn.p.k(intent, "<this>");
            intent.setFlags(268436992);
            tn.p.k(intent, "<this>");
            tn.p.k(context, GAMConfig.KEY_CONTEXT);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
            if (interfaceC3580m9 == null) {
                return true;
            }
            ((C3605n9) interfaceC3580m9).a("DeeplinkHandler", "openDefaultApplication: SUCCESS");
            return true;
        } catch (ActivityNotFoundException unused) {
            if (interfaceC3580m9 != null) {
                ((C3605n9) interfaceC3580m9).b("DeeplinkHandler", "openDefaultApplication: ActivityNotFoundException");
            }
            return false;
        } catch (NullPointerException unused2) {
            if (interfaceC3580m9 != null) {
                ((C3605n9) interfaceC3580m9).b("DeeplinkHandler", "openDefaultApplication: NullPointerException");
            }
            return false;
        }
    }

    public static int b(Context context, String str, InterfaceC3613nh interfaceC3613nh, String str2, InterfaceC3580m9 interfaceC3580m9) {
        try {
            return AbstractC3848x3.a(context, str, interfaceC3613nh, str2);
        } catch (ActivityNotFoundException unused) {
            return a(context, str, null, interfaceC3613nh, str2, interfaceC3580m9);
        } catch (NullPointerException unused2) {
            return a(context, str, null, interfaceC3613nh, str2, interfaceC3580m9);
        } catch (SecurityException unused3) {
            if (interfaceC3580m9 != null) {
                ((C3605n9) interfaceC3580m9).b("DeeplinkHandler", "SecurityException");
            }
            return 12;
        } catch (URISyntaxException unused4) {
            if (interfaceC3580m9 != null) {
                ((C3605n9) interfaceC3580m9).b("DeeplinkHandler", "uriSyntaxException");
            }
            return 5;
        } catch (Exception e10) {
            if (interfaceC3580m9 != null) {
                ((C3605n9) interfaceC3580m9).b("DeeplinkHandler", "Exception: " + e10);
            }
            return 9;
        }
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context context, Intent intent) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (intent == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(intent, com.safedk.android.utils.g.f53135i);
        context.startActivity(intent);
    }
}
