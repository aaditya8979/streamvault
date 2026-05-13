package hi;

import io.bidmachine.iab.vast.tags.VastAttributes;
import io.bidmachine.iab.vast.tags.VastXmlTag;

/* JADX INFO: loaded from: classes11.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f63502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f63503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f63504c;

    public a() {
        this(true, true, true);
    }

    public a(VastXmlTag vastXmlTag) {
        this(vastXmlTag.getBooleanAttributeValueByName(VastAttributes.FOLLOW_ADDITIONAL_WRAPPERS, true), vastXmlTag.getBooleanAttributeValueByName(VastAttributes.ALLOW_MULTIPLE_ADS, true), vastXmlTag.getBooleanAttributeValueByName(VastAttributes.FALLBACK_ON_NO_AD, true));
    }

    private a(boolean z10, boolean z11, boolean z12) {
        this.f63502a = z10;
        this.f63503b = z11;
        this.f63504c = z12;
    }

    public boolean a() {
        return this.f63503b;
    }

    public boolean b() {
        return this.f63504c;
    }

    public boolean c() {
        return this.f63502a;
    }
}
