package io.bidmachine.iab.vast.processor;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import io.bidmachine.iab.vast.VastRequest;
import io.bidmachine.iab.vast.VastSpecError;
import io.bidmachine.iab.vast.VastUrlProcessorRegistry;
import io.bidmachine.iab.vast.tags.AdContentTag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class VastProcessorResult {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private VastAd f69647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private VastSpecError f69648c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f69646a = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f69649d = true;

    public List a() {
        return this.f69646a;
    }

    public void a(VastSpecError vastSpecError) {
        this.f69648c = vastSpecError;
    }

    public void a(VastAd vastAd) {
        this.f69647b = vastAd;
    }

    public void a(AdContentTag adContentTag, VastSpecError vastSpecError) {
        a(vastSpecError);
        Bundle bundle = new Bundle();
        bundle.putInt(VastRequest.PARAMS_ERROR_CODE, vastSpecError.getCode());
        List<String> errorUrlList = adContentTag.getErrorUrlList();
        if (errorUrlList == null || errorUrlList.isEmpty()) {
            return;
        }
        Iterator<String> it = errorUrlList.iterator();
        while (it.hasNext()) {
            String strProcessUrl = VastUrlProcessorRegistry.processUrl(it.next(), bundle);
            if (!TextUtils.isEmpty(strProcessUrl)) {
                this.f69646a.add(strProcessUrl);
            }
        }
    }

    public void a(boolean z10) {
        this.f69649d = z10;
    }

    public boolean b() {
        return this.f69649d;
    }

    @Nullable
    public VastAd getVastAd() {
        return this.f69647b;
    }

    @Nullable
    public VastSpecError getVastSpecError() {
        return this.f69648c;
    }

    public boolean hasVastAd() {
        return this.f69647b != null;
    }
}
