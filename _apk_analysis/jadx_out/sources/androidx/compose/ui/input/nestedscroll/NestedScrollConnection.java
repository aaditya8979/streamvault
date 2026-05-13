package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import hn.c;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NestedScrollModifier.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J%\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0096@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0013\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0096@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012ø\u0001\u0002\u0082\u0002\u0011\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "", "Landroidx/compose/ui/geometry/Offset;", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "onPreScroll-OzD1aCk", "(JI)J", "onPreScroll", "consumed", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "Landroidx/compose/ui/unit/Velocity;", "onPreFling-QWom1Mo", "(JLhn/c;)Ljava/lang/Object;", "onPreFling", "onPostFling-RZ2iAVY", "(JJLhn/c;)Ljava/lang/Object;", "onPostFling", "ui_release"}, k = 1, mv = {1, 6, 0})
public interface NestedScrollConnection {

    /* JADX INFO: compiled from: NestedScrollModifier.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        @Nullable
        /* JADX INFO: renamed from: onPostFling-RZ2iAVY, reason: not valid java name */
        public static Object m2870onPostFlingRZ2iAVY(@NotNull NestedScrollConnection nestedScrollConnection, long j10, long j11, @NotNull c<? super Velocity> cVar) {
            return NestedScrollConnection.super.mo311onPostFlingRZ2iAVY(j10, j11, cVar);
        }

        @Deprecated
        /* JADX INFO: renamed from: onPostScroll-DzOQY0M, reason: not valid java name */
        public static long m2871onPostScrollDzOQY0M(@NotNull NestedScrollConnection nestedScrollConnection, long j10, long j11, int i10) {
            return NestedScrollConnection.super.mo312onPostScrollDzOQY0M(j10, j11, i10);
        }

        @Deprecated
        @Nullable
        /* JADX INFO: renamed from: onPreFling-QWom1Mo, reason: not valid java name */
        public static Object m2872onPreFlingQWom1Mo(@NotNull NestedScrollConnection nestedScrollConnection, long j10, @NotNull c<? super Velocity> cVar) {
            return NestedScrollConnection.super.mo473onPreFlingQWom1Mo(j10, cVar);
        }

        @Deprecated
        /* JADX INFO: renamed from: onPreScroll-OzD1aCk, reason: not valid java name */
        public static long m2873onPreScrollOzD1aCk(@NotNull NestedScrollConnection nestedScrollConnection, long j10, int i10) {
            return NestedScrollConnection.super.mo474onPreScrollOzD1aCk(j10, i10);
        }
    }

    /* JADX INFO: renamed from: onPostFling-RZ2iAVY$suspendImpl, reason: not valid java name */
    static /* synthetic */ Object m2868onPostFlingRZ2iAVY$suspendImpl(NestedScrollConnection nestedScrollConnection, long j10, long j11, c cVar) {
        return Velocity.m4042boximpl(Velocity.INSTANCE.m4062getZero9UxMQ8M());
    }

    /* JADX INFO: renamed from: onPreFling-QWom1Mo$suspendImpl, reason: not valid java name */
    static /* synthetic */ Object m2869onPreFlingQWom1Mo$suspendImpl(NestedScrollConnection nestedScrollConnection, long j10, c cVar) {
        return Velocity.m4042boximpl(Velocity.INSTANCE.m4062getZero9UxMQ8M());
    }

    @Nullable
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    default Object mo311onPostFlingRZ2iAVY(long j10, long j11, @NotNull c<? super Velocity> cVar) {
        return m2868onPostFlingRZ2iAVY$suspendImpl(this, j10, j11, cVar);
    }

    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    default long mo312onPostScrollDzOQY0M(long consumed, long available, int source) {
        return Offset.INSTANCE.m1399getZeroF1C5BW0();
    }

    @Nullable
    /* JADX INFO: renamed from: onPreFling-QWom1Mo */
    default Object mo473onPreFlingQWom1Mo(long j10, @NotNull c<? super Velocity> cVar) {
        return m2869onPreFlingQWom1Mo$suspendImpl(this, j10, cVar);
    }

    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    default long mo474onPreScrollOzD1aCk(long available, int source) {
        return Offset.INSTANCE.m1399getZeroF1C5BW0();
    }
}
