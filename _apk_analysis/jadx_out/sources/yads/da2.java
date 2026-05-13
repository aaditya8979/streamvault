package yads;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes4.dex */
public abstract class da2 {
    public static md3 a(gd3 gd3Var) {
        ae1 ae1Var = gd3Var.f89953b;
        if (ae1Var == null || !tn.p.f(ae1Var.f87670b, CampaignEx.KEY_OMID)) {
            throw new id3(gd3Var, hd3.f90366c);
        }
        try {
            URL url = new URL(ae1Var.f87671c);
            String str = gd3Var.f89952a;
            String str2 = gd3Var.f89954c;
            if (str2 == null || str2.length() == 0) {
                return new md3(null, url, null);
            }
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("VendorKey is null or empty");
            }
            if (TextUtils.isEmpty(str2)) {
                throw new IllegalArgumentException("VerificationParameters is null or empty");
            }
            return new md3(str, url, str2);
        } catch (MalformedURLException unused) {
            throw new id3(gd3Var, hd3.f90367d);
        }
    }
}
