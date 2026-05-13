package di;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.protobuf.adcom.Ad;
import io.bidmachine.models.AdObjectParams;
import io.bidmachine.unified.UnifiedMediationParams;

/* JADX INFO: compiled from: IabAdObjectParams.java */
/* JADX INFO: loaded from: classes3.dex */
public class h extends AdObjectParams {
    public h(@NonNull Ad ad2) {
        super(ad2);
        getData().put("creativeId", ad2.getId());
    }

    @Override // io.bidmachine.models.AdObjectParams
    public boolean isValid() {
        Object obj = getData().get(UnifiedMediationParams.KEY_CREATIVE_ADM);
        return (obj instanceof CharSequence) && !TextUtils.isEmpty((CharSequence) obj);
    }

    public void setCreativeAdm(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        getData().put(UnifiedMediationParams.KEY_CREATIVE_ADM, str);
    }
}
