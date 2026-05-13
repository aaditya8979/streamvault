package androidx.compose.foundation;

import kotlin.Metadata;

/* JADX INFO: compiled from: PlatformMagnifier.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J-\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u0002H&R\u001d\u0010\u0010\u001a\u00020\r8&X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/PlatformMagnifier;", "", "Lbn/r;", "updateContent", "Landroidx/compose/ui/geometry/Offset;", "sourceCenter", "magnifierCenter", "", "zoom", "update-Wko1d7g", "(JJF)V", "update", "dismiss", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "()J", "size", "foundation_release"}, k = 1, mv = {1, 6, 0})
public interface PlatformMagnifier {
    void dismiss();

    /* JADX INFO: renamed from: getSize-YbymL2g, reason: not valid java name */
    long mo234getSizeYbymL2g();

    /* JADX INFO: renamed from: update-Wko1d7g, reason: not valid java name */
    void mo235updateWko1d7g(long sourceCenter, long magnifierCenter, float zoom);

    void updateContent();
}
