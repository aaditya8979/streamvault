package com.inmobi.media;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.inmobi.media.C3764tj;
import com.inmobi.media.ads.network.inmobiJson.model.Image;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.squareup.picasso.Picasso;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: renamed from: com.inmobi.media.tj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3764tj extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f28194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f28195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3839wj f28196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ref$BooleanRef f28197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ImageView f28198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Bitmap.Config f28199f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3764tj(List list, C3839wj c3839wj, Ref$BooleanRef ref$BooleanRef, ImageView imageView, Bitmap.Config config, hn.c cVar) {
        super(2, cVar);
        this.f28195b = list;
        this.f28196c = c3839wj;
        this.f28197d = ref$BooleanRef;
        this.f28198e = imageView;
        this.f28199f = config;
    }

    public static final void a(C3839wj c3839wj, ImageView imageView, Pair pair) {
        C3605n9 c3605n9 = c3839wj.f28459e;
        if (c3605n9 != null) {
            c3605n9.a("StaticExperienceManager", "loadImagesIntoImageView - setting bitmap to ImageView");
        }
        c3839wj.a(imageView, (Image) pair.getSecond());
        imageView.setImageBitmap((Bitmap) pair.getFirst());
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        C3764tj c3764tj = new C3764tj(this.f28195b, this.f28196c, this.f28197d, this.f28198e, this.f28199f, cVar);
        c3764tj.f28194a = obj;
        return c3764tj;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((C3764tj) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws C3357dc {
        final Pair pair;
        Object objM7534constructorimpl;
        in.a.g();
        kotlin.c.b(obj);
        List list = this.f28195b;
        C3839wj c3839wj = this.f28196c;
        Bitmap.Config config = this.f28199f;
        Ref$BooleanRef ref$BooleanRef = this.f28197d;
        Iterator it = list.iterator();
        do {
            pair = null;
            if (!it.hasNext()) {
                break;
            }
            Image image = (Image) it.next();
            C3605n9 c3605n9 = c3839wj.f28459e;
            if (c3605n9 != null) {
                c3605n9.a("StaticExperienceManager", "loadImagesIntoImageView - trying to load image from URL: " + image.getUrl());
            }
            try {
                Result.a aVar = Result.Companion;
                Picasso picasso = Qf.f26183a;
                objM7534constructorimpl = Result.m7534constructorimpl(Qf.b(c3839wj.f27375a).load(image.getUrl()).tag(c3839wj.f28460f).transform(new Lf(config)).get());
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
            }
            Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(objM7534constructorimpl);
            if (thM7537exceptionOrNullimpl != null) {
                C3605n9 c3605n92 = c3839wj.f28459e;
                if (c3605n92 != null) {
                    c3605n92.a("StaticExperienceManager", "Bitmap Failure " + image.getUrl() + com.ironsource.Z7.f30794r + thM7537exceptionOrNullimpl.getMessage());
                }
                if (thM7537exceptionOrNullimpl instanceof C3278ab) {
                    ref$BooleanRef.element = true;
                }
            }
            if (Result.m7539isFailureimpl(objM7534constructorimpl)) {
                objM7534constructorimpl = null;
            }
            Bitmap bitmap = (Bitmap) objM7534constructorimpl;
            if (bitmap != null) {
                pair = new Pair(bitmap, image);
            }
        } while (pair == null);
        if (pair != null) {
            final ImageView imageView = this.f28198e;
            final C3839wj c3839wj2 = this.f28196c;
            return jn.a.a(imageView.post(new Runnable() { // from class: n9.ha
                @Override // java.lang.Runnable
                public final void run() {
                    C3764tj.a(c3839wj2, imageView, pair);
                }
            }));
        }
        C3605n9 c3605n93 = this.f28196c.f28459e;
        if (c3605n93 != null) {
            c3605n93.b("StaticExperienceManager", "Bitmap Load Failure - no images could be loaded");
        }
        C3839wj c3839wj3 = this.f28196c;
        boolean z10 = this.f28197d.element;
        c3839wj3.getClass();
        short s10 = z10 ? (short) 81 : (short) 82;
        Map mapC = kotlin.collections.a.C(AbstractC3491ik.a(c3839wj3.f28457c.f28533b.f25332a));
        mapC.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s10));
        Wj wj2 = Wj.f26549a;
        Wj.b("MainImageLoadFailure", mapC, EnumC3287ak.f26805a);
        throw new C3357dc();
    }
}
