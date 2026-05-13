package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.input.pointer.PointerInputModifier;
import androidx.compose.ui.layout.OnPlacedModifier;
import androidx.compose.ui.layout.OnRemeasuredModifier;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.semantics.SemanticsEntity;
import androidx.compose.ui.semantics.SemanticsModifier;
import bn.r;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.Arrays;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: EntityList.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\t\b\u0081@\u0018\u0000 ;2\u00020\u0001:\u0002;<B$\u0012\u0018\b\u0002\u00105\u001a\u0012\u0012\u000e\u0012\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\f04ø\u0001\u0000¢\u0006\u0004\b9\u0010:J\u001d\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ3\u0010\u0013\u001a\u00020\u0006\"\u0012\b\u0000\u0010\r*\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\f2\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012JI\u0010\u0019\u001a\u0004\u0018\u00018\u0000\"\u0014\b\u0000\u0010\r*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\"\b\b\u0001\u0010\u0014*\u00020\u00042\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0015ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001d\u001a\u00020\u001a2\u000e\u0010\u0016\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0015ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010 \u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010%\u001a\u00020\u00062\u001a\u0010\"\u001a\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\f\u0012\u0004\u0012\u00020\u00060!H\u0086\bø\u0001\u0002¢\u0006\u0004\b#\u0010$Ja\u0010%\u001a\u00020\u0006\"\u0014\b\u0000\u0010\r*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\"\b\b\u0001\u0010\u0014*\u00020\u00042\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00152\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060!H\u0086\bø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b&\u0010'JR\u0010%\u001a\u00020\u0006\"\u0014\b\u0000\u0010\r*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\"\b\b\u0001\u0010\u0014*\u00020\u0004*\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\f2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060!H\u0082\b¢\u0006\u0004\b#\u0010(J\u0010\u0010,\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010/\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00103\u001a\u00020\u001a2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102R'\u00105\u001a\u0012\u0012\u000e\u0012\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\f048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108\u0088\u00015\u0092\u0001\u0012\u0012\u000e\u0012\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\f04ø\u0001\u0000\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0005\b\u009920\u0001¨\u0006="}, d2 = {"Landroidx/compose/ui/node/EntityList;", "", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "layoutNodeWrapper", "Landroidx/compose/ui/Modifier;", "modifier", "Lbn/r;", "addBeforeLayoutModifier-impl", "([Landroidx/compose/ui/node/LayoutNodeEntity;Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/Modifier;)V", "addBeforeLayoutModifier", "addAfterLayoutModifier-impl", "addAfterLayoutModifier", "Landroidx/compose/ui/node/LayoutNodeEntity;", "T", "entity", "", "index", "add-impl", "([Landroidx/compose/ui/node/LayoutNodeEntity;Landroidx/compose/ui/node/LayoutNodeEntity;I)V", ImpressionLog.f51742l, "M", "Landroidx/compose/ui/node/EntityList$EntityType;", "entityType", "head-0OSVbXo", "([Landroidx/compose/ui/node/LayoutNodeEntity;I)Landroidx/compose/ui/node/LayoutNodeEntity;", "head", "", "has-0OSVbXo", "([Landroidx/compose/ui/node/LayoutNodeEntity;I)Z", "has", "clear-impl", "([Landroidx/compose/ui/node/LayoutNodeEntity;)V", "clear", "Lkotlin/Function1;", "block", "forEach-impl", "([Landroidx/compose/ui/node/LayoutNodeEntity;Lsn/l;)V", "forEach", "forEach-9r0pUL4", "([Landroidx/compose/ui/node/LayoutNodeEntity;ILsn/l;)V", "([Landroidx/compose/ui/node/LayoutNodeEntity;Landroidx/compose/ui/node/LayoutNodeEntity;Lsn/l;)V", "", "toString-impl", "([Landroidx/compose/ui/node/LayoutNodeEntity;)Ljava/lang/String;", "toString", "hashCode-impl", "([Landroidx/compose/ui/node/LayoutNodeEntity;)I", "hashCode", "other", "equals-impl", "([Landroidx/compose/ui/node/LayoutNodeEntity;Ljava/lang/Object;)Z", "equals", "", "entities", "[Landroidx/compose/ui/node/LayoutNodeEntity;", "getEntities", "()[Landroidx/compose/ui/node/LayoutNodeEntity;", "constructor-impl", "([Landroidx/compose/ui/node/LayoutNodeEntity;)[Landroidx/compose/ui/node/LayoutNodeEntity;", VastTagName.COMPANION, "EntityType", "ui_release"}, k = 1, mv = {1, 6, 0})
public final class EntityList {
    private static final int TypeCount = 6;

    @NotNull
    private final LayoutNodeEntity<?, ?>[] entities;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int DrawEntityType = EntityType.m3225constructorimpl(0);
    private static final int PointerInputEntityType = EntityType.m3225constructorimpl(1);
    private static final int SemanticsEntityType = EntityType.m3225constructorimpl(2);
    private static final int ParentDataEntityType = EntityType.m3225constructorimpl(3);
    private static final int OnPlacedEntityType = EntityType.m3225constructorimpl(4);
    private static final int RemeasureEntityType = EntityType.m3225constructorimpl(5);

    /* JADX INFO: compiled from: EntityList.kt */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R(\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR4\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\f0\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\t\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\bR.\u0010\u000f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000b\u0012\u0004\u0012\u00020\u00100\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0011\u0010\bR(\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0015\u0010\bR.\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u000b\u0012\u0004\u0012\u00020\u00170\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0018\u0010\bR(\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u001c\u0010\bR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/node/EntityList$Companion;", "", "()V", "DrawEntityType", "Landroidx/compose/ui/node/EntityList$EntityType;", "Landroidx/compose/ui/node/DrawEntity;", "Landroidx/compose/ui/draw/DrawModifier;", "getDrawEntityType-EEbPh1w", "()I", "I", "OnPlacedEntityType", "Landroidx/compose/ui/node/SimpleEntity;", "Landroidx/compose/ui/layout/OnPlacedModifier;", "getOnPlacedEntityType-EEbPh1w$annotations", "getOnPlacedEntityType-EEbPh1w", "ParentDataEntityType", "Landroidx/compose/ui/layout/ParentDataModifier;", "getParentDataEntityType-EEbPh1w", "PointerInputEntityType", "Landroidx/compose/ui/node/PointerInputEntity;", "Landroidx/compose/ui/input/pointer/PointerInputModifier;", "getPointerInputEntityType-EEbPh1w", "RemeasureEntityType", "Landroidx/compose/ui/layout/OnRemeasuredModifier;", "getRemeasureEntityType-EEbPh1w", "SemanticsEntityType", "Landroidx/compose/ui/semantics/SemanticsEntity;", "Landroidx/compose/ui/semantics/SemanticsModifier;", "getSemanticsEntityType-EEbPh1w", "TypeCount", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        /* JADX INFO: renamed from: getOnPlacedEntityType-EEbPh1w$annotations, reason: not valid java name */
        public static /* synthetic */ void m3217getOnPlacedEntityTypeEEbPh1w$annotations() {
        }

        /* JADX INFO: renamed from: getDrawEntityType-EEbPh1w, reason: not valid java name */
        public final int m3218getDrawEntityTypeEEbPh1w() {
            return EntityList.DrawEntityType;
        }

        /* JADX INFO: renamed from: getOnPlacedEntityType-EEbPh1w, reason: not valid java name */
        public final int m3219getOnPlacedEntityTypeEEbPh1w() {
            return EntityList.OnPlacedEntityType;
        }

        /* JADX INFO: renamed from: getParentDataEntityType-EEbPh1w, reason: not valid java name */
        public final int m3220getParentDataEntityTypeEEbPh1w() {
            return EntityList.ParentDataEntityType;
        }

        /* JADX INFO: renamed from: getPointerInputEntityType-EEbPh1w, reason: not valid java name */
        public final int m3221getPointerInputEntityTypeEEbPh1w() {
            return EntityList.PointerInputEntityType;
        }

        /* JADX INFO: renamed from: getRemeasureEntityType-EEbPh1w, reason: not valid java name */
        public final int m3222getRemeasureEntityTypeEEbPh1w() {
            return EntityList.RemeasureEntityType;
        }

        /* JADX INFO: renamed from: getSemanticsEntityType-EEbPh1w, reason: not valid java name */
        public final int m3223getSemanticsEntityTypeEEbPh1w() {
            return EntityList.SemanticsEntityType;
        }
    }

    /* JADX INFO: compiled from: EntityList.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u0000*\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\u0012\u0012\u0006\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0012\u0010\tJ\u0010\u0010\u0013\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0088\u0001\u0006ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/node/EntityList$EntityType;", "T", "Landroidx/compose/ui/node/LayoutNodeEntity;", "M", "Landroidx/compose/ui/Modifier;", "", "index", "", "constructor-impl", "(I)I", "getIndex", "()I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class EntityType<T extends LayoutNodeEntity<T, M>, M extends Modifier> {
        private final int index;

        private /* synthetic */ EntityType(int i10) {
            this.index = i10;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ EntityType m3224boximpl(int i10) {
            return new EntityType(i10);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static <T extends LayoutNodeEntity<T, M>, M extends Modifier> int m3225constructorimpl(int i10) {
            return i10;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m3226equalsimpl(int i10, Object obj) {
            return (obj instanceof EntityType) && i10 == ((EntityType) obj).m3230unboximpl();
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m3227equalsimpl0(int i10, int i11) {
            return i10 == i11;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m3228hashCodeimpl(int i10) {
            return Integer.hashCode(i10);
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m3229toStringimpl(int i10) {
            return "EntityType(index=" + i10 + ')';
        }

        public boolean equals(Object obj) {
            return m3226equalsimpl(this.index, obj);
        }

        public final int getIndex() {
            return this.index;
        }

        public int hashCode() {
            return m3228hashCodeimpl(this.index);
        }

        public String toString() {
            return m3229toStringimpl(this.index);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m3230unboximpl() {
            return this.index;
        }
    }

    private /* synthetic */ EntityList(LayoutNodeEntity[] layoutNodeEntityArr) {
        this.entities = layoutNodeEntityArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: add-impl, reason: not valid java name */
    private static final <T extends LayoutNodeEntity<T, ?>> void m3200addimpl(LayoutNodeEntity<?, ?>[] layoutNodeEntityArr, T t10, int i10) {
        t10.setNext(layoutNodeEntityArr[i10]);
        layoutNodeEntityArr[i10] = t10;
    }

    /* JADX INFO: renamed from: addAfterLayoutModifier-impl, reason: not valid java name */
    public static final void m3201addAfterLayoutModifierimpl(LayoutNodeEntity<?, ?>[] layoutNodeEntityArr, @NotNull LayoutNodeWrapper layoutNodeWrapper, @NotNull Modifier modifier) {
        p.k(layoutNodeWrapper, "layoutNodeWrapper");
        p.k(modifier, "modifier");
        if (modifier instanceof OnPlacedModifier) {
            m3200addimpl(layoutNodeEntityArr, new SimpleEntity(layoutNodeWrapper, modifier), OnPlacedEntityType);
        }
        if (modifier instanceof OnRemeasuredModifier) {
            m3200addimpl(layoutNodeEntityArr, new SimpleEntity(layoutNodeWrapper, modifier), RemeasureEntityType);
        }
    }

    /* JADX INFO: renamed from: addBeforeLayoutModifier-impl, reason: not valid java name */
    public static final void m3202addBeforeLayoutModifierimpl(LayoutNodeEntity<?, ?>[] layoutNodeEntityArr, @NotNull LayoutNodeWrapper layoutNodeWrapper, @NotNull Modifier modifier) {
        p.k(layoutNodeWrapper, "layoutNodeWrapper");
        p.k(modifier, "modifier");
        if (modifier instanceof DrawModifier) {
            m3200addimpl(layoutNodeEntityArr, new DrawEntity(layoutNodeWrapper, (DrawModifier) modifier), DrawEntityType);
        }
        if (modifier instanceof PointerInputModifier) {
            m3200addimpl(layoutNodeEntityArr, new PointerInputEntity(layoutNodeWrapper, (PointerInputModifier) modifier), PointerInputEntityType);
        }
        if (modifier instanceof SemanticsModifier) {
            m3200addimpl(layoutNodeEntityArr, new SemanticsEntity(layoutNodeWrapper, (SemanticsModifier) modifier), SemanticsEntityType);
        }
        if (modifier instanceof ParentDataModifier) {
            m3200addimpl(layoutNodeEntityArr, new SimpleEntity(layoutNodeWrapper, modifier), ParentDataEntityType);
        }
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ EntityList m3203boximpl(LayoutNodeEntity[] layoutNodeEntityArr) {
        return new EntityList(layoutNodeEntityArr);
    }

    /* JADX INFO: renamed from: clear-impl, reason: not valid java name */
    public static final void m3204clearimpl(LayoutNodeEntity<?, ?>[] layoutNodeEntityArr) {
        for (LayoutNodeEntity<?, ?> next : layoutNodeEntityArr) {
            for (; next != null; next = next.getNext()) {
                if (next.getIsAttached()) {
                    next.onDetach();
                }
            }
        }
        int length = layoutNodeEntityArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            layoutNodeEntityArr[i10] = null;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static LayoutNodeEntity<?, ?>[] m3205constructorimpl(@NotNull LayoutNodeEntity<?, ?>[] layoutNodeEntityArr) {
        p.k(layoutNodeEntityArr, "entities");
        return layoutNodeEntityArr;
    }

    /* JADX INFO: renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ LayoutNodeEntity[] m3206constructorimpl$default(LayoutNodeEntity[] layoutNodeEntityArr, int i10, i iVar) {
        if ((i10 & 1) != 0) {
            layoutNodeEntityArr = new LayoutNodeEntity[6];
        }
        return m3205constructorimpl(layoutNodeEntityArr);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3207equalsimpl(LayoutNodeEntity<?, ?>[] layoutNodeEntityArr, Object obj) {
        return (obj instanceof EntityList) && p.f(layoutNodeEntityArr, ((EntityList) obj).getEntities());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3208equalsimpl0(LayoutNodeEntity<?, ?>[] layoutNodeEntityArr, LayoutNodeEntity<?, ?>[] layoutNodeEntityArr2) {
        return p.f(layoutNodeEntityArr, layoutNodeEntityArr2);
    }

    /* JADX INFO: renamed from: forEach-9r0pUL4, reason: not valid java name */
    public static final <T extends LayoutNodeEntity<T, M>, M extends Modifier> void m3209forEach9r0pUL4(LayoutNodeEntity<?, ?>[] layoutNodeEntityArr, int i10, @NotNull l<? super T, r> lVar) {
        p.k(lVar, "block");
        for (LayoutNodeEntity<?, ?> next = layoutNodeEntityArr[i10]; next != null; next = next.getNext()) {
            lVar.invoke(next);
        }
    }

    /* JADX INFO: renamed from: forEach-impl, reason: not valid java name */
    private static final <T extends LayoutNodeEntity<T, M>, M extends Modifier> void m3210forEachimpl(LayoutNodeEntity<?, ?>[] layoutNodeEntityArr, LayoutNodeEntity<?, ?> layoutNodeEntity, l<? super T, r> lVar) {
        while (layoutNodeEntity != null) {
            lVar.invoke(layoutNodeEntity);
            layoutNodeEntity = layoutNodeEntity.getNext();
        }
    }

    /* JADX INFO: renamed from: forEach-impl, reason: not valid java name */
    public static final void m3211forEachimpl(LayoutNodeEntity<?, ?>[] layoutNodeEntityArr, @NotNull l<? super LayoutNodeEntity<?, ?>, r> lVar) {
        p.k(lVar, "block");
        for (LayoutNodeEntity<?, ?> next : layoutNodeEntityArr) {
            for (; next != null; next = next.getNext()) {
                lVar.invoke(next);
            }
        }
    }

    /* JADX INFO: renamed from: has-0OSVbXo, reason: not valid java name */
    public static final boolean m3212has0OSVbXo(LayoutNodeEntity<?, ?>[] layoutNodeEntityArr, int i10) {
        return layoutNodeEntityArr[i10] != null;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3213hashCodeimpl(LayoutNodeEntity<?, ?>[] layoutNodeEntityArr) {
        return Arrays.hashCode(layoutNodeEntityArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: head-0OSVbXo, reason: not valid java name */
    public static final <T extends LayoutNodeEntity<T, M>, M extends Modifier> T m3214head0OSVbXo(LayoutNodeEntity<?, ?>[] layoutNodeEntityArr, int i10) {
        return (T) layoutNodeEntityArr[i10];
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3215toStringimpl(LayoutNodeEntity<?, ?>[] layoutNodeEntityArr) {
        return "EntityList(entities=" + Arrays.toString(layoutNodeEntityArr) + ')';
    }

    public boolean equals(Object obj) {
        return m3207equalsimpl(this.entities, obj);
    }

    @NotNull
    public final LayoutNodeEntity<?, ?>[] getEntities() {
        return this.entities;
    }

    public int hashCode() {
        return m3213hashCodeimpl(this.entities);
    }

    public String toString() {
        return m3215toStringimpl(this.entities);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ LayoutNodeEntity[] getEntities() {
        return this.entities;
    }
}
