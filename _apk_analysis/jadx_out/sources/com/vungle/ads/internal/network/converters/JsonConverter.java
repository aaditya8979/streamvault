package com.vungle.ads.internal.network.converters;

import androidx.exifinterface.media.ExifInterface;
import bn.r;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.reflect.KType;
import okhttp3.ResponseBody;
import on.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import so.t;
import tn.p;
import xo.a;
import xo.d;
import xo.u;

/* JADX INFO: compiled from: JsonConverter.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \n*\u0004\b\u0000\u0010\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\nB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u0004\u0018\u00018\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0002\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/vungle/ads/internal/network/converters/JsonConverter;", ExifInterface.LONGITUDE_EAST, "Lcom/vungle/ads/internal/network/converters/Converter;", "Lokhttp3/ResponseBody;", "kType", "Lkotlin/reflect/KType;", "(Lkotlin/reflect/KType;)V", "convert", "responseBody", "(Lokhttp3/ResponseBody;)Ljava/lang/Object;", VastTagName.COMPANION, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class JsonConverter<E> implements Converter<ResponseBody, E> {

    @NotNull
    private static final a json = u.b(null, new l<d, r>() { // from class: com.vungle.ads.internal.network.converters.JsonConverter$Companion$json$1
        @Override // sn.l
        public /* bridge */ /* synthetic */ r invoke(d dVar) {
            invoke2(dVar);
            return r.f5635a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull d dVar) {
            p.k(dVar, "$this$Json");
            dVar.f(true);
            dVar.d(true);
            dVar.e(false);
            dVar.c(true);
        }
    }, 1, null);

    @NotNull
    private final KType kType;

    public JsonConverter(@NotNull KType kType) {
        p.k(kType, "kType");
        this.kType = kType;
    }

    @Override // com.vungle.ads.internal.network.converters.Converter
    @Nullable
    public E convert(@Nullable ResponseBody responseBody) throws IOException {
        if (responseBody != null) {
            try {
                String strString = responseBody.string();
                if (strString != null) {
                    E e10 = (E) json.c(t.b(a.f87008d.a(), this.kType), strString);
                    b.a(responseBody, null);
                    return e10;
                }
            } finally {
            }
        }
        b.a(responseBody, null);
        return null;
    }
}
