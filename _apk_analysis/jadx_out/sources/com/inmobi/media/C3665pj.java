package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject;
import com.inmobi.media.ads.network.inmobiJson.model.NativeImage;
import com.inmobi.media.ads.network.inmobiJson.model.NativeMedia;

/* JADX INFO: renamed from: com.inmobi.media.pj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3665pj extends AbstractC3826w6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ec f27882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f27883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final NativeImage f27884e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3665pj(Ec ec2, AbstractC3371e1 abstractC3371e1) {
        NativeMedia media;
        NativeMedia media2;
        super(ec2, abstractC3371e1);
        tn.p.k(ec2, "nativeAdUnitComponent");
        tn.p.k(abstractC3371e1, "adSessionManager");
        this.f27882c = ec2;
        JsonAssetObject assetsObject = ec2.f25380b.getAssetsObject();
        NativeImage image = null;
        this.f27883d = (assetsObject == null || (media2 = assetsObject.getMedia()) == null) ? null : media2.getType();
        JsonAssetObject assetsObject2 = ec2.f25380b.getAssetsObject();
        if (assetsObject2 != null && (media = assetsObject2.getMedia()) != null) {
            image = media.getImage();
        }
        this.f27884e = image;
    }

    public final C6 a(Exception exc) {
        NativeImage nativeImage = this.f27884e;
        if (nativeImage == null || !nativeImage.getRequired()) {
            return new B6();
        }
        InterfaceC3580m9 interfaceC3580m9A = a();
        if (interfaceC3580m9A != null) {
            ((C3605n9) interfaceC3580m9A).b("StaticExperienceLoader", "Static Load Failure: " + exc);
        }
        return new C3901z6((short) 2362);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x013c, code lost:
    
        if (r11 == r1) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.ArrayList] */
    @Override // com.inmobi.media.AbstractC3826w6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(hn.c r11) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3665pj.a(hn.c):java.lang.Object");
    }
}
