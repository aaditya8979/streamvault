package ql;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: PipelinePhaseRelation.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class h {

    /* JADX INFO: compiled from: PipelinePhaseRelation.kt */
    public static final class a extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final g f78340a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull g gVar) {
            super(null);
            p.k(gVar, "relativeTo");
            this.f78340a = gVar;
        }

        @NotNull
        public final g a() {
            return this.f78340a;
        }
    }

    /* JADX INFO: compiled from: PipelinePhaseRelation.kt */
    public static final class b extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final g f78341a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull g gVar) {
            super(null);
            p.k(gVar, "relativeTo");
            this.f78341a = gVar;
        }
    }

    /* JADX INFO: compiled from: PipelinePhaseRelation.kt */
    public static final class c extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f78342a = new c();

        public c() {
            super(null);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 967869129;
        }

        @NotNull
        public String toString() {
            return "Last";
        }
    }

    public h() {
    }

    public /* synthetic */ h(tn.i iVar) {
        this();
    }
}
