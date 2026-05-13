package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionData;
import androidx.exifinterface.media.ExifInterface;
import bn.r;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.squareup.picasso.Utils;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;
import tn.p;

/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\f\n\u0002\u0010\u0005\n\u0002\u0010\n\n\u0002\u0010\u0007\n\u0002\u0010\t\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 w2\u00020\u0001:\u0001wJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\b\u0010\u0006\u001a\u00020\u0004H'J\u001a\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H'J\b\u0010\t\u001a\u00020\u0004H'J\b\u0010\n\u001a\u00020\u0004H'J\b\u0010\u000b\u001a\u00020\u0004H'J\u0010\u0010\f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'J\n\u0010\u000e\u001a\u0004\u0018\u00010\rH'J\u001e\u0010\u0012\u001a\u00020\u00042\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H'J$\u0010\u0017\u001a\u00020\u00042\u001a\u0010\u0016\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00140\u0013H'J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H&J\u0018\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H&J\b\u0010\u001b\u001a\u00020\u0004H&J\b\u0010\u001c\u001a\u00020\u0004H'J\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH'J\b\u0010 \u001a\u00020\u0004H'J\b\u0010!\u001a\u00020\u0004H'J\b\u0010\"\u001a\u00020\u0004H'J\u001c\u0010&\u001a\u00020\u0004\"\u0004\b\u0000\u0010#2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$H'J\b\u0010'\u001a\u00020\u0004H'J\b\u0010(\u001a\u00020\u0004H'J\u001a\u0010)\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H'J\b\u0010*\u001a\u00020\u0004H'J\b\u0010+\u001a\u00020\u0004H'J\b\u0010,\u001a\u00020\u0004H'J=\u00100\u001a\u00020\u0004\"\u0004\b\u0000\u0010-\"\u0004\b\u0001\u0010#2\u0006\u0010\u0010\u001a\u00028\u00002\u0018\u0010/\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040.H'¢\u0006\u0004\b0\u00101J\u001c\u00104\u001a\u00020\u00012\b\u00102\u001a\u0004\u0018\u00010\u00012\b\u00103\u001a\u0004\u0018\u00010\u0001H'J\n\u00105\u001a\u0004\u0018\u00010\u0001H'J\u0012\u00106\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H'J\u0012\u0010\u001e\u001a\u00020\u001d2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H'J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020\u001dH\u0017J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u000207H\u0017J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u000208H\u0017J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u000209H\u0017J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020\u0002H\u0017J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020:H\u0017J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020;H\u0017J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020<H\u0017J\u0010\u0010?\u001a\u00020\u00042\u0006\u0010>\u001a\u00020=H'J\u0016\u0010A\u001a\u00020\u00042\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00040$H'J#\u0010C\u001a\u00028\u0000\"\u0004\b\u0000\u0010#2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000BH'¢\u0006\u0004\bC\u0010DJ#\u0010H\u001a\u00020\u00042\u0012\u0010G\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030F0EH'¢\u0006\u0004\bH\u0010IJ\b\u0010J\u001a\u00020\u0004H'J\b\u0010K\u001a\u00020\u0004H&J\b\u0010M\u001a\u00020LH'R\u001e\u0010S\u001a\u0006\u0012\u0002\b\u00030N8&X§\u0004¢\u0006\f\u0012\u0004\bQ\u0010R\u001a\u0004\bO\u0010PR\u001a\u0010W\u001a\u00020\u001d8&X§\u0004¢\u0006\f\u0012\u0004\bV\u0010R\u001a\u0004\bT\u0010UR\u001a\u0010Z\u001a\u00020\u001d8&X§\u0004¢\u0006\f\u0012\u0004\bY\u0010R\u001a\u0004\bX\u0010UR\u001a\u0010]\u001a\u00020\u001d8&X§\u0004¢\u0006\f\u0012\u0004\b\\\u0010R\u001a\u0004\b[\u0010UR\u001c\u0010a\u001a\u0004\u0018\u00010=8&X§\u0004¢\u0006\f\u0012\u0004\b`\u0010R\u001a\u0004\b^\u0010_R\u001c\u0010e\u001a\u0004\u0018\u00010\u00018&X§\u0004¢\u0006\f\u0012\u0004\bd\u0010R\u001a\u0004\bb\u0010cR\u001a\u0010i\u001a\u00020\u00028&X§\u0004¢\u0006\f\u0012\u0004\bh\u0010R\u001a\u0004\bf\u0010gR\u0014\u0010m\u001a\u00020j8&X¦\u0004¢\u0006\u0006\u001a\u0004\bk\u0010lR\u001a\u0010r\u001a\u00020n8fX§\u0004¢\u0006\f\u0012\u0004\bq\u0010R\u001a\u0004\bo\u0010pR\u0014\u0010v\u001a\u00020s8fX¦\u0004¢\u0006\u0006\u001a\u0004\bt\u0010u\u0082\u0001\u0001xø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006yÀ\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/Composer;", "", "", "key", "Lbn/r;", "startReplaceableGroup", "endReplaceableGroup", "dataKey", "startMovableGroup", "endMovableGroup", "startDefaults", "endDefaults", "startRestartGroup", "Landroidx/compose/runtime/ScopeUpdateScope;", "endRestartGroup", "Landroidx/compose/runtime/MovableContent;", "value", MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, "insertMovableContent", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/MovableContentStateReference;", "references", "insertMovableContentReferences", "", "sourceInformation", "sourceInformationMarkerStart", "sourceInformationMarkerEnd", "skipToGroupEnd", "", Utils.VERB_CHANGED, "deactivateToEndGroup", "skipCurrentGroup", "startNode", "startReusableNode", "T", "Lkotlin/Function0;", "factory", "createNode", "useNode", "endNode", "startReusableGroup", "endReusableGroup", "disableReusing", "enableReusing", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/Function2;", "block", "apply", "(Ljava/lang/Object;Lsn/p;)V", "left", "right", "joinKey", "rememberedValue", "updateRememberedValue", "", "", "", "", "", "", "Landroidx/compose/runtime/RecomposeScope;", "scope", "recordUsed", "effect", "recordSideEffect", "Landroidx/compose/runtime/CompositionLocal;", "consume", "(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "", "Landroidx/compose/runtime/ProvidedValue;", "values", "startProviders", "([Landroidx/compose/runtime/ProvidedValue;)V", "endProviders", "collectParameterInformation", "Landroidx/compose/runtime/CompositionContext;", "buildContext", "Landroidx/compose/runtime/Applier;", "getApplier", "()Landroidx/compose/runtime/Applier;", "getApplier$annotations", "()V", "applier", "getInserting", "()Z", "getInserting$annotations", "inserting", "getSkipping", "getSkipping$annotations", "skipping", "getDefaultsInvalid", "getDefaultsInvalid$annotations", "defaultsInvalid", "getRecomposeScope", "()Landroidx/compose/runtime/RecomposeScope;", "getRecomposeScope$annotations", "recomposeScope", "getRecomposeScopeIdentity", "()Ljava/lang/Object;", "getRecomposeScopeIdentity$annotations", "recomposeScopeIdentity", "getCompoundKeyHash", "()I", "getCompoundKeyHash$annotations", "compoundKeyHash", "Landroidx/compose/runtime/tooling/CompositionData;", "getCompositionData", "()Landroidx/compose/runtime/tooling/CompositionData;", "compositionData", "Lkotlin/coroutines/d;", "getApplyCoroutineContext", "()Lkotlin/coroutines/d;", "getApplyCoroutineContext$annotations", "applyCoroutineContext", "Landroidx/compose/runtime/ControlledComposition;", "getComposition", "()Landroidx/compose/runtime/ControlledComposition;", "composition", VastTagName.COMPANION, "Landroidx/compose/runtime/ComposerImpl;", "runtime_release"}, k = 1, mv = {1, 6, 0})
public interface Composer {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: Composer.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0017\u0010\u0006\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/Composer$Companion;", "", "Landroidx/compose/runtime/CompositionTracer;", "tracer", "Lbn/r;", "setTracer", "Empty", "Ljava/lang/Object;", "getEmpty", "()Ljava/lang/Object;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final Object Empty = new Object() { // from class: androidx.compose.runtime.Composer$Companion$Empty$1
            @NotNull
            public String toString() {
                return "Empty";
            }
        };

        private Companion() {
        }

        @NotNull
        public final Object getEmpty() {
            return Empty;
        }

        @InternalComposeTracingApi
        public final void setTracer(@NotNull CompositionTracer compositionTracer) {
            p.k(compositionTracer, "tracer");
            ComposerKt.compositionTracer = compositionTracer;
        }
    }

    @ComposeCompilerApi
    static /* synthetic */ void getApplier$annotations() {
    }

    @InternalComposeApi
    static /* synthetic */ void getApplyCoroutineContext$annotations() {
    }

    @InternalComposeApi
    static /* synthetic */ void getCompoundKeyHash$annotations() {
    }

    @ComposeCompilerApi
    static /* synthetic */ void getDefaultsInvalid$annotations() {
    }

    @ComposeCompilerApi
    static /* synthetic */ void getInserting$annotations() {
    }

    @InternalComposeApi
    static /* synthetic */ void getRecomposeScope$annotations() {
    }

    @ComposeCompilerApi
    static /* synthetic */ void getRecomposeScopeIdentity$annotations() {
    }

    @ComposeCompilerApi
    static /* synthetic */ void getSkipping$annotations() {
    }

    @ComposeCompilerApi
    <V, T> void apply(V value, @NotNull sn.p<? super T, ? super V, r> block);

    @InternalComposeApi
    @NotNull
    CompositionContext buildContext();

    @ComposeCompilerApi
    default boolean changed(byte value) {
        return changed(value);
    }

    @ComposeCompilerApi
    default boolean changed(char value) {
        return changed(value);
    }

    @ComposeCompilerApi
    default boolean changed(double value) {
        return changed(value);
    }

    @ComposeCompilerApi
    default boolean changed(float value) {
        return changed(value);
    }

    @ComposeCompilerApi
    default boolean changed(int value) {
        return changed(value);
    }

    @ComposeCompilerApi
    default boolean changed(long value) {
        return changed(value);
    }

    @ComposeCompilerApi
    boolean changed(@Nullable Object value);

    @ComposeCompilerApi
    default boolean changed(short value) {
        return changed(value);
    }

    @ComposeCompilerApi
    default boolean changed(boolean value) {
        return changed(value);
    }

    void collectParameterInformation();

    @InternalComposeApi
    <T> T consume(@NotNull CompositionLocal<T> key);

    @ComposeCompilerApi
    <T> void createNode(@NotNull a<? extends T> aVar);

    @ComposeCompilerApi
    void deactivateToEndGroup(boolean z10);

    @ComposeCompilerApi
    void disableReusing();

    @ComposeCompilerApi
    void enableReusing();

    @ComposeCompilerApi
    void endDefaults();

    @ComposeCompilerApi
    void endMovableGroup();

    @ComposeCompilerApi
    void endNode();

    @InternalComposeApi
    void endProviders();

    @ComposeCompilerApi
    void endReplaceableGroup();

    @ComposeCompilerApi
    @Nullable
    ScopeUpdateScope endRestartGroup();

    @ComposeCompilerApi
    void endReusableGroup();

    @NotNull
    Applier<?> getApplier();

    @NotNull
    d getApplyCoroutineContext();

    @NotNull
    ControlledComposition getComposition();

    @NotNull
    CompositionData getCompositionData();

    int getCompoundKeyHash();

    boolean getDefaultsInvalid();

    boolean getInserting();

    @Nullable
    RecomposeScope getRecomposeScope();

    @Nullable
    Object getRecomposeScopeIdentity();

    boolean getSkipping();

    @InternalComposeApi
    void insertMovableContent(@NotNull MovableContent<?> movableContent, @Nullable Object obj);

    @InternalComposeApi
    void insertMovableContentReferences(@NotNull List<Pair<MovableContentStateReference, MovableContentStateReference>> list);

    @ComposeCompilerApi
    @NotNull
    Object joinKey(@Nullable Object left, @Nullable Object right);

    @InternalComposeApi
    void recordSideEffect(@NotNull a<r> aVar);

    @InternalComposeApi
    void recordUsed(@NotNull RecomposeScope recomposeScope);

    @ComposeCompilerApi
    @Nullable
    Object rememberedValue();

    @ComposeCompilerApi
    void skipCurrentGroup();

    @ComposeCompilerApi
    void skipToGroupEnd();

    void sourceInformation(@NotNull String str);

    void sourceInformationMarkerEnd();

    void sourceInformationMarkerStart(int i10, @NotNull String str);

    @ComposeCompilerApi
    void startDefaults();

    @ComposeCompilerApi
    void startMovableGroup(int i10, @Nullable Object obj);

    @ComposeCompilerApi
    void startNode();

    @InternalComposeApi
    void startProviders(@NotNull ProvidedValue<?>[] values);

    @ComposeCompilerApi
    void startReplaceableGroup(int i10);

    @ComposeCompilerApi
    @NotNull
    Composer startRestartGroup(int key);

    @ComposeCompilerApi
    void startReusableGroup(int i10, @Nullable Object obj);

    @ComposeCompilerApi
    void startReusableNode();

    @ComposeCompilerApi
    void updateRememberedValue(@Nullable Object obj);

    @ComposeCompilerApi
    void useNode();
}
