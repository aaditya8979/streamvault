package sg.bigo.ads.api.core;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final b f81860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final sg.bigo.ads.api.a.l f81861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final sg.bigo.ads.api.b f81862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public sg.bigo.ads.common.g f81863d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f81864e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f81865f;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public sg.bigo.ads.common.g f81866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        private final b f81867b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        private final sg.bigo.ads.api.a.l f81868c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NonNull
        private final sg.bigo.ads.api.b f81869d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NonNull
        private final Context f81870e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Context f81871f;

        public a(@NonNull b bVar, @NonNull sg.bigo.ads.api.a.l lVar, @NonNull sg.bigo.ads.api.b bVar2, @NonNull Context context, @NonNull Context context2) {
            this.f81867b = bVar;
            this.f81868c = lVar;
            this.f81869d = bVar2;
            this.f81870e = context;
            this.f81871f = context2;
        }

        public final f a() {
            f fVar = new f(this.f81867b, this.f81868c, this.f81869d, this.f81870e, this.f81871f, (byte) 0);
            fVar.f81863d = this.f81866a;
            return fVar;
        }
    }

    private f(@NonNull b bVar, @NonNull sg.bigo.ads.api.a.l lVar, @NonNull sg.bigo.ads.api.b bVar2, @NonNull Context context, @NonNull Context context2) {
        this.f81860a = bVar;
        this.f81861b = lVar;
        this.f81862c = bVar2;
        this.f81864e = context;
        this.f81865f = context2;
    }

    public /* synthetic */ f(b bVar, sg.bigo.ads.api.a.l lVar, sg.bigo.ads.api.b bVar2, Context context, Context context2, byte b10) {
        this(bVar, lVar, bVar2, context, context2);
    }

    public final f a(b bVar) {
        f fVar = new f(bVar, this.f81861b, this.f81862c, this.f81864e, this.f81865f);
        fVar.f81863d = this.f81863d;
        return fVar;
    }
}
