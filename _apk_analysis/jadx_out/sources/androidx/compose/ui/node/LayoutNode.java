package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusOrderModifier;
import androidx.compose.ui.focus.FocusOrderModifierToProperties;
import androidx.compose.ui.focus.FocusPropertiesModifier;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.input.pointer.PointerInputFilter;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.ModifierInfo;
import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import androidx.compose.ui.layout.OnPlacedModifier;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalKt;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.JvmActuals_jvmKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsEntity;
import androidx.compose.ui.semantics.SemanticsNodeKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import bn.h;
import bn.r;
import com.ironsource.C3996e4;
import com.ironsource.C4157n2;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.bidmachine.iab.vast.tags.VastAttributes;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: LayoutNode.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000ð\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\f\b\u0000\u0018\u0000 ã\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\bã\u0002ä\u0002å\u0002æ\u0002B\u0014\u0012\t\b\u0002\u0010\u00ad\u0001\u001a\u00020\u0012¢\u0006\u0006\bâ\u0002\u0010\u0084\u0001J\b\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0000H\u0002J\u0012\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u0011\u001a\u00020\u0007H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u0007H\u0002J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0000H\u0002J\b\u0010\u0017\u001a\u00020\u0007H\u0002J\b\u0010\u0018\u001a\u00020\u0007H\u0002J\b\u0010\u0019\u001a\u00020\u0007H\u0002J\u0010\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J \u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0002J&\u0010'\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020$2\u0006\u0010&\u001a\u00020%2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0002J\u001c\u0010)\u001a\u00020%2\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030(2\u0006\u0010&\u001a\u00020%H\u0002J\u001a\u0010.\u001a\u0004\u0018\u00010-2\u0006\u0010+\u001a\u00020*2\u0006\u0010\u001b\u001a\u00020,H\u0002J\b\u0010/\u001a\u00020\u0007H\u0002J\u0010\u00100\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u001d\u00103\u001a\u00020\u00072\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u000701H\u0082\bJ\u001d\u00104\u001a\u00020\u00072\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u000701H\u0082\bJ\u001d\u00105\u001a\u00020\u00072\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000701H\u0082\bJ\b\u00106\u001a\u00020\u0012H\u0002J\b\u00107\u001a\u00020\u0007H\u0002J\b\u00108\u001a\u00020\u0007H\u0002J\u001f\u0010=\u001a\u00020\u00072\u0006\u00109\u001a\u00020\r2\u0006\u0010:\u001a\u00020\u0000H\u0000¢\u0006\u0004\b;\u0010<J\u001f\u0010A\u001a\u00020\u00072\u0006\u00109\u001a\u00020\r2\u0006\u0010>\u001a\u00020\rH\u0000¢\u0006\u0004\b?\u0010@J\u000f\u0010D\u001a\u00020\u0007H\u0000¢\u0006\u0004\bB\u0010CJ'\u0010I\u001a\u00020\u00072\u0006\u0010E\u001a\u00020\r2\u0006\u0010F\u001a\u00020\r2\u0006\u0010>\u001a\u00020\rH\u0000¢\u0006\u0004\bG\u0010HJ\u0017\u0010N\u001a\u00020\u00072\u0006\u0010K\u001a\u00020JH\u0000¢\u0006\u0004\bL\u0010MJ\u000f\u0010P\u001a\u00020\u0007H\u0000¢\u0006\u0004\bO\u0010CJ\b\u0010Q\u001a\u00020\u000fH\u0016J\u000f\u0010S\u001a\u00020\u0007H\u0000¢\u0006\u0004\bR\u0010CJ!\u0010X\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020U0T0\u001fH\u0000¢\u0006\u0004\bV\u0010WJ\u001f\u0010\\\u001a\u00020\u00072\u0006\u0010Y\u001a\u00020\r2\u0006\u0010Z\u001a\u00020\rH\u0000¢\u0006\u0004\b[\u0010@J\u000f\u0010^\u001a\u00020\u0007H\u0000¢\u0006\u0004\b]\u0010CJ\u0017\u0010c\u001a\u00020\u00072\u0006\u0010`\u001a\u00020_H\u0000¢\u0006\u0004\ba\u0010bJ?\u0010m\u001a\u00020\u00072\u0006\u0010e\u001a\u00020d2\f\u0010h\u001a\b\u0012\u0004\u0012\u00020g0f2\b\b\u0002\u0010i\u001a\u00020\u00122\b\b\u0002\u0010j\u001a\u00020\u0012H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bk\u0010lJ?\u0010q\u001a\u00020\u00072\u0006\u0010e\u001a\u00020d2\f\u0010o\u001a\b\u0012\u0004\u0012\u00020n0f2\b\b\u0002\u0010i\u001a\u00020\u00122\b\b\u0002\u0010j\u001a\u00020\u0012H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bp\u0010lJ\u000f\u0010s\u001a\u00020\u0007H\u0000¢\u0006\u0004\br\u0010CJ\u000f\u0010u\u001a\u00020\u0007H\u0000¢\u0006\u0004\bt\u0010CJ\u000f\u0010w\u001a\u00020\u0007H\u0000¢\u0006\u0004\bv\u0010CJ\u001b\u0010|\u001a\u000e\u0012\u0004\u0012\u00020y\u0012\u0004\u0012\u00020\r0xH\u0000¢\u0006\u0004\bz\u0010{J\u0019\u0010\u0081\u0001\u001a\u00020\u00072\u0006\u0010~\u001a\u00020}H\u0000¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u001d\u0010\u0085\u0001\u001a\u00020\u00072\t\b\u0002\u0010\u0082\u0001\u001a\u00020\u0012H\u0000¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J%\u0010\u0089\u0001\u001a\u00020\u00072\r\u00102\u001a\t\u0012\u0004\u0012\u00020\u00070\u0086\u0001H\u0080\bø\u0001\u0002¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u001d\u0010\u008b\u0001\u001a\u00020\u00072\t\b\u0002\u0010\u0082\u0001\u001a\u00020\u0012H\u0000¢\u0006\u0006\b\u008a\u0001\u0010\u0084\u0001J\u0011\u0010\u008d\u0001\u001a\u00020\u0007H\u0000¢\u0006\u0005\b\u008c\u0001\u0010CJ\u0011\u0010\u0090\u0001\u001a\n\u0012\u0005\u0012\u00030\u008f\u00010\u008e\u0001H\u0016J\u0011\u0010\u0092\u0001\u001a\u00020\u0007H\u0000¢\u0006\u0005\b\u0091\u0001\u0010CJ#\u0010\u0098\u0001\u001a\u00030\u0095\u00012\b\u0010\u0094\u0001\u001a\u00030\u0093\u0001H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J&\u0010\u009b\u0001\u001a\u00020\u00122\f\b\u0002\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0093\u0001H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u0011\u0010\u009d\u0001\u001a\u00020\u0007H\u0000¢\u0006\u0005\b\u009c\u0001\u0010CJ\u0011\u0010\u009f\u0001\u001a\u00020\u0007H\u0000¢\u0006\u0005\b\u009e\u0001\u0010CJ\"\u0010¢\u0001\u001a\u00020\u00072\b\u0010\u0094\u0001\u001a\u00030\u0093\u0001H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b \u0001\u0010¡\u0001J\u0012\u0010¤\u0001\u001a\u00020\r2\u0007\u0010£\u0001\u001a\u00020\rH\u0016J\u0012\u0010¥\u0001\u001a\u00020\r2\u0007\u0010£\u0001\u001a\u00020\rH\u0016J\u0012\u0010§\u0001\u001a\u00020\r2\u0007\u0010¦\u0001\u001a\u00020\rH\u0016J\u0012\u0010¨\u0001\u001a\u00020\r2\u0007\u0010¦\u0001\u001a\u00020\rH\u0016J\t\u0010©\u0001\u001a\u00020\u0007H\u0016J\t\u0010ª\u0001\u001a\u00020\u0007H\u0016J\u0011\u0010¬\u0001\u001a\u00020\u0007H\u0000¢\u0006\u0005\b«\u0001\u0010CR\u0017\u0010\u00ad\u0001\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u00ad\u0001\u0010®\u0001R\u0019\u0010¯\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0001\u0010°\u0001R\u001d\u0010±\u0001\u001a\b\u0012\u0004\u0012\u00020\u00000\u001f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R!\u0010³\u0001\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0001\u0010²\u0001R\u0019\u0010´\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b´\u0001\u0010®\u0001R\u001b\u0010µ\u0001\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R,\u0010K\u001a\u0004\u0018\u00010J2\t\u0010·\u0001\u001a\u0004\u0018\u00010J8\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0005\bK\u0010¸\u0001\u001a\u0006\b¹\u0001\u0010º\u0001R'\u0010\u000e\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\u000e\u0010°\u0001\u001a\u0006\b»\u0001\u0010¼\u0001\"\u0006\b½\u0001\u0010¾\u0001R,\u0010À\u0001\u001a\u00030¿\u00012\b\u0010·\u0001\u001a\u00030¿\u00018\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\bÀ\u0001\u0010Á\u0001\u001a\u0006\bÂ\u0001\u0010Ã\u0001R\u001f\u0010Ä\u0001\u001a\b\u0012\u0004\u0012\u00020-0\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÄ\u0001\u0010²\u0001R\u0019\u0010\u0089\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010®\u0001R\u001d\u0010Å\u0001\u001a\b\u0012\u0004\u0012\u00020\u00000\u001f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÅ\u0001\u0010²\u0001R\u0019\u0010Æ\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÆ\u0001\u0010®\u0001R4\u0010É\u0001\u001a\u00030Ç\u00012\b\u0010È\u0001\u001a\u00030Ç\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\bÉ\u0001\u0010Ê\u0001\u001a\u0006\bË\u0001\u0010Ì\u0001\"\u0006\bÍ\u0001\u0010Î\u0001R \u0010Ð\u0001\u001a\u00030Ï\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bÐ\u0001\u0010Ñ\u0001\u001a\u0006\bÒ\u0001\u0010Ó\u0001R4\u0010Õ\u0001\u001a\u00030Ô\u00012\b\u0010È\u0001\u001a\u00030Ô\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\bÕ\u0001\u0010Ö\u0001\u001a\u0006\b×\u0001\u0010Ø\u0001\"\u0006\bÙ\u0001\u0010Ú\u0001R \u0010Ü\u0001\u001a\u00030Û\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bÜ\u0001\u0010Ý\u0001\u001a\u0006\bÞ\u0001\u0010ß\u0001R4\u0010á\u0001\u001a\u00030à\u00012\b\u0010È\u0001\u001a\u00030à\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\bá\u0001\u0010â\u0001\u001a\u0006\bã\u0001\u0010ä\u0001\"\u0006\bå\u0001\u0010æ\u0001R*\u0010è\u0001\u001a\u00030ç\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\bè\u0001\u0010é\u0001\u001a\u0006\bê\u0001\u0010ë\u0001\"\u0006\bì\u0001\u0010í\u0001R \u0010ï\u0001\u001a\u00030î\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bï\u0001\u0010ð\u0001\u001a\u0006\bñ\u0001\u0010ò\u0001R*\u0010ó\u0001\u001a\u00020\u00122\u0007\u0010·\u0001\u001a\u00020\u00128\u0016@RX\u0096\u000e¢\u0006\u0010\n\u0006\bó\u0001\u0010®\u0001\u001a\u0006\bó\u0001\u0010ô\u0001R*\u0010õ\u0001\u001a\u00020\r2\u0007\u0010·\u0001\u001a\u00020\r8\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\bõ\u0001\u0010°\u0001\u001a\u0006\bö\u0001\u0010¼\u0001R\u0019\u0010÷\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b÷\u0001\u0010°\u0001R\u0019\u0010ø\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bø\u0001\u0010°\u0001R*\u0010ú\u0001\u001a\u00030ù\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bú\u0001\u0010û\u0001\u001a\u0006\bü\u0001\u0010ý\u0001\"\u0006\bþ\u0001\u0010ÿ\u0001R*\u0010\u0080\u0002\u001a\u00030ù\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0080\u0002\u0010û\u0001\u001a\u0006\b\u0081\u0002\u0010ý\u0001\"\u0006\b\u0082\u0002\u0010ÿ\u0001R\u001a\u0010\u0083\u0002\u001a\u00030ù\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0002\u0010û\u0001R0\u0010\u0084\u0002\u001a\u00020\u00128\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\b\u0084\u0002\u0010®\u0001\u0012\u0005\b\u0087\u0002\u0010C\u001a\u0006\b\u0085\u0002\u0010ô\u0001\"\u0006\b\u0086\u0002\u0010\u0084\u0001R\u001f\u0010\u0088\u0002\u001a\u00020*8\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0088\u0002\u0010\u0089\u0002\u001a\u0006\b\u008a\u0002\u0010\u008b\u0002R\u0018\u0010\u008d\u0002\u001a\u00030\u008c\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0002\u0010\u008e\u0002R\u001a\u0010\u0090\u0002\u001a\u00030\u008f\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0002\u0010\u0091\u0002R,\u0010\u0093\u0002\u001a\u0005\u0018\u00010\u0092\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0093\u0002\u0010\u0094\u0002\u001a\u0006\b\u0095\u0002\u0010\u0096\u0002\"\u0006\b\u0097\u0002\u0010\u0098\u0002R\u001b\u0010\u0099\u0002\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0002\u0010\u0089\u0002R)\u0010\u009a\u0002\u001a\u00020\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u009a\u0002\u0010®\u0001\u001a\u0006\b\u009b\u0002\u0010ô\u0001\"\u0006\b\u009c\u0002\u0010\u0084\u0001R\u001f\u0010\u009d\u0002\u001a\u00020%8\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u009d\u0002\u0010\u009e\u0002\u001a\u0006\b\u009f\u0002\u0010 \u0002R*\u0010¡\u0002\u001a\u00020%2\u0007\u0010·\u0001\u001a\u00020%8\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\b¡\u0002\u0010\u009e\u0002\u001a\u0006\b¢\u0002\u0010 \u0002R0\u0010\u001b\u001a\u00020\u001a2\u0007\u0010È\u0001\u001a\u00020\u001a8\u0016@VX\u0096\u000e¢\u0006\u0017\n\u0005\b\u001b\u0010£\u0002\u001a\u0006\b¤\u0002\u0010¥\u0002\"\u0006\b¦\u0002\u0010§\u0002R7\u0010¨\u0002\u001a\u0010\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\u0007\u0018\u0001018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¨\u0002\u0010©\u0002\u001a\u0006\bª\u0002\u0010«\u0002\"\u0006\b¬\u0002\u0010\u00ad\u0002R7\u0010®\u0002\u001a\u0010\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\u0007\u0018\u0001018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b®\u0002\u0010©\u0002\u001a\u0006\b¯\u0002\u0010«\u0002\"\u0006\b°\u0002\u0010\u00ad\u0002R-\u0010±\u0002\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020U0T\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0002\u0010²\u0001R)\u0010²\u0002\u001a\u00020\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b²\u0002\u0010®\u0001\u001a\u0006\b³\u0002\u0010ô\u0001\"\u0006\b´\u0002\u0010\u0084\u0001R\u0019\u0010µ\u0002\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0002\u0010®\u0001R*\u0010¶\u0002\u001a\u00020\u00122\u0007\u0010·\u0001\u001a\u00020\u00128\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\b¶\u0002\u0010®\u0001\u001a\u0006\b·\u0002\u0010ô\u0001R*\u0010¸\u0002\u001a\u00020\u00122\u0007\u0010·\u0001\u001a\u00020\u00128\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\b¸\u0002\u0010®\u0001\u001a\u0006\b¹\u0002\u0010ô\u0001R\u001e\u0010»\u0002\u001a\t\u0012\u0004\u0012\u00020\u00000º\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b»\u0002\u0010¼\u0002R\u0019\u0010¾\u0002\u001a\u0004\u0018\u00010*8BX\u0082\u0004¢\u0006\b\u001a\u0006\b½\u0002\u0010\u008b\u0002R\u001e\u0010Á\u0002\u001a\t\u0012\u0004\u0012\u00020\u00000\u008e\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b¿\u0002\u0010À\u0002R#\u0010Ä\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u001f8@X\u0080\u0004¢\u0006\u000e\u0012\u0005\bÃ\u0002\u0010C\u001a\u0005\bÂ\u0002\u0010WR\u001e\u0010Æ\u0002\u001a\t\u0012\u0004\u0012\u00020\u00000\u008e\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bÅ\u0002\u0010À\u0002R\u0019\u0010É\u0002\u001a\u0004\u0018\u00010\u00008@X\u0080\u0004¢\u0006\b\u001a\u0006\bÇ\u0002\u0010È\u0002R\u0017\u0010Ê\u0002\u001a\u00020\u00128VX\u0096\u0004¢\u0006\b\u001a\u0006\bÊ\u0002\u0010ô\u0001R#\u0010Í\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u001f8@X\u0081\u0004¢\u0006\u000e\u0012\u0005\bÌ\u0002\u0010C\u001a\u0005\bË\u0002\u0010WR\u0017\u0010Î\u0002\u001a\u00020\u00128VX\u0096\u0004¢\u0006\b\u001a\u0006\bÎ\u0002\u0010ô\u0001R\u0017\u0010¦\u0001\u001a\u00020\r8VX\u0096\u0004¢\u0006\b\u001a\u0006\bÏ\u0002\u0010¼\u0001R\u0017\u0010£\u0001\u001a\u00020\r8VX\u0096\u0004¢\u0006\b\u001a\u0006\bÐ\u0002\u0010¼\u0001R\u0018\u0010Ô\u0002\u001a\u00030Ñ\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bÒ\u0002\u0010Ó\u0002R\u0017\u0010Ö\u0002\u001a\u00020*8@X\u0080\u0004¢\u0006\b\u001a\u0006\bÕ\u0002\u0010\u008b\u0002R\u0018\u0010Ú\u0002\u001a\u00030×\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\bØ\u0002\u0010Ù\u0002R\u001a\u0010Þ\u0002\u001a\u0005\u0018\u00010Û\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\bÜ\u0002\u0010Ý\u0002R\u0019\u0010á\u0002\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\b\u001a\u0006\bß\u0002\u0010à\u0002\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0005\b\u009920\u0001¨\u0006ç\u0002"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/Remeasurement;", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/compose/ui/layout/LayoutInfo;", "Landroidx/compose/ui/node/ComposeUiNode;", "Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;", "Lbn/r;", "recreateUnfoldedChildrenIfDirty", "invalidateUnfoldedVirtualChildren", "onZSortedChildrenInvalidated", "child", "onChildRemoved", "", "depth", "", "debugTreeToString", "onDensityOrLayoutDirectionChanged", "", "hasNewPositioningCallback", "markNodeAndSubtreeAsPlaced", "it", "rescheduleRemeasureOrRelayout", "markSubtreeAsNotPlaced", "onBeforeLayoutChildren", "alignmentLinesQueriedByModifier", "Landroidx/compose/ui/Modifier;", "modifier", "setModifierLocals", "Landroidx/compose/ui/focus/FocusOrderModifier;", "mod", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/node/ModifierLocalConsumerEntity;", "consumers", "Landroidx/compose/ui/focus/FocusPropertiesModifier;", "findFocusPropertiesModifier", "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "Landroidx/compose/ui/node/ModifierLocalProviderEntity;", IronSourceConstants.EVENTS_PROVIDER, "addModifierLocalConsumer", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "addModifierLocalProvider", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "toWrap", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/node/ModifiedLayoutNode;", "reuseLayoutNodeWrapper", "copyWrappersToCache", "markReusedModifiers", "Lkotlin/Function1;", "block", "forEachDelegate", "forEachDelegateIncludingInner", "forEachModifierLocalProvider", "shouldInvalidateParentLayer", "clearSubtreeIntrinsicsUsage", "clearSubtreePlacementIntrinsicsUsage", "index", C4157n2.f33007p, "insertAt$ui_release", "(ILandroidx/compose/ui/node/LayoutNode;)V", "insertAt", "count", "removeAt$ui_release", "(II)V", "removeAt", "removeAll$ui_release", "()V", "removeAll", TypedValues.TransitionType.S_FROM, TypedValues.TransitionType.S_TO, "move$ui_release", "(III)V", "move", "Landroidx/compose/ui/node/Owner;", "owner", "attach$ui_release", "(Landroidx/compose/ui/node/Owner;)V", "attach", "detach$ui_release", "detach", "toString", "invalidateLayer$ui_release", "invalidateLayer", "Lkotlin/Pair;", "Landroidx/compose/ui/layout/OnGloballyPositionedModifier;", "getOrCreateOnPositionedCallbacks$ui_release", "()Landroidx/compose/runtime/collection/MutableVector;", "getOrCreateOnPositionedCallbacks", VastAttributes.HORIZONTAL_POSITION, VastAttributes.VERTICAL_POSITION, "place$ui_release", "place", "replace$ui_release", "replace", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "draw$ui_release", "(Landroidx/compose/ui/graphics/Canvas;)V", "draw", "Landroidx/compose/ui/geometry/Offset;", "pointerPosition", "Landroidx/compose/ui/node/HitTestResult;", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "hitTestResult", "isTouchEvent", "isInLayer", "hitTest-M_7yMNQ$ui_release", "(JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "hitTest", "Landroidx/compose/ui/semantics/SemanticsEntity;", "hitSemanticsEntities", "hitTestSemantics-M_7yMNQ$ui_release", "hitTestSemantics", "onNodePlaced$ui_release", "onNodePlaced", "layoutChildren$ui_release", "layoutChildren", "onAlignmentsChanged$ui_release", "onAlignmentsChanged", "", "Landroidx/compose/ui/layout/AlignmentLine;", "calculateAlignmentLines$ui_release", "()Ljava/util/Map;", "calculateAlignmentLines", "Landroidx/compose/ui/layout/MeasureResult;", "measureResult", "handleMeasureResult$ui_release", "(Landroidx/compose/ui/layout/MeasureResult;)V", "handleMeasureResult", "forceRequest", "requestRemeasure$ui_release", "(Z)V", "requestRemeasure", "Lkotlin/Function0;", "ignoreRemeasureRequests$ui_release", "(Lsn/a;)V", "ignoreRemeasureRequests", "requestRelayout$ui_release", "requestRelayout", "dispatchOnPositionedCallbacks$ui_release", "dispatchOnPositionedCallbacks", "", "Landroidx/compose/ui/layout/ModifierInfo;", "getModifierInfo", "invalidateLayers$ui_release", "invalidateLayers", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/Placeable;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "measure", "remeasure-_Sx5XlM$ui_release", "(Landroidx/compose/ui/unit/Constraints;)Z", "remeasure", "markLayoutPending$ui_release", "markLayoutPending", "markMeasurePending$ui_release", "markMeasurePending", "performMeasure-BRTryo0$ui_release", "(J)V", "performMeasure", "height", "minIntrinsicWidth", "maxIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "forceRemeasure", "onLayoutComplete", "resetSubtreeIntrinsicsUsage$ui_release", "resetSubtreeIntrinsicsUsage", "isVirtual", "Z", "virtualChildrenCount", "I", "_foldedChildren", "Landroidx/compose/runtime/collection/MutableVector;", "_unfoldedChildren", "unfoldedVirtualChildrenListDirty", "_foldedParent", "Landroidx/compose/ui/node/LayoutNode;", "<set-?>", "Landroidx/compose/ui/node/Owner;", "getOwner$ui_release", "()Landroidx/compose/ui/node/Owner;", "getDepth$ui_release", "()I", "setDepth$ui_release", "(I)V", "Landroidx/compose/ui/node/LayoutNode$LayoutState;", "layoutState", "Landroidx/compose/ui/node/LayoutNode$LayoutState;", "getLayoutState$ui_release", "()Landroidx/compose/ui/node/LayoutNode$LayoutState;", "wrapperCache", "_zSortedChildren", "zSortedChildrenInvalidated", "Landroidx/compose/ui/layout/MeasurePolicy;", "value", "measurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "getMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "setMeasurePolicy", "(Landroidx/compose/ui/layout/MeasurePolicy;)V", "Landroidx/compose/ui/node/IntrinsicsPolicy;", "intrinsicsPolicy", "Landroidx/compose/ui/node/IntrinsicsPolicy;", "getIntrinsicsPolicy$ui_release", "()Landroidx/compose/ui/node/IntrinsicsPolicy;", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "Landroidx/compose/ui/layout/MeasureScope;", "measureScope", "Landroidx/compose/ui/layout/MeasureScope;", "getMeasureScope$ui_release", "()Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "setViewConfiguration", "(Landroidx/compose/ui/platform/ViewConfiguration;)V", "Landroidx/compose/ui/node/LayoutNodeAlignmentLines;", "alignmentLines", "Landroidx/compose/ui/node/LayoutNodeAlignmentLines;", "getAlignmentLines$ui_release", "()Landroidx/compose/ui/node/LayoutNodeAlignmentLines;", "isPlaced", "()Z", "placeOrder", "getPlaceOrder$ui_release", "previousPlaceOrder", "nextChildPlaceOrder", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "measuredByParent", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "getMeasuredByParent$ui_release", "()Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "setMeasuredByParent$ui_release", "(Landroidx/compose/ui/node/LayoutNode$UsageByParent;)V", "intrinsicsUsageByParent", "getIntrinsicsUsageByParent$ui_release", "setIntrinsicsUsageByParent$ui_release", "previousIntrinsicsUsageByParent", "canMultiMeasure", "getCanMultiMeasure$ui_release", "setCanMultiMeasure$ui_release", "getCanMultiMeasure$ui_release$annotations", "innerLayoutNodeWrapper", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "getInnerLayoutNodeWrapper$ui_release", "()Landroidx/compose/ui/node/LayoutNodeWrapper;", "Landroidx/compose/ui/node/OuterMeasurablePlaceable;", "outerMeasurablePlaceable", "Landroidx/compose/ui/node/OuterMeasurablePlaceable;", "", "zIndex", "F", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "subcompositionsState", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "getSubcompositionsState$ui_release", "()Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "setSubcompositionsState$ui_release", "(Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;)V", "_innerLayerWrapper", "innerLayerWrapperIsDirty", "getInnerLayerWrapperIsDirty$ui_release", "setInnerLayerWrapperIsDirty$ui_release", "modifierLocalsHead", "Landroidx/compose/ui/node/ModifierLocalProviderEntity;", "getModifierLocalsHead$ui_release", "()Landroidx/compose/ui/node/ModifierLocalProviderEntity;", "modifierLocalsTail", "getModifierLocalsTail$ui_release", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "setModifier", "(Landroidx/compose/ui/Modifier;)V", "onAttach", "Lsn/l;", "getOnAttach$ui_release", "()Lsn/l;", "setOnAttach$ui_release", "(Lsn/l;)V", "onDetach", "getOnDetach$ui_release", "setOnDetach$ui_release", "onPositionedCallbacks", "needsOnPositionedDispatch", "getNeedsOnPositionedDispatch$ui_release", "setNeedsOnPositionedDispatch$ui_release", "relayoutWithoutParentInProgress", "measurePending", "getMeasurePending$ui_release", "layoutPending", "getLayoutPending$ui_release", "Ljava/util/Comparator;", "ZComparator", "Ljava/util/Comparator;", "getInnerLayerWrapper", "innerLayerWrapper", "getFoldedChildren$ui_release", "()Ljava/util/List;", "foldedChildren", "get_children$ui_release", "get_children$ui_release$annotations", "_children", "getChildren$ui_release", "children", "getParent$ui_release", "()Landroidx/compose/ui/node/LayoutNode;", "parent", "isAttached", "getZSortedChildren", "getZSortedChildren$annotations", "zSortedChildren", "isValid", "getWidth", "getHeight", "Landroidx/compose/ui/node/LayoutNodeDrawScope;", "getMDrawScope$ui_release", "()Landroidx/compose/ui/node/LayoutNodeDrawScope;", "mDrawScope", "getOuterLayoutNodeWrapper$ui_release", "outerLayoutNodeWrapper", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", C3996e4.f31528f, "", "getParentData", "()Ljava/lang/Object;", "parentData", "getParentInfo", "()Landroidx/compose/ui/layout/LayoutInfo;", "parentInfo", "<init>", VastTagName.COMPANION, "LayoutState", "NoIntrinsicsMeasurePolicy", "UsageByParent", "ui_release"}, k = 1, mv = {1, 6, 0})
public final class LayoutNode implements Measurable, Remeasurement, OwnerScope, LayoutInfo, ComposeUiNode, Owner.OnLayoutCompletedListener {
    public static final int NotPlacedPlaceOrder = Integer.MAX_VALUE;

    @NotNull
    private final Comparator<LayoutNode> ZComparator;

    @NotNull
    private final MutableVector<LayoutNode> _foldedChildren;

    @Nullable
    private LayoutNode _foldedParent;

    @Nullable
    private LayoutNodeWrapper _innerLayerWrapper;

    @Nullable
    private MutableVector<LayoutNode> _unfoldedChildren;

    @NotNull
    private final MutableVector<LayoutNode> _zSortedChildren;

    @NotNull
    private final LayoutNodeAlignmentLines alignmentLines;
    private boolean canMultiMeasure;

    @NotNull
    private Density density;
    private int depth;
    private boolean ignoreRemeasureRequests;
    private boolean innerLayerWrapperIsDirty;

    @NotNull
    private final LayoutNodeWrapper innerLayoutNodeWrapper;

    @NotNull
    private final IntrinsicsPolicy intrinsicsPolicy;

    @NotNull
    private UsageByParent intrinsicsUsageByParent;
    private boolean isPlaced;
    private final boolean isVirtual;

    @NotNull
    private LayoutDirection layoutDirection;
    private boolean layoutPending;

    @NotNull
    private LayoutState layoutState;
    private boolean measurePending;

    @NotNull
    private MeasurePolicy measurePolicy;

    @NotNull
    private final MeasureScope measureScope;

    @NotNull
    private UsageByParent measuredByParent;

    @NotNull
    private Modifier modifier;

    @NotNull
    private final ModifierLocalProviderEntity modifierLocalsHead;

    @NotNull
    private ModifierLocalProviderEntity modifierLocalsTail;
    private boolean needsOnPositionedDispatch;
    private int nextChildPlaceOrder;

    @Nullable
    private l<? super Owner, r> onAttach;

    @Nullable
    private l<? super Owner, r> onDetach;

    @Nullable
    private MutableVector<Pair<LayoutNodeWrapper, OnGloballyPositionedModifier>> onPositionedCallbacks;

    @NotNull
    private final OuterMeasurablePlaceable outerMeasurablePlaceable;

    @Nullable
    private Owner owner;
    private int placeOrder;

    @NotNull
    private UsageByParent previousIntrinsicsUsageByParent;
    private int previousPlaceOrder;
    private boolean relayoutWithoutParentInProgress;

    @Nullable
    private LayoutNodeSubcompositionsState subcompositionsState;
    private boolean unfoldedVirtualChildrenListDirty;

    @NotNull
    private ViewConfiguration viewConfiguration;
    private int virtualChildrenCount;

    @NotNull
    private MutableVector<ModifiedLayoutNode> wrapperCache;
    private float zIndex;
    private boolean zSortedChildrenInvalidated;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final NoIntrinsicsMeasurePolicy ErrorMeasurePolicy = new NoIntrinsicsMeasurePolicy() { // from class: androidx.compose.ui.node.LayoutNode$Companion$ErrorMeasurePolicy$1
        @Override // androidx.compose.ui.layout.MeasurePolicy
        /* JADX INFO: renamed from: measure-3p2s80s */
        public /* bridge */ /* synthetic */ MeasureResult mo6measure3p2s80s(MeasureScope measureScope, List list, long j10) {
            return (MeasureResult) m3242measure3p2s80s(measureScope, (List<? extends Measurable>) list, j10);
        }

        @NotNull
        /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
        public Void m3242measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j10) {
            p.k(measureScope, "$this$measure");
            p.k(list, "measurables");
            throw new IllegalStateException("Undefined measure and it is required".toString());
        }
    };

    @NotNull
    private static final sn.a<LayoutNode> Constructor = new sn.a<LayoutNode>() { // from class: androidx.compose.ui.node.LayoutNode$Companion$Constructor$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // sn.a
        @NotNull
        public final LayoutNode invoke() {
            return new LayoutNode(false, 1, null);
        }
    };

    @NotNull
    private static final ViewConfiguration DummyViewConfiguration = new ViewConfiguration() { // from class: androidx.compose.ui.node.LayoutNode$Companion$DummyViewConfiguration$1
        @Override // androidx.compose.ui.platform.ViewConfiguration
        public long getDoubleTapMinTimeMillis() {
            return 40L;
        }

        @Override // androidx.compose.ui.platform.ViewConfiguration
        public long getDoubleTapTimeoutMillis() {
            return 300L;
        }

        @Override // androidx.compose.ui.platform.ViewConfiguration
        public long getLongPressTimeoutMillis() {
            return 400L;
        }

        @Override // androidx.compose.ui.platform.ViewConfiguration
        /* JADX INFO: renamed from: getMinimumTouchTargetSize-MYxV2XQ, reason: not valid java name */
        public long mo3241getMinimumTouchTargetSizeMYxV2XQ() {
            return DpSize.INSTANCE.m3934getZeroMYxV2XQ();
        }

        @Override // androidx.compose.ui.platform.ViewConfiguration
        public float getTouchSlop() {
            return 16.0f;
        }
    };

    @NotNull
    private static final ProvidableModifierLocal ModifierLocalNothing = ModifierLocalKt.modifierLocalOf(new sn.a() { // from class: androidx.compose.ui.node.LayoutNode$Companion$ModifierLocalNothing$1
        @Override // sn.a
        @NotNull
        public final Void invoke() {
            throw new IllegalStateException("default value for sentinel shouldn't be read".toString());
        }
    });

    @NotNull
    private static final LayoutNode$Companion$SentinelModifierLocalProvider$1 SentinelModifierLocalProvider = new ModifierLocalProvider() { // from class: androidx.compose.ui.node.LayoutNode$Companion$SentinelModifierLocalProvider$1
        @Override // androidx.compose.ui.modifier.ModifierLocalProvider
        @NotNull
        public ProvidableModifierLocal getKey() {
            return LayoutNode.ModifierLocalNothing;
        }

        @Override // androidx.compose.ui.modifier.ModifierLocalProvider
        @NotNull
        public Void getValue() {
            throw new IllegalStateException("Sentinel ModifierLocal shouldn't be read".toString());
        }
    };

    /* JADX INFO: compiled from: LayoutNode.kt */
    @Metadata(bv = {}, d1 = {"\u0000?\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\u0006*\u0001\u0017\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$Companion;", "", "Lkotlin/Function0;", "Landroidx/compose/ui/node/LayoutNode;", "Constructor", "Lsn/a;", "getConstructor$ui_release", "()Lsn/a;", "Landroidx/compose/ui/platform/ViewConfiguration;", "DummyViewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getDummyViewConfiguration$ui_release", "()Landroidx/compose/ui/platform/ViewConfiguration;", "Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "ErrorMeasurePolicy", "Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "", "ModifierLocalNothing", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "", "NotPlacedPlaceOrder", "I", "androidx/compose/ui/node/LayoutNode$Companion$SentinelModifierLocalProvider$1", "SentinelModifierLocalProvider", "Landroidx/compose/ui/node/LayoutNode$Companion$SentinelModifierLocalProvider$1;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @NotNull
        public final sn.a<LayoutNode> getConstructor$ui_release() {
            return LayoutNode.Constructor;
        }

        @NotNull
        public final ViewConfiguration getDummyViewConfiguration$ui_release() {
            return LayoutNode.DummyViewConfiguration;
        }
    }

    /* JADX INFO: compiled from: LayoutNode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$LayoutState;", "", "(Ljava/lang/String;I)V", "Measuring", "LayingOut", "Idle", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public enum LayoutState {
        Measuring,
        LayingOut,
        Idle
    }

    /* JADX INFO: compiled from: LayoutNode.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\"\u0010\r\u001a\u00020\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\"\u0010\u000f\u001a\u00020\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\"\u0010\u0010\u001a\u00020\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000e\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "error", "", "(Ljava/lang/String;)V", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "", "maxIntrinsicWidth", "height", "minIntrinsicHeight", "minIntrinsicWidth", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static abstract class NoIntrinsicsMeasurePolicy implements MeasurePolicy {

        @NotNull
        private final String error;

        public NoIntrinsicsMeasurePolicy(@NotNull String str) {
            p.k(str, "error");
            this.error = str;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return ((Number) m3243maxIntrinsicHeight(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i10)).intValue();
        }

        @NotNull
        /* JADX INFO: renamed from: maxIntrinsicHeight, reason: collision with other method in class */
        public Void m3243maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i10) {
            p.k(intrinsicMeasureScope, "<this>");
            p.k(list, "measurables");
            throw new IllegalStateException(this.error.toString());
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return ((Number) m3244maxIntrinsicWidth(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i10)).intValue();
        }

        @NotNull
        /* JADX INFO: renamed from: maxIntrinsicWidth, reason: collision with other method in class */
        public Void m3244maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i10) {
            p.k(intrinsicMeasureScope, "<this>");
            p.k(list, "measurables");
            throw new IllegalStateException(this.error.toString());
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return ((Number) m3245minIntrinsicHeight(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i10)).intValue();
        }

        @NotNull
        /* JADX INFO: renamed from: minIntrinsicHeight, reason: collision with other method in class */
        public Void m3245minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i10) {
            p.k(intrinsicMeasureScope, "<this>");
            p.k(list, "measurables");
            throw new IllegalStateException(this.error.toString());
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return ((Number) m3246minIntrinsicWidth(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i10)).intValue();
        }

        @NotNull
        /* JADX INFO: renamed from: minIntrinsicWidth, reason: collision with other method in class */
        public Void m3246minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i10) {
            p.k(intrinsicMeasureScope, "<this>");
            p.k(list, "measurables");
            throw new IllegalStateException(this.error.toString());
        }
    }

    /* JADX INFO: compiled from: LayoutNode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "", "(Ljava/lang/String;I)V", "InMeasureBlock", "InLayoutBlock", "NotUsed", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public enum UsageByParent {
        InMeasureBlock,
        InLayoutBlock,
        NotUsed
    }

    /* JADX INFO: compiled from: LayoutNode.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutState.values().length];
            iArr[LayoutState.Idle.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LayoutNode() {
        this(false, 1, null);
    }

    public LayoutNode(boolean z10) {
        this.isVirtual = z10;
        this._foldedChildren = new MutableVector<>(new LayoutNode[16], 0);
        this.layoutState = LayoutState.Idle;
        this.wrapperCache = new MutableVector<>(new ModifiedLayoutNode[16], 0);
        this._zSortedChildren = new MutableVector<>(new LayoutNode[16], 0);
        this.zSortedChildrenInvalidated = true;
        this.measurePolicy = ErrorMeasurePolicy;
        this.intrinsicsPolicy = new IntrinsicsPolicy(this);
        this.density = DensityKt.Density$default(1.0f, 0.0f, 2, null);
        this.measureScope = new LayoutNode$measureScope$1(this);
        this.layoutDirection = LayoutDirection.Ltr;
        this.viewConfiguration = DummyViewConfiguration;
        this.alignmentLines = new LayoutNodeAlignmentLines(this);
        this.placeOrder = Integer.MAX_VALUE;
        this.previousPlaceOrder = Integer.MAX_VALUE;
        UsageByParent usageByParent = UsageByParent.NotUsed;
        this.measuredByParent = usageByParent;
        this.intrinsicsUsageByParent = usageByParent;
        this.previousIntrinsicsUsageByParent = usageByParent;
        InnerPlaceable innerPlaceable = new InnerPlaceable(this);
        this.innerLayoutNodeWrapper = innerPlaceable;
        this.outerMeasurablePlaceable = new OuterMeasurablePlaceable(this, innerPlaceable);
        this.innerLayerWrapperIsDirty = true;
        ModifierLocalProviderEntity modifierLocalProviderEntity = new ModifierLocalProviderEntity(this, SentinelModifierLocalProvider);
        this.modifierLocalsHead = modifierLocalProviderEntity;
        this.modifierLocalsTail = modifierLocalProviderEntity;
        this.modifier = Modifier.INSTANCE;
        this.ZComparator = new Comparator() { // from class: androidx.compose.ui.node.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return LayoutNode.m3233ZComparator$lambda52((LayoutNode) obj, (LayoutNode) obj2);
            }
        };
    }

    public /* synthetic */ LayoutNode(boolean z10, int i10, i iVar) {
        this((i10 & 1) != 0 ? false : z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ZComparator$lambda-52, reason: not valid java name */
    public static final int m3233ZComparator$lambda52(LayoutNode layoutNode, LayoutNode layoutNode2) {
        float f10 = layoutNode.zIndex;
        float f11 = layoutNode2.zIndex;
        return (f10 > f11 ? 1 : (f10 == f11 ? 0 : -1)) == 0 ? p.m(layoutNode.placeOrder, layoutNode2.placeOrder) : Float.compare(f10, f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addModifierLocalConsumer(ModifierLocalConsumer modifierLocalConsumer, ModifierLocalProviderEntity modifierLocalProviderEntity, MutableVector<ModifierLocalConsumerEntity> mutableVector) {
        int i10;
        ModifierLocalConsumerEntity modifierLocalConsumerEntityRemoveAt;
        int size = mutableVector.getSize();
        if (size > 0) {
            ModifierLocalConsumerEntity[] content = mutableVector.getContent();
            i10 = 0;
            do {
                if (content[i10].getModifier() == modifierLocalConsumer) {
                    break;
                } else {
                    i10++;
                }
            } while (i10 < size);
            i10 = -1;
        } else {
            i10 = -1;
        }
        if (i10 < 0) {
            modifierLocalConsumerEntityRemoveAt = new ModifierLocalConsumerEntity(modifierLocalProviderEntity, modifierLocalConsumer);
        } else {
            modifierLocalConsumerEntityRemoveAt = mutableVector.removeAt(i10);
            modifierLocalConsumerEntityRemoveAt.setProvider(modifierLocalProviderEntity);
        }
        modifierLocalProviderEntity.getConsumers().add(modifierLocalConsumerEntityRemoveAt);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ModifierLocalProviderEntity addModifierLocalProvider(ModifierLocalProvider<?> mod, ModifierLocalProviderEntity provider) {
        ModifierLocalProviderEntity next = provider.getNext();
        while (next != null && next.getModifier() != mod) {
            next = next.getNext();
        }
        if (next == null) {
            next = new ModifierLocalProviderEntity(this, mod);
        } else {
            ModifierLocalProviderEntity prev = next.getPrev();
            if (prev != null) {
                prev.setNext(next.getNext());
            }
            ModifierLocalProviderEntity next2 = next.getNext();
            if (next2 != null) {
                next2.setPrev(next.getPrev());
            }
        }
        next.setNext(provider.getNext());
        ModifierLocalProviderEntity next3 = provider.getNext();
        if (next3 != null) {
            next3.setPrev(next);
        }
        provider.setNext(next);
        next.setPrev(provider);
        return next;
    }

    private final void alignmentLinesQueriedByModifier() {
        if (this.layoutState != LayoutState.Measuring) {
            this.alignmentLines.setUsedByModifierLayout$ui_release(true);
            return;
        }
        this.alignmentLines.setUsedByModifierMeasurement$ui_release(true);
        if (this.alignmentLines.getDirty()) {
            markLayoutPending$ui_release();
        }
    }

    private final void clearSubtreeIntrinsicsUsage() {
        this.previousIntrinsicsUsageByParent = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = UsageByParent.NotUsed;
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            int i10 = 0;
            LayoutNode[] content = mutableVector.getContent();
            do {
                LayoutNode layoutNode = content[i10];
                if (layoutNode.intrinsicsUsageByParent != UsageByParent.NotUsed) {
                    layoutNode.clearSubtreeIntrinsicsUsage();
                }
                i10++;
            } while (i10 < size);
        }
    }

    private final void clearSubtreePlacementIntrinsicsUsage() {
        this.previousIntrinsicsUsageByParent = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = UsageByParent.NotUsed;
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            int i10 = 0;
            LayoutNode[] content = mutableVector.getContent();
            do {
                LayoutNode layoutNode = content[i10];
                if (layoutNode.intrinsicsUsageByParent == UsageByParent.InLayoutBlock) {
                    layoutNode.clearSubtreePlacementIntrinsicsUsage();
                }
                i10++;
            } while (i10 < size);
        }
    }

    private final void copyWrappersToCache() {
        LayoutNodeWrapper outerLayoutNodeWrapper$ui_release = getOuterLayoutNodeWrapper$ui_release();
        LayoutNodeWrapper layoutNodeWrapper = this.innerLayoutNodeWrapper;
        while (!p.f(outerLayoutNodeWrapper$ui_release, layoutNodeWrapper)) {
            ModifiedLayoutNode modifiedLayoutNode = (ModifiedLayoutNode) outerLayoutNodeWrapper$ui_release;
            this.wrapperCache.add(modifiedLayoutNode);
            outerLayoutNodeWrapper$ui_release = modifiedLayoutNode.getWrapped();
        }
    }

    private final String debugTreeToString(int depth) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < depth; i10++) {
            sb2.append("  ");
        }
        sb2.append("|-");
        sb2.append(toString());
        sb2.append('\n');
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i11 = 0;
            do {
                sb2.append(content[i11].debugTreeToString(depth + 1));
                i11++;
            } while (i11 < size);
        }
        String string = sb2.toString();
        p.j(string, "tree.toString()");
        if (depth != 0) {
            return string;
        }
        String strSubstring = string.substring(0, string.length() - 1);
        p.j(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static /* synthetic */ String debugTreeToString$default(LayoutNode layoutNode, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return layoutNode.debugTreeToString(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FocusPropertiesModifier findFocusPropertiesModifier(FocusOrderModifier mod, MutableVector<ModifierLocalConsumerEntity> consumers) {
        ModifierLocalConsumerEntity modifierLocalConsumerEntity;
        int size = consumers.getSize();
        if (size > 0) {
            ModifierLocalConsumerEntity[] content = consumers.getContent();
            int i10 = 0;
            do {
                modifierLocalConsumerEntity = content[i10];
                ModifierLocalConsumerEntity modifierLocalConsumerEntity2 = modifierLocalConsumerEntity;
                if ((modifierLocalConsumerEntity2.getModifier() instanceof FocusPropertiesModifier) && (((FocusPropertiesModifier) modifierLocalConsumerEntity2.getModifier()).getFocusPropertiesScope() instanceof FocusOrderModifierToProperties) && ((FocusOrderModifierToProperties) ((FocusPropertiesModifier) modifierLocalConsumerEntity2.getModifier()).getFocusPropertiesScope()).getModifier() == mod) {
                    break;
                }
                i10++;
            } while (i10 < size);
            modifierLocalConsumerEntity = null;
        } else {
            modifierLocalConsumerEntity = null;
        }
        ModifierLocalConsumerEntity modifierLocalConsumerEntity3 = modifierLocalConsumerEntity;
        ModifierLocalConsumer modifier = modifierLocalConsumerEntity3 != null ? modifierLocalConsumerEntity3.getModifier() : null;
        if (modifier instanceof FocusPropertiesModifier) {
            return (FocusPropertiesModifier) modifier;
        }
        return null;
    }

    private final void forEachDelegate(l<? super ModifiedLayoutNode, r> lVar) {
        LayoutNodeWrapper outerLayoutNodeWrapper$ui_release = getOuterLayoutNodeWrapper$ui_release();
        LayoutNodeWrapper layoutNodeWrapper = this.innerLayoutNodeWrapper;
        while (!p.f(outerLayoutNodeWrapper$ui_release, layoutNodeWrapper)) {
            ModifiedLayoutNode modifiedLayoutNode = (ModifiedLayoutNode) outerLayoutNodeWrapper$ui_release;
            lVar.invoke(modifiedLayoutNode);
            outerLayoutNodeWrapper$ui_release = modifiedLayoutNode.getWrapped();
        }
    }

    private final void forEachDelegateIncludingInner(l<? super LayoutNodeWrapper, r> lVar) {
        LayoutNodeWrapper wrapped$ui_release = this.innerLayoutNodeWrapper.getWrapped();
        for (LayoutNodeWrapper outerLayoutNodeWrapper$ui_release = getOuterLayoutNodeWrapper$ui_release(); !p.f(outerLayoutNodeWrapper$ui_release, wrapped$ui_release) && outerLayoutNodeWrapper$ui_release != null; outerLayoutNodeWrapper$ui_release = outerLayoutNodeWrapper$ui_release.getWrapped()) {
            lVar.invoke(outerLayoutNodeWrapper$ui_release);
        }
    }

    private final void forEachModifierLocalProvider(l<? super ModifierLocalProviderEntity, r> lVar) {
        for (ModifierLocalProviderEntity next = this.modifierLocalsHead; next != null; next = next.getNext()) {
            lVar.invoke(next);
        }
    }

    public static /* synthetic */ void getCanMultiMeasure$ui_release$annotations() {
    }

    private final LayoutNodeWrapper getInnerLayerWrapper() {
        if (this.innerLayerWrapperIsDirty) {
            LayoutNodeWrapper wrappedBy$ui_release = this.innerLayoutNodeWrapper;
            LayoutNodeWrapper wrappedBy$ui_release2 = getOuterLayoutNodeWrapper$ui_release().getWrappedBy();
            this._innerLayerWrapper = null;
            while (true) {
                if (p.f(wrappedBy$ui_release, wrappedBy$ui_release2)) {
                    break;
                }
                if ((wrappedBy$ui_release != null ? wrappedBy$ui_release.getLayer() : null) != null) {
                    this._innerLayerWrapper = wrappedBy$ui_release;
                    break;
                }
                wrappedBy$ui_release = wrappedBy$ui_release != null ? wrappedBy$ui_release.getWrappedBy() : null;
            }
        }
        LayoutNodeWrapper layoutNodeWrapper = this._innerLayerWrapper;
        if (layoutNodeWrapper == null || layoutNodeWrapper.getLayer() != null) {
            return layoutNodeWrapper;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public static /* synthetic */ void getZSortedChildren$annotations() {
    }

    public static /* synthetic */ void get_children$ui_release$annotations() {
    }

    private final boolean hasNewPositioningCallback() {
        final MutableVector<Pair<LayoutNodeWrapper, OnGloballyPositionedModifier>> mutableVector = this.onPositionedCallbacks;
        return ((Boolean) getModifier().foldOut(Boolean.FALSE, new sn.p<Modifier.Element, Boolean, Boolean>() { // from class: androidx.compose.ui.node.LayoutNode.hasNewPositioningCallback.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
            @org.jetbrains.annotations.NotNull
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Boolean invoke(@org.jetbrains.annotations.NotNull androidx.compose.ui.Modifier.Element r7, boolean r8) {
                /*
                    r6 = this;
                    java.lang.String r0 = "mod"
                    tn.p.k(r7, r0)
                    r0 = 0
                    if (r8 != 0) goto L35
                    boolean r8 = r7 instanceof androidx.compose.ui.layout.OnGloballyPositionedModifier
                    if (r8 == 0) goto L36
                    androidx.compose.runtime.collection.MutableVector<kotlin.Pair<androidx.compose.ui.node.LayoutNodeWrapper, androidx.compose.ui.layout.OnGloballyPositionedModifier>> r8 = r1
                    r1 = 0
                    if (r8 == 0) goto L33
                    int r2 = r8.getSize()
                    if (r2 <= 0) goto L31
                    java.lang.Object[] r8 = r8.getContent()
                    r3 = r0
                L1c:
                    r4 = r8[r3]
                    r5 = r4
                    kotlin.Pair r5 = (kotlin.Pair) r5
                    java.lang.Object r5 = r5.getSecond()
                    boolean r5 = tn.p.f(r7, r5)
                    if (r5 == 0) goto L2d
                    r1 = r4
                    goto L31
                L2d:
                    int r3 = r3 + 1
                    if (r3 < r2) goto L1c
                L31:
                    kotlin.Pair r1 = (kotlin.Pair) r1
                L33:
                    if (r1 != 0) goto L36
                L35:
                    r0 = 1
                L36:
                    java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutNode.AnonymousClass1.invoke(androidx.compose.ui.Modifier$Element, boolean):java.lang.Boolean");
            }

            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Boolean mo2invoke(Modifier.Element element, Boolean bool) {
                return invoke(element, bool.booleanValue());
            }
        })).booleanValue();
    }

    /* JADX INFO: renamed from: hitTest-M_7yMNQ$ui_release$default, reason: not valid java name */
    public static /* synthetic */ void m3234hitTestM_7yMNQ$ui_release$default(LayoutNode layoutNode, long j10, HitTestResult hitTestResult, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        boolean z12 = z10;
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        layoutNode.m3237hitTestM_7yMNQ$ui_release(j10, hitTestResult, z12, z11);
    }

    private final void invalidateUnfoldedVirtualChildren() {
        LayoutNode parent$ui_release;
        if (this.virtualChildrenCount > 0) {
            this.unfoldedVirtualChildrenListDirty = true;
        }
        if (!this.isVirtual || (parent$ui_release = getParent$ui_release()) == null) {
            return;
        }
        parent$ui_release.unfoldedVirtualChildrenListDirty = true;
    }

    private final void markNodeAndSubtreeAsPlaced() {
        this.isPlaced = true;
        LayoutNodeWrapper wrapped$ui_release = this.innerLayoutNodeWrapper.getWrapped();
        for (LayoutNodeWrapper outerLayoutNodeWrapper$ui_release = getOuterLayoutNodeWrapper$ui_release(); !p.f(outerLayoutNodeWrapper$ui_release, wrapped$ui_release) && outerLayoutNodeWrapper$ui_release != null; outerLayoutNodeWrapper$ui_release = outerLayoutNodeWrapper$ui_release.getWrapped()) {
            if (outerLayoutNodeWrapper$ui_release.getLastLayerDrawingWasSkipped()) {
                outerLayoutNodeWrapper$ui_release.invalidateLayer();
            }
        }
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            int i10 = 0;
            LayoutNode[] content = mutableVector.getContent();
            do {
                LayoutNode layoutNode = content[i10];
                if (layoutNode.placeOrder != Integer.MAX_VALUE) {
                    layoutNode.markNodeAndSubtreeAsPlaced();
                    rescheduleRemeasureOrRelayout(layoutNode);
                }
                i10++;
            } while (i10 < size);
        }
    }

    private final void markReusedModifiers(Modifier modifier) {
        MutableVector<ModifiedLayoutNode> mutableVector = this.wrapperCache;
        int size = mutableVector.getSize();
        if (size > 0) {
            ModifiedLayoutNode[] content = mutableVector.getContent();
            int i10 = 0;
            do {
                content[i10].setToBeReusedForSameModifier(false);
                i10++;
            } while (i10 < size);
        }
        modifier.foldIn(r.f5635a, new sn.p<r, Modifier.Element, r>() { // from class: androidx.compose.ui.node.LayoutNode.markReusedModifiers.2
            {
                super(2);
            }

            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ r mo2invoke(r rVar, Modifier.Element element) {
                invoke2(rVar, element);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull r rVar, @NotNull Modifier.Element element) {
                Object obj;
                p.k(rVar, "<anonymous parameter 0>");
                p.k(element, "mod");
                MutableVector mutableVector2 = LayoutNode.this.wrapperCache;
                int size2 = mutableVector2.getSize();
                if (size2 > 0) {
                    int i11 = size2 - 1;
                    Object[] content2 = mutableVector2.getContent();
                    do {
                        obj = content2[i11];
                        ModifiedLayoutNode modifiedLayoutNode = (ModifiedLayoutNode) obj;
                        if (modifiedLayoutNode.getModifier() == element && !modifiedLayoutNode.getToBeReusedForSameModifier()) {
                            break;
                        } else {
                            i11--;
                        }
                    } while (i11 >= 0);
                    obj = null;
                } else {
                    obj = null;
                }
                ModifiedLayoutNode modifiedLayoutNode2 = (ModifiedLayoutNode) obj;
                if (modifiedLayoutNode2 == null) {
                    return;
                }
                modifiedLayoutNode2.setToBeReusedForSameModifier(true);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void markSubtreeAsNotPlaced() {
        if (getIsPlaced()) {
            int i10 = 0;
            this.isPlaced = false;
            MutableVector<LayoutNode> mutableVector = get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                do {
                    content[i10].markSubtreeAsNotPlaced();
                    i10++;
                } while (i10 < size);
            }
        }
    }

    private final void onBeforeLayoutChildren() {
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i10 = 0;
            do {
                LayoutNode layoutNode = content[i10];
                if (layoutNode.measurePending && layoutNode.measuredByParent == UsageByParent.InMeasureBlock && m3236remeasure_Sx5XlM$ui_release$default(layoutNode, null, 1, null)) {
                    requestRemeasure$ui_release$default(this, false, 1, null);
                }
                i10++;
            } while (i10 < size);
        }
    }

    private final void onChildRemoved(LayoutNode layoutNode) {
        if (this.owner != null) {
            layoutNode.detach$ui_release();
        }
        layoutNode._foldedParent = null;
        layoutNode.getOuterLayoutNodeWrapper$ui_release().setWrappedBy$ui_release(null);
        if (layoutNode.isVirtual) {
            this.virtualChildrenCount--;
            MutableVector<LayoutNode> mutableVector = layoutNode._foldedChildren;
            int size = mutableVector.getSize();
            if (size > 0) {
                int i10 = 0;
                LayoutNode[] content = mutableVector.getContent();
                do {
                    content[i10].getOuterLayoutNodeWrapper$ui_release().setWrappedBy$ui_release(null);
                    i10++;
                } while (i10 < size);
            }
        }
        invalidateUnfoldedVirtualChildren();
        onZSortedChildrenInvalidated();
    }

    private final void onDensityOrLayoutDirectionChanged() {
        requestRemeasure$ui_release$default(this, false, 1, null);
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release != null) {
            parent$ui_release.invalidateLayer$ui_release();
        }
        invalidateLayers$ui_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onZSortedChildrenInvalidated() {
        if (!this.isVirtual) {
            this.zSortedChildrenInvalidated = true;
            return;
        }
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release != null) {
            parent$ui_release.onZSortedChildrenInvalidated();
        }
    }

    private final void recreateUnfoldedChildrenIfDirty() {
        if (this.unfoldedVirtualChildrenListDirty) {
            int i10 = 0;
            this.unfoldedVirtualChildrenListDirty = false;
            MutableVector<LayoutNode> mutableVector = this._unfoldedChildren;
            if (mutableVector == null) {
                MutableVector<LayoutNode> mutableVector2 = new MutableVector<>(new LayoutNode[16], 0);
                this._unfoldedChildren = mutableVector2;
                mutableVector = mutableVector2;
            }
            mutableVector.clear();
            MutableVector<LayoutNode> mutableVector3 = this._foldedChildren;
            int size = mutableVector3.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector3.getContent();
                do {
                    LayoutNode layoutNode = content[i10];
                    if (layoutNode.isVirtual) {
                        mutableVector.addAll(mutableVector.getSize(), layoutNode.get_children$ui_release());
                    } else {
                        mutableVector.add(layoutNode);
                    }
                    i10++;
                } while (i10 < size);
            }
        }
    }

    /* JADX INFO: renamed from: remeasure-_Sx5XlM$ui_release$default, reason: not valid java name */
    public static /* synthetic */ boolean m3236remeasure_Sx5XlM$ui_release$default(LayoutNode layoutNode, Constraints constraints, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            constraints = layoutNode.outerMeasurablePlaceable.m3277getLastConstraintsDWUhwKw();
        }
        return layoutNode.m3240remeasure_Sx5XlM$ui_release(constraints);
    }

    public static /* synthetic */ void requestRelayout$ui_release$default(LayoutNode layoutNode, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        layoutNode.requestRelayout$ui_release(z10);
    }

    public static /* synthetic */ void requestRemeasure$ui_release$default(LayoutNode layoutNode, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        layoutNode.requestRemeasure$ui_release(z10);
    }

    private final void rescheduleRemeasureOrRelayout(LayoutNode layoutNode) {
        if (WhenMappings.$EnumSwitchMapping$0[layoutNode.layoutState.ordinal()] != 1) {
            throw new IllegalStateException("Unexpected state " + layoutNode.layoutState);
        }
        if (layoutNode.measurePending) {
            layoutNode.requestRemeasure$ui_release(true);
        } else if (layoutNode.layoutPending) {
            layoutNode.requestRelayout$ui_release(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ModifiedLayoutNode reuseLayoutNodeWrapper(LayoutNodeWrapper toWrap, LayoutModifier modifier) {
        int i10;
        if (this.wrapperCache.isEmpty()) {
            return null;
        }
        MutableVector<ModifiedLayoutNode> mutableVector = this.wrapperCache;
        int size = mutableVector.getSize();
        int i11 = -1;
        if (size > 0) {
            i10 = size - 1;
            ModifiedLayoutNode[] content = mutableVector.getContent();
            do {
                ModifiedLayoutNode modifiedLayoutNode = content[i10];
                if (modifiedLayoutNode.getToBeReusedForSameModifier() && modifiedLayoutNode.getModifier() == modifier) {
                    break;
                }
                i10--;
            } while (i10 >= 0);
            i10 = -1;
        } else {
            i10 = -1;
        }
        if (i10 < 0) {
            MutableVector<ModifiedLayoutNode> mutableVector2 = this.wrapperCache;
            int size2 = mutableVector2.getSize();
            if (size2 > 0) {
                int i12 = size2 - 1;
                ModifiedLayoutNode[] content2 = mutableVector2.getContent();
                while (true) {
                    if (!content2[i12].getToBeReusedForSameModifier()) {
                        i11 = i12;
                        break;
                    }
                    i12--;
                    if (i12 < 0) {
                        break;
                    }
                }
            }
            i10 = i11;
        }
        if (i10 < 0) {
            return null;
        }
        ModifiedLayoutNode modifiedLayoutNodeRemoveAt = this.wrapperCache.removeAt(i10);
        modifiedLayoutNodeRemoveAt.setModifier(modifier);
        modifiedLayoutNodeRemoveAt.setWrapped(toWrap);
        return modifiedLayoutNodeRemoveAt;
    }

    private final void setModifierLocals(Modifier modifier) {
        int i10 = 0;
        final MutableVector mutableVector = new MutableVector(new ModifierLocalConsumerEntity[16], 0);
        for (ModifierLocalProviderEntity next = this.modifierLocalsHead; next != null; next = next.getNext()) {
            mutableVector.addAll(mutableVector.getSize(), next.getConsumers());
            next.getConsumers().clear();
        }
        ModifierLocalProviderEntity modifierLocalProviderEntity = (ModifierLocalProviderEntity) modifier.foldIn(this.modifierLocalsHead, new sn.p<ModifierLocalProviderEntity, Modifier.Element, ModifierLocalProviderEntity>() { // from class: androidx.compose.ui.node.LayoutNode.setModifierLocals.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final ModifierLocalProviderEntity mo2invoke(@NotNull ModifierLocalProviderEntity modifierLocalProviderEntity2, @NotNull Modifier.Element element) {
                p.k(modifierLocalProviderEntity2, "lastProvider");
                p.k(element, "mod");
                if (element instanceof FocusOrderModifier) {
                    FocusOrderModifier focusOrderModifier = (FocusOrderModifier) element;
                    FocusPropertiesModifier focusPropertiesModifierFindFocusPropertiesModifier = LayoutNode.this.findFocusPropertiesModifier(focusOrderModifier, mutableVector);
                    if (focusPropertiesModifierFindFocusPropertiesModifier == null) {
                        final FocusOrderModifierToProperties focusOrderModifierToProperties = new FocusOrderModifierToProperties(focusOrderModifier);
                        focusPropertiesModifierFindFocusPropertiesModifier = new FocusPropertiesModifier(focusOrderModifierToProperties, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, r>() { // from class: androidx.compose.ui.node.LayoutNode$setModifierLocals$1$invoke$lambda-1$$inlined$debugInspectorInfo$1
                            {
                                super(1);
                            }

                            @Override // sn.l
                            public /* bridge */ /* synthetic */ r invoke(InspectorInfo inspectorInfo) {
                                invoke2(inspectorInfo);
                                return r.f5635a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                                p.k(inspectorInfo, "$this$null");
                                inspectorInfo.setName("focusProperties");
                                inspectorInfo.getProperties().set("scope", focusOrderModifierToProperties);
                            }
                        } : InspectableValueKt.getNoInspectorInfo());
                    }
                    LayoutNode.this.addModifierLocalConsumer(focusPropertiesModifierFindFocusPropertiesModifier, modifierLocalProviderEntity2, mutableVector);
                    modifierLocalProviderEntity2 = LayoutNode.this.addModifierLocalProvider(focusPropertiesModifierFindFocusPropertiesModifier, modifierLocalProviderEntity2);
                }
                if (element instanceof ModifierLocalConsumer) {
                    LayoutNode.this.addModifierLocalConsumer((ModifierLocalConsumer) element, modifierLocalProviderEntity2, mutableVector);
                }
                return element instanceof ModifierLocalProvider ? LayoutNode.this.addModifierLocalProvider((ModifierLocalProvider) element, modifierLocalProviderEntity2) : modifierLocalProviderEntity2;
            }
        });
        this.modifierLocalsTail = modifierLocalProviderEntity;
        this.modifierLocalsTail.setNext(null);
        if (isAttached()) {
            int size = mutableVector.getSize();
            if (size > 0) {
                Object[] content = mutableVector.getContent();
                do {
                    ((ModifierLocalConsumerEntity) content[i10]).detach();
                    i10++;
                } while (i10 < size);
            }
            for (ModifierLocalProviderEntity next2 = modifierLocalProviderEntity.getNext(); next2 != null; next2 = next2.getNext()) {
                next2.detach();
            }
            for (ModifierLocalProviderEntity next3 = this.modifierLocalsHead; next3 != null; next3 = next3.getNext()) {
                next3.attachDelayed();
            }
        }
    }

    private final boolean shouldInvalidateParentLayer() {
        LayoutNodeWrapper wrapped$ui_release = this.innerLayoutNodeWrapper.getWrapped();
        for (LayoutNodeWrapper outerLayoutNodeWrapper$ui_release = getOuterLayoutNodeWrapper$ui_release(); !p.f(outerLayoutNodeWrapper$ui_release, wrapped$ui_release) && outerLayoutNodeWrapper$ui_release != null; outerLayoutNodeWrapper$ui_release = outerLayoutNodeWrapper$ui_release.getWrapped()) {
            if (outerLayoutNodeWrapper$ui_release.getLayer() != null) {
                return false;
            }
            if (EntityList.m3212has0OSVbXo(outerLayoutNodeWrapper$ui_release.m3262getEntitiesCHwCgZE(), EntityList.INSTANCE.m3218getDrawEntityTypeEEbPh1w())) {
                return true;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void attach$ui_release(@org.jetbrains.annotations.NotNull androidx.compose.ui.node.Owner r9) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutNode.attach$ui_release(androidx.compose.ui.node.Owner):void");
    }

    @NotNull
    public final Map<AlignmentLine, Integer> calculateAlignmentLines$ui_release() {
        if (!this.outerMeasurablePlaceable.getDuringAlignmentLinesQuery$ui_release()) {
            alignmentLinesQueriedByModifier();
        }
        layoutChildren$ui_release();
        return this.alignmentLines.getLastCalculation();
    }

    public final void detach$ui_release() {
        Owner owner = this.owner;
        if (owner == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot detach node that is already detached!  Tree: ");
            LayoutNode parent$ui_release = getParent$ui_release();
            sb2.append(parent$ui_release != null ? debugTreeToString$default(parent$ui_release, 0, 1, null) : null);
            throw new IllegalStateException(sb2.toString().toString());
        }
        LayoutNode parent$ui_release2 = getParent$ui_release();
        if (parent$ui_release2 != null) {
            parent$ui_release2.invalidateLayer$ui_release();
            requestRemeasure$ui_release$default(parent$ui_release2, false, 1, null);
        }
        this.alignmentLines.reset$ui_release();
        l<? super Owner, r> lVar = this.onDetach;
        if (lVar != null) {
            lVar.invoke(owner);
        }
        for (ModifierLocalProviderEntity next = this.modifierLocalsHead; next != null; next = next.getNext()) {
            next.detach();
        }
        LayoutNodeWrapper wrapped$ui_release = this.innerLayoutNodeWrapper.getWrapped();
        for (LayoutNodeWrapper outerLayoutNodeWrapper$ui_release = getOuterLayoutNodeWrapper$ui_release(); !p.f(outerLayoutNodeWrapper$ui_release, wrapped$ui_release) && outerLayoutNodeWrapper$ui_release != null; outerLayoutNodeWrapper$ui_release = outerLayoutNodeWrapper$ui_release.getWrapped()) {
            outerLayoutNodeWrapper$ui_release.detach();
        }
        if (SemanticsNodeKt.getOuterSemantics(this) != null) {
            owner.onSemanticsChange();
        }
        owner.onDetach(this);
        this.owner = null;
        this.depth = 0;
        MutableVector<LayoutNode> mutableVector = this._foldedChildren;
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i10 = 0;
            do {
                content[i10].detach$ui_release();
                i10++;
            } while (i10 < size);
        }
        this.placeOrder = Integer.MAX_VALUE;
        this.previousPlaceOrder = Integer.MAX_VALUE;
        this.isPlaced = false;
    }

    public final void dispatchOnPositionedCallbacks$ui_release() {
        MutableVector<Pair<LayoutNodeWrapper, OnGloballyPositionedModifier>> mutableVector;
        int size;
        if (this.layoutState != LayoutState.Idle || this.layoutPending || this.measurePending || !getIsPlaced() || (mutableVector = this.onPositionedCallbacks) == null || (size = mutableVector.getSize()) <= 0) {
            return;
        }
        int i10 = 0;
        Pair<LayoutNodeWrapper, OnGloballyPositionedModifier>[] content = mutableVector.getContent();
        do {
            Pair<LayoutNodeWrapper, OnGloballyPositionedModifier> pair = content[i10];
            pair.getSecond().onGloballyPositioned(pair.getFirst());
            i10++;
        } while (i10 < size);
    }

    public final void draw$ui_release(@NotNull Canvas canvas) {
        p.k(canvas, "canvas");
        getOuterLayoutNodeWrapper$ui_release().draw(canvas);
    }

    @Override // androidx.compose.ui.layout.Remeasurement
    public void forceRemeasure() {
        requestRemeasure$ui_release$default(this, false, 1, null);
        Constraints constraintsM3277getLastConstraintsDWUhwKw = this.outerMeasurablePlaceable.m3277getLastConstraintsDWUhwKw();
        if (constraintsM3277getLastConstraintsDWUhwKw != null) {
            Owner owner = this.owner;
            if (owner != null) {
                owner.mo3287measureAndLayout0kLqBqw(this, constraintsM3277getLastConstraintsDWUhwKw.getValue());
                return;
            }
            return;
        }
        Owner owner2 = this.owner;
        if (owner2 != null) {
            Owner.measureAndLayout$default(owner2, false, 1, null);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getAlignmentLines$ui_release, reason: from getter */
    public final LayoutNodeAlignmentLines getAlignmentLines() {
        return this.alignmentLines;
    }

    /* JADX INFO: renamed from: getCanMultiMeasure$ui_release, reason: from getter */
    public final boolean getCanMultiMeasure() {
        return this.canMultiMeasure;
    }

    @NotNull
    public final List<LayoutNode> getChildren$ui_release() {
        return get_children$ui_release().asMutableList();
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    @NotNull
    public LayoutCoordinates getCoordinates() {
        return this.innerLayoutNodeWrapper;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo, androidx.compose.ui.node.ComposeUiNode
    @NotNull
    public Density getDensity() {
        return this.density;
    }

    /* JADX INFO: renamed from: getDepth$ui_release, reason: from getter */
    public final int getDepth() {
        return this.depth;
    }

    @NotNull
    public final List<LayoutNode> getFoldedChildren$ui_release() {
        return this._foldedChildren.asMutableList();
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public int getHeight() {
        return this.outerMeasurablePlaceable.getHeight();
    }

    /* JADX INFO: renamed from: getInnerLayerWrapperIsDirty$ui_release, reason: from getter */
    public final boolean getInnerLayerWrapperIsDirty() {
        return this.innerLayerWrapperIsDirty;
    }

    @NotNull
    /* JADX INFO: renamed from: getInnerLayoutNodeWrapper$ui_release, reason: from getter */
    public final LayoutNodeWrapper getInnerLayoutNodeWrapper() {
        return this.innerLayoutNodeWrapper;
    }

    @NotNull
    /* JADX INFO: renamed from: getIntrinsicsPolicy$ui_release, reason: from getter */
    public final IntrinsicsPolicy getIntrinsicsPolicy() {
        return this.intrinsicsPolicy;
    }

    @NotNull
    /* JADX INFO: renamed from: getIntrinsicsUsageByParent$ui_release, reason: from getter */
    public final UsageByParent getIntrinsicsUsageByParent() {
        return this.intrinsicsUsageByParent;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo, androidx.compose.ui.node.ComposeUiNode
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    /* JADX INFO: renamed from: getLayoutPending$ui_release, reason: from getter */
    public final boolean getLayoutPending() {
        return this.layoutPending;
    }

    @NotNull
    /* JADX INFO: renamed from: getLayoutState$ui_release, reason: from getter */
    public final LayoutState getLayoutState() {
        return this.layoutState;
    }

    @NotNull
    public final LayoutNodeDrawScope getMDrawScope$ui_release() {
        return LayoutNodeKt.requireOwner(this).getSharedDrawScope();
    }

    /* JADX INFO: renamed from: getMeasurePending$ui_release, reason: from getter */
    public final boolean getMeasurePending() {
        return this.measurePending;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    @NotNull
    public MeasurePolicy getMeasurePolicy() {
        return this.measurePolicy;
    }

    @NotNull
    /* JADX INFO: renamed from: getMeasureScope$ui_release, reason: from getter */
    public final MeasureScope getMeasureScope() {
        return this.measureScope;
    }

    @NotNull
    /* JADX INFO: renamed from: getMeasuredByParent$ui_release, reason: from getter */
    public final UsageByParent getMeasuredByParent() {
        return this.measuredByParent;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    @NotNull
    public Modifier getModifier() {
        return this.modifier;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    @NotNull
    public List<ModifierInfo> getModifierInfo() {
        MutableVector mutableVector = new MutableVector(new ModifierInfo[16], 0);
        LayoutNodeWrapper outerLayoutNodeWrapper$ui_release = getOuterLayoutNodeWrapper$ui_release();
        LayoutNodeWrapper layoutNodeWrapper = this.innerLayoutNodeWrapper;
        while (!p.f(outerLayoutNodeWrapper$ui_release, layoutNodeWrapper)) {
            ModifiedLayoutNode modifiedLayoutNode = (ModifiedLayoutNode) outerLayoutNodeWrapper$ui_release;
            OwnedLayer layer = modifiedLayoutNode.getLayer();
            mutableVector.add(new ModifierInfo(modifiedLayoutNode.getModifier(), modifiedLayoutNode, layer));
            for (LayoutNodeEntity<?, ?> next : modifiedLayoutNode.m3262getEntitiesCHwCgZE()) {
                for (; next != null; next = next.getNext()) {
                    mutableVector.add(new ModifierInfo(next.getModifier(), modifiedLayoutNode, layer));
                }
            }
            outerLayoutNodeWrapper$ui_release = modifiedLayoutNode.getWrapped();
        }
        for (LayoutNodeEntity<?, ?> next2 : this.innerLayoutNodeWrapper.m3262getEntitiesCHwCgZE()) {
            for (; next2 != null; next2 = next2.getNext()) {
                Modifier modifier = next2.getModifier();
                LayoutNodeWrapper layoutNodeWrapper2 = this.innerLayoutNodeWrapper;
                mutableVector.add(new ModifierInfo(modifier, layoutNodeWrapper2, layoutNodeWrapper2.getLayer()));
            }
        }
        return mutableVector.asMutableList();
    }

    @NotNull
    /* JADX INFO: renamed from: getModifierLocalsHead$ui_release, reason: from getter */
    public final ModifierLocalProviderEntity getModifierLocalsHead() {
        return this.modifierLocalsHead;
    }

    @NotNull
    /* JADX INFO: renamed from: getModifierLocalsTail$ui_release, reason: from getter */
    public final ModifierLocalProviderEntity getModifierLocalsTail() {
        return this.modifierLocalsTail;
    }

    /* JADX INFO: renamed from: getNeedsOnPositionedDispatch$ui_release, reason: from getter */
    public final boolean getNeedsOnPositionedDispatch() {
        return this.needsOnPositionedDispatch;
    }

    @Nullable
    public final l<Owner, r> getOnAttach$ui_release() {
        return this.onAttach;
    }

    @Nullable
    public final l<Owner, r> getOnDetach$ui_release() {
        return this.onDetach;
    }

    @NotNull
    public final MutableVector<Pair<LayoutNodeWrapper, OnGloballyPositionedModifier>> getOrCreateOnPositionedCallbacks$ui_release() {
        MutableVector<Pair<LayoutNodeWrapper, OnGloballyPositionedModifier>> mutableVector = this.onPositionedCallbacks;
        if (mutableVector != null) {
            return mutableVector;
        }
        MutableVector<Pair<LayoutNodeWrapper, OnGloballyPositionedModifier>> mutableVector2 = new MutableVector<>(new Pair[16], 0);
        this.onPositionedCallbacks = mutableVector2;
        return mutableVector2;
    }

    @NotNull
    public final LayoutNodeWrapper getOuterLayoutNodeWrapper$ui_release() {
        return this.outerMeasurablePlaceable.getOuterWrapper();
    }

    @Nullable
    /* JADX INFO: renamed from: getOwner$ui_release, reason: from getter */
    public final Owner getOwner() {
        return this.owner;
    }

    @Nullable
    public final LayoutNode getParent$ui_release() {
        LayoutNode layoutNode = this._foldedParent;
        if (!(layoutNode != null && layoutNode.isVirtual)) {
            return layoutNode;
        }
        if (layoutNode != null) {
            return layoutNode.getParent$ui_release();
        }
        return null;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    @Nullable
    public Object getParentData() {
        return this.outerMeasurablePlaceable.getParentData();
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    @Nullable
    public LayoutInfo getParentInfo() {
        return getParent$ui_release();
    }

    /* JADX INFO: renamed from: getPlaceOrder$ui_release, reason: from getter */
    public final int getPlaceOrder() {
        return this.placeOrder;
    }

    @Nullable
    /* JADX INFO: renamed from: getSubcompositionsState$ui_release, reason: from getter */
    public final LayoutNodeSubcompositionsState getSubcompositionsState() {
        return this.subcompositionsState;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo, androidx.compose.ui.node.ComposeUiNode
    @NotNull
    public ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public int getWidth() {
        return this.outerMeasurablePlaceable.getWidth();
    }

    @NotNull
    public final MutableVector<LayoutNode> getZSortedChildren() {
        if (this.zSortedChildrenInvalidated) {
            this._zSortedChildren.clear();
            MutableVector<LayoutNode> mutableVector = this._zSortedChildren;
            mutableVector.addAll(mutableVector.getSize(), get_children$ui_release());
            this._zSortedChildren.sortWith(this.ZComparator);
            this.zSortedChildrenInvalidated = false;
        }
        return this._zSortedChildren;
    }

    @NotNull
    public final MutableVector<LayoutNode> get_children$ui_release() {
        if (this.virtualChildrenCount == 0) {
            return this._foldedChildren;
        }
        recreateUnfoldedChildrenIfDirty();
        MutableVector<LayoutNode> mutableVector = this._unfoldedChildren;
        p.h(mutableVector);
        return mutableVector;
    }

    public final void handleMeasureResult$ui_release(@NotNull MeasureResult measureResult) {
        p.k(measureResult, "measureResult");
        this.innerLayoutNodeWrapper.setMeasureResult$ui_release(measureResult);
    }

    /* JADX INFO: renamed from: hitTest-M_7yMNQ$ui_release, reason: not valid java name */
    public final void m3237hitTestM_7yMNQ$ui_release(long pointerPosition, @NotNull HitTestResult<PointerInputFilter> hitTestResult, boolean isTouchEvent, boolean isInLayer) {
        p.k(hitTestResult, "hitTestResult");
        getOuterLayoutNodeWrapper$ui_release().m3265hitTestYqVAtuI(LayoutNodeWrapper.INSTANCE.getPointerInputSource(), getOuterLayoutNodeWrapper$ui_release().m3261fromParentPositionMKHz9U(pointerPosition), hitTestResult, isTouchEvent, isInLayer);
    }

    /* JADX INFO: renamed from: hitTestSemantics-M_7yMNQ$ui_release, reason: not valid java name */
    public final void m3238hitTestSemanticsM_7yMNQ$ui_release(long pointerPosition, @NotNull HitTestResult<SemanticsEntity> hitSemanticsEntities, boolean isTouchEvent, boolean isInLayer) {
        p.k(hitSemanticsEntities, "hitSemanticsEntities");
        getOuterLayoutNodeWrapper$ui_release().m3265hitTestYqVAtuI(LayoutNodeWrapper.INSTANCE.getSemanticsSource(), getOuterLayoutNodeWrapper$ui_release().m3261fromParentPositionMKHz9U(pointerPosition), hitSemanticsEntities, true, isInLayer);
    }

    public final void ignoreRemeasureRequests$ui_release(@NotNull sn.a<r> block) {
        p.k(block, "block");
        this.ignoreRemeasureRequests = true;
        block.invoke();
        this.ignoreRemeasureRequests = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void insertAt$ui_release(int index, @NotNull LayoutNode instance) {
        MutableVector<LayoutNode> mutableVector;
        int size;
        p.k(instance, C4157n2.f33007p);
        int i10 = 0;
        LayoutNodeWrapper layoutNodeWrapper = null;
        if ((instance._foldedParent == null) != true) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot insert ");
            sb2.append(instance);
            sb2.append(" because it already has a parent. This tree: ");
            sb2.append(debugTreeToString$default(this, 0, 1, null));
            sb2.append(" Other tree: ");
            LayoutNode layoutNode = instance._foldedParent;
            sb2.append(layoutNode != null ? debugTreeToString$default(layoutNode, 0, 1, null) : null);
            throw new IllegalStateException(sb2.toString().toString());
        }
        if ((instance.owner == null) != true) {
            throw new IllegalStateException(("Cannot insert " + instance + " because it already has an owner. This tree: " + debugTreeToString$default(this, 0, 1, null) + " Other tree: " + debugTreeToString$default(instance, 0, 1, null)).toString());
        }
        instance._foldedParent = this;
        this._foldedChildren.add(index, instance);
        onZSortedChildrenInvalidated();
        if (instance.isVirtual) {
            if (!(!this.isVirtual)) {
                throw new IllegalArgumentException("Virtual LayoutNode can't be added into a virtual parent".toString());
            }
            this.virtualChildrenCount++;
        }
        invalidateUnfoldedVirtualChildren();
        LayoutNodeWrapper outerLayoutNodeWrapper$ui_release = instance.getOuterLayoutNodeWrapper$ui_release();
        if (this.isVirtual) {
            LayoutNode layoutNode2 = this._foldedParent;
            if (layoutNode2 != null) {
                layoutNodeWrapper = layoutNode2.innerLayoutNodeWrapper;
            }
        } else {
            layoutNodeWrapper = this.innerLayoutNodeWrapper;
        }
        outerLayoutNodeWrapper$ui_release.setWrappedBy$ui_release(layoutNodeWrapper);
        if (instance.isVirtual && (size = (mutableVector = instance._foldedChildren).getSize()) > 0) {
            LayoutNode[] content = mutableVector.getContent();
            do {
                content[i10].getOuterLayoutNodeWrapper$ui_release().setWrappedBy$ui_release(this.innerLayoutNodeWrapper);
                i10++;
            } while (i10 < size);
        }
        Owner owner = this.owner;
        if (owner != null) {
            instance.attach$ui_release(owner);
        }
    }

    public final void invalidateLayer$ui_release() {
        LayoutNodeWrapper innerLayerWrapper = getInnerLayerWrapper();
        if (innerLayerWrapper != null) {
            innerLayerWrapper.invalidateLayer();
            return;
        }
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release != null) {
            parent$ui_release.invalidateLayer$ui_release();
        }
    }

    public final void invalidateLayers$ui_release() {
        LayoutNodeWrapper outerLayoutNodeWrapper$ui_release = getOuterLayoutNodeWrapper$ui_release();
        LayoutNodeWrapper layoutNodeWrapper = this.innerLayoutNodeWrapper;
        while (!p.f(outerLayoutNodeWrapper$ui_release, layoutNodeWrapper)) {
            ModifiedLayoutNode modifiedLayoutNode = (ModifiedLayoutNode) outerLayoutNodeWrapper$ui_release;
            OwnedLayer layer = modifiedLayoutNode.getLayer();
            if (layer != null) {
                layer.invalidate();
            }
            outerLayoutNodeWrapper$ui_release = modifiedLayoutNode.getWrapped();
        }
        OwnedLayer layer2 = this.innerLayoutNodeWrapper.getLayer();
        if (layer2 != null) {
            layer2.invalidate();
        }
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public boolean isAttached() {
        return this.owner != null;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    /* JADX INFO: renamed from: isPlaced, reason: from getter */
    public boolean getIsPlaced() {
        return this.isPlaced;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValid() {
        return isAttached();
    }

    public final void layoutChildren$ui_release() {
        this.alignmentLines.recalculateQueryOwner$ui_release();
        if (this.layoutPending) {
            onBeforeLayoutChildren();
        }
        if (this.layoutPending) {
            this.layoutPending = false;
            this.layoutState = LayoutState.LayingOut;
            LayoutNodeKt.requireOwner(this).getSnapshotObserver().observeLayoutSnapshotReads$ui_release(this, new sn.a<r>() { // from class: androidx.compose.ui.node.LayoutNode$layoutChildren$1
                {
                    super(0);
                }

                @Override // sn.a
                public /* bridge */ /* synthetic */ r invoke() {
                    invoke2();
                    return r.f5635a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    int i10 = 0;
                    this.this$0.nextChildPlaceOrder = 0;
                    MutableVector<LayoutNode> mutableVector = this.this$0.get_children$ui_release();
                    int size = mutableVector.getSize();
                    if (size > 0) {
                        LayoutNode[] content = mutableVector.getContent();
                        int i11 = 0;
                        do {
                            LayoutNode layoutNode = content[i11];
                            layoutNode.previousPlaceOrder = layoutNode.getPlaceOrder();
                            layoutNode.placeOrder = Integer.MAX_VALUE;
                            layoutNode.getAlignmentLines().setUsedDuringParentLayout$ui_release(false);
                            if (layoutNode.getMeasuredByParent() == LayoutNode.UsageByParent.InLayoutBlock) {
                                layoutNode.setMeasuredByParent$ui_release(LayoutNode.UsageByParent.NotUsed);
                            }
                            i11++;
                        } while (i11 < size);
                    }
                    this.this$0.getInnerLayoutNodeWrapper().getMeasureResult().placeChildren();
                    MutableVector<LayoutNode> mutableVector2 = this.this$0.get_children$ui_release();
                    LayoutNode layoutNode2 = this.this$0;
                    int size2 = mutableVector2.getSize();
                    if (size2 > 0) {
                        LayoutNode[] content2 = mutableVector2.getContent();
                        do {
                            LayoutNode layoutNode3 = content2[i10];
                            if (layoutNode3.previousPlaceOrder != layoutNode3.getPlaceOrder()) {
                                layoutNode2.onZSortedChildrenInvalidated();
                                layoutNode2.invalidateLayer$ui_release();
                                if (layoutNode3.getPlaceOrder() == Integer.MAX_VALUE) {
                                    layoutNode3.markSubtreeAsNotPlaced();
                                }
                            }
                            layoutNode3.getAlignmentLines().setPreviousUsedDuringParentLayout$ui_release(layoutNode3.getAlignmentLines().getUsedDuringParentLayout());
                            i10++;
                        } while (i10 < size2);
                    }
                }
            });
            this.layoutState = LayoutState.Idle;
        }
        if (this.alignmentLines.getUsedDuringParentLayout()) {
            this.alignmentLines.setPreviousUsedDuringParentLayout$ui_release(true);
        }
        if (this.alignmentLines.getDirty() && this.alignmentLines.getRequired$ui_release()) {
            this.alignmentLines.recalculate();
        }
    }

    public final void markLayoutPending$ui_release() {
        this.layoutPending = true;
    }

    public final void markMeasurePending$ui_release() {
        this.measurePending = true;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int width) {
        return this.outerMeasurablePlaceable.maxIntrinsicHeight(width);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int height) {
        return this.outerMeasurablePlaceable.maxIntrinsicWidth(height);
    }

    @Override // androidx.compose.ui.layout.Measurable
    @NotNull
    /* JADX INFO: renamed from: measure-BRTryo0 */
    public Placeable mo3112measureBRTryo0(long constraints) {
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreeIntrinsicsUsage();
        }
        return this.outerMeasurablePlaceable.mo3112measureBRTryo0(constraints);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int width) {
        return this.outerMeasurablePlaceable.minIntrinsicHeight(width);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int height) {
        return this.outerMeasurablePlaceable.minIntrinsicWidth(height);
    }

    public final void move$ui_release(int from, int to2, int count) {
        if (from == to2) {
            return;
        }
        for (int i10 = 0; i10 < count; i10++) {
            this._foldedChildren.add(from > to2 ? to2 + i10 : (to2 + count) - 2, this._foldedChildren.removeAt(from > to2 ? from + i10 : from));
        }
        onZSortedChildrenInvalidated();
        invalidateUnfoldedVirtualChildren();
        requestRemeasure$ui_release$default(this, false, 1, null);
    }

    public final void onAlignmentsChanged$ui_release() {
        if (this.alignmentLines.getDirty()) {
            return;
        }
        this.alignmentLines.setDirty$ui_release(true);
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release == null) {
            return;
        }
        if (this.alignmentLines.getUsedDuringParentMeasurement()) {
            requestRemeasure$ui_release$default(parent$ui_release, false, 1, null);
        } else if (this.alignmentLines.getPreviousUsedDuringParentLayout()) {
            requestRelayout$ui_release$default(parent$ui_release, false, 1, null);
        }
        if (this.alignmentLines.getUsedByModifierMeasurement()) {
            requestRemeasure$ui_release$default(this, false, 1, null);
        }
        if (this.alignmentLines.getUsedByModifierLayout()) {
            requestRelayout$ui_release$default(parent$ui_release, false, 1, null);
        }
        parent$ui_release.onAlignmentsChanged$ui_release();
    }

    @Override // androidx.compose.ui.node.Owner.OnLayoutCompletedListener
    public void onLayoutComplete() {
        for (LayoutNodeEntity<?, ?> next = this.innerLayoutNodeWrapper.m3262getEntitiesCHwCgZE()[EntityList.INSTANCE.m3219getOnPlacedEntityTypeEEbPh1w()]; next != null; next = next.getNext()) {
            ((OnPlacedModifier) ((SimpleEntity) next).getModifier()).onPlaced(this.innerLayoutNodeWrapper);
        }
    }

    public final void onNodePlaced$ui_release() {
        LayoutNode parent$ui_release = getParent$ui_release();
        float zIndex = this.innerLayoutNodeWrapper.getZIndex();
        LayoutNodeWrapper outerLayoutNodeWrapper$ui_release = getOuterLayoutNodeWrapper$ui_release();
        LayoutNodeWrapper layoutNodeWrapper = this.innerLayoutNodeWrapper;
        while (!p.f(outerLayoutNodeWrapper$ui_release, layoutNodeWrapper)) {
            ModifiedLayoutNode modifiedLayoutNode = (ModifiedLayoutNode) outerLayoutNodeWrapper$ui_release;
            zIndex += modifiedLayoutNode.getZIndex();
            outerLayoutNodeWrapper$ui_release = modifiedLayoutNode.getWrapped();
        }
        if (!(zIndex == this.zIndex)) {
            this.zIndex = zIndex;
            if (parent$ui_release != null) {
                parent$ui_release.onZSortedChildrenInvalidated();
            }
            if (parent$ui_release != null) {
                parent$ui_release.invalidateLayer$ui_release();
            }
        }
        if (!getIsPlaced()) {
            if (parent$ui_release != null) {
                parent$ui_release.invalidateLayer$ui_release();
            }
            markNodeAndSubtreeAsPlaced();
        }
        if (parent$ui_release == null) {
            this.placeOrder = 0;
        } else if (!this.relayoutWithoutParentInProgress && parent$ui_release.layoutState == LayoutState.LayingOut) {
            if (!(this.placeOrder == Integer.MAX_VALUE)) {
                throw new IllegalStateException("Place was called on a node which was placed already".toString());
            }
            int i10 = parent$ui_release.nextChildPlaceOrder;
            this.placeOrder = i10;
            parent$ui_release.nextChildPlaceOrder = i10 + 1;
        }
        layoutChildren$ui_release();
    }

    /* JADX INFO: renamed from: performMeasure-BRTryo0$ui_release, reason: not valid java name */
    public final void m3239performMeasureBRTryo0$ui_release(final long constraints) {
        LayoutState layoutState = LayoutState.Measuring;
        this.layoutState = layoutState;
        this.measurePending = false;
        LayoutNodeKt.requireOwner(this).getSnapshotObserver().observeMeasureSnapshotReads$ui_release(this, new sn.a<r>() { // from class: androidx.compose.ui.node.LayoutNode$performMeasure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // sn.a
            public /* bridge */ /* synthetic */ r invoke() {
                invoke2();
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.getOuterLayoutNodeWrapper$ui_release().mo3112measureBRTryo0(constraints);
            }
        });
        if (this.layoutState == layoutState) {
            markLayoutPending$ui_release();
            this.layoutState = LayoutState.Idle;
        }
    }

    public final void place$ui_release(int x10, int y10) {
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreePlacementIntrinsicsUsage();
        }
        Placeable.PlacementScope.Companion companion = Placeable.PlacementScope.INSTANCE;
        int measuredWidth = this.outerMeasurablePlaceable.getMeasuredWidth();
        LayoutDirection layoutDirection = getLayoutDirection();
        int parentWidth = companion.getParentWidth();
        LayoutDirection parentLayoutDirection = companion.getParentLayoutDirection();
        Placeable.PlacementScope.parentWidth = measuredWidth;
        Placeable.PlacementScope.parentLayoutDirection = layoutDirection;
        Placeable.PlacementScope.placeRelative$default(companion, this.outerMeasurablePlaceable, x10, y10, 0.0f, 4, null);
        Placeable.PlacementScope.parentWidth = parentWidth;
        Placeable.PlacementScope.parentLayoutDirection = parentLayoutDirection;
    }

    /* JADX INFO: renamed from: remeasure-_Sx5XlM$ui_release, reason: not valid java name */
    public final boolean m3240remeasure_Sx5XlM$ui_release(@Nullable Constraints constraints) {
        if (constraints == null) {
            return false;
        }
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreeIntrinsicsUsage();
        }
        return this.outerMeasurablePlaceable.m3278remeasureBRTryo0(constraints.getValue());
    }

    public final void removeAll$ui_release() {
        int size = this._foldedChildren.getSize();
        while (true) {
            size--;
            if (-1 >= size) {
                this._foldedChildren.clear();
                return;
            }
            onChildRemoved(this._foldedChildren.getContent()[size]);
        }
    }

    public final void removeAt$ui_release(int index, int count) {
        if (!(count >= 0)) {
            throw new IllegalArgumentException(("count (" + count + ") must be greater than 0").toString());
        }
        int i10 = (count + index) - 1;
        if (index > i10) {
            return;
        }
        while (true) {
            onChildRemoved(this._foldedChildren.removeAt(i10));
            if (i10 == index) {
                return;
            } else {
                i10--;
            }
        }
    }

    public final void replace$ui_release() {
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreePlacementIntrinsicsUsage();
        }
        try {
            this.relayoutWithoutParentInProgress = true;
            this.outerMeasurablePlaceable.replace();
        } finally {
            this.relayoutWithoutParentInProgress = false;
        }
    }

    public final void requestRelayout$ui_release(boolean forceRequest) {
        Owner owner;
        if (this.isVirtual || (owner = this.owner) == null) {
            return;
        }
        owner.onRequestRelayout(this, forceRequest);
    }

    public final void requestRemeasure$ui_release(boolean forceRequest) {
        Owner owner;
        if (this.ignoreRemeasureRequests || this.isVirtual || (owner = this.owner) == null) {
            return;
        }
        owner.onRequestMeasure(this, forceRequest);
        this.outerMeasurablePlaceable.invalidateIntrinsicsParent(forceRequest);
    }

    public final void resetSubtreeIntrinsicsUsage$ui_release() {
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            int i10 = 0;
            LayoutNode[] content = mutableVector.getContent();
            do {
                LayoutNode layoutNode = content[i10];
                UsageByParent usageByParent = layoutNode.previousIntrinsicsUsageByParent;
                layoutNode.intrinsicsUsageByParent = usageByParent;
                if (usageByParent != UsageByParent.NotUsed) {
                    layoutNode.resetSubtreeIntrinsicsUsage$ui_release();
                }
                i10++;
            } while (i10 < size);
        }
    }

    public final void setCanMultiMeasure$ui_release(boolean z10) {
        this.canMultiMeasure = z10;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setDensity(@NotNull Density density) {
        p.k(density, "value");
        if (p.f(this.density, density)) {
            return;
        }
        this.density = density;
        onDensityOrLayoutDirectionChanged();
    }

    public final void setDepth$ui_release(int i10) {
        this.depth = i10;
    }

    public final void setInnerLayerWrapperIsDirty$ui_release(boolean z10) {
        this.innerLayerWrapperIsDirty = z10;
    }

    public final void setIntrinsicsUsageByParent$ui_release(@NotNull UsageByParent usageByParent) {
        p.k(usageByParent, "<set-?>");
        this.intrinsicsUsageByParent = usageByParent;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setLayoutDirection(@NotNull LayoutDirection layoutDirection) {
        p.k(layoutDirection, "value");
        if (this.layoutDirection != layoutDirection) {
            this.layoutDirection = layoutDirection;
            onDensityOrLayoutDirectionChanged();
        }
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setMeasurePolicy(@NotNull MeasurePolicy measurePolicy) {
        p.k(measurePolicy, "value");
        if (p.f(this.measurePolicy, measurePolicy)) {
            return;
        }
        this.measurePolicy = measurePolicy;
        this.intrinsicsPolicy.updateFrom(getMeasurePolicy());
        requestRemeasure$ui_release$default(this, false, 1, null);
    }

    public final void setMeasuredByParent$ui_release(@NotNull UsageByParent usageByParent) {
        p.k(usageByParent, "<set-?>");
        this.measuredByParent = usageByParent;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setModifier(@NotNull Modifier modifier) {
        LayoutNode parent$ui_release;
        LayoutNode parent$ui_release2;
        Owner owner;
        p.k(modifier, "value");
        if (p.f(modifier, this.modifier)) {
            return;
        }
        if (!p.f(getModifier(), Modifier.INSTANCE) && !(!this.isVirtual)) {
            throw new IllegalArgumentException("Modifiers are not supported on virtual LayoutNodes".toString());
        }
        this.modifier = modifier;
        boolean zShouldInvalidateParentLayer = shouldInvalidateParentLayer();
        copyWrappersToCache();
        LayoutNodeWrapper wrapped$ui_release = this.innerLayoutNodeWrapper.getWrapped();
        for (LayoutNodeWrapper outerLayoutNodeWrapper$ui_release = getOuterLayoutNodeWrapper$ui_release(); !p.f(outerLayoutNodeWrapper$ui_release, wrapped$ui_release) && outerLayoutNodeWrapper$ui_release != null; outerLayoutNodeWrapper$ui_release = outerLayoutNodeWrapper$ui_release.getWrapped()) {
            EntityList.m3204clearimpl(outerLayoutNodeWrapper$ui_release.m3262getEntitiesCHwCgZE());
        }
        markReusedModifiers(modifier);
        LayoutNodeWrapper outerWrapper = this.outerMeasurablePlaceable.getOuterWrapper();
        if (SemanticsNodeKt.getOuterSemantics(this) != null && isAttached()) {
            Owner owner2 = this.owner;
            p.h(owner2);
            owner2.onSemanticsChange();
        }
        boolean zHasNewPositioningCallback = hasNewPositioningCallback();
        MutableVector<Pair<LayoutNodeWrapper, OnGloballyPositionedModifier>> mutableVector = this.onPositionedCallbacks;
        if (mutableVector != null) {
            mutableVector.clear();
        }
        this.innerLayoutNodeWrapper.onInitialize();
        LayoutNodeWrapper layoutNodeWrapper = (LayoutNodeWrapper) getModifier().foldOut(this.innerLayoutNodeWrapper, new sn.p<Modifier.Element, LayoutNodeWrapper, LayoutNodeWrapper>() { // from class: androidx.compose.ui.node.LayoutNode$modifier$outerWrapper$1
            {
                super(2);
            }

            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final LayoutNodeWrapper mo2invoke(@NotNull Modifier.Element element, @NotNull LayoutNodeWrapper layoutNodeWrapper2) {
                p.k(element, "mod");
                p.k(layoutNodeWrapper2, "toWrap");
                if (element instanceof RemeasurementModifier) {
                    ((RemeasurementModifier) element).onRemeasurementAvailable(this.this$0);
                }
                EntityList.m3202addBeforeLayoutModifierimpl(layoutNodeWrapper2.m3262getEntitiesCHwCgZE(), layoutNodeWrapper2, element);
                if (element instanceof OnGloballyPositionedModifier) {
                    this.this$0.getOrCreateOnPositionedCallbacks$ui_release().add(h.a(layoutNodeWrapper2, element));
                }
                if (element instanceof LayoutModifier) {
                    LayoutModifier layoutModifier = (LayoutModifier) element;
                    ModifiedLayoutNode modifiedLayoutNodeReuseLayoutNodeWrapper = this.this$0.reuseLayoutNodeWrapper(layoutNodeWrapper2, layoutModifier);
                    if (modifiedLayoutNodeReuseLayoutNodeWrapper == null) {
                        modifiedLayoutNodeReuseLayoutNodeWrapper = new ModifiedLayoutNode(layoutNodeWrapper2, layoutModifier);
                    }
                    layoutNodeWrapper2 = modifiedLayoutNodeReuseLayoutNodeWrapper;
                    layoutNodeWrapper2.onInitialize();
                }
                EntityList.m3201addAfterLayoutModifierimpl(layoutNodeWrapper2.m3262getEntitiesCHwCgZE(), layoutNodeWrapper2, element);
                return layoutNodeWrapper2;
            }
        });
        setModifierLocals(modifier);
        LayoutNode parent$ui_release3 = getParent$ui_release();
        layoutNodeWrapper.setWrappedBy$ui_release(parent$ui_release3 != null ? parent$ui_release3.innerLayoutNodeWrapper : null);
        this.outerMeasurablePlaceable.setOuterWrapper(layoutNodeWrapper);
        if (isAttached()) {
            MutableVector<ModifiedLayoutNode> mutableVector2 = this.wrapperCache;
            int size = mutableVector2.getSize();
            if (size > 0) {
                ModifiedLayoutNode[] content = mutableVector2.getContent();
                int i10 = 0;
                do {
                    content[i10].detach();
                    i10++;
                } while (i10 < size);
            }
            LayoutNodeWrapper wrapped$ui_release2 = this.innerLayoutNodeWrapper.getWrapped();
            for (LayoutNodeWrapper outerLayoutNodeWrapper$ui_release2 = getOuterLayoutNodeWrapper$ui_release(); !p.f(outerLayoutNodeWrapper$ui_release2, wrapped$ui_release2) && outerLayoutNodeWrapper$ui_release2 != null; outerLayoutNodeWrapper$ui_release2 = outerLayoutNodeWrapper$ui_release2.getWrapped()) {
                if (outerLayoutNodeWrapper$ui_release2.isAttached()) {
                    for (LayoutNodeEntity<?, ?> next : outerLayoutNodeWrapper$ui_release2.m3262getEntitiesCHwCgZE()) {
                        for (; next != null; next = next.getNext()) {
                            next.onAttach();
                        }
                    }
                } else {
                    outerLayoutNodeWrapper$ui_release2.attach();
                }
            }
        }
        this.wrapperCache.clear();
        LayoutNodeWrapper wrapped$ui_release3 = this.innerLayoutNodeWrapper.getWrapped();
        for (LayoutNodeWrapper outerLayoutNodeWrapper$ui_release3 = getOuterLayoutNodeWrapper$ui_release(); !p.f(outerLayoutNodeWrapper$ui_release3, wrapped$ui_release3) && outerLayoutNodeWrapper$ui_release3 != null; outerLayoutNodeWrapper$ui_release3 = outerLayoutNodeWrapper$ui_release3.getWrapped()) {
            outerLayoutNodeWrapper$ui_release3.onModifierChanged();
        }
        if (!p.f(outerWrapper, this.innerLayoutNodeWrapper) || !p.f(layoutNodeWrapper, this.innerLayoutNodeWrapper)) {
            requestRemeasure$ui_release$default(this, false, 1, null);
        } else if (this.layoutState == LayoutState.Idle && !this.measurePending && zHasNewPositioningCallback) {
            requestRemeasure$ui_release$default(this, false, 1, null);
        } else if (EntityList.m3212has0OSVbXo(this.innerLayoutNodeWrapper.m3262getEntitiesCHwCgZE(), EntityList.INSTANCE.m3219getOnPlacedEntityTypeEEbPh1w()) && (owner = this.owner) != null) {
            owner.registerOnLayoutCompletedListener(this);
        }
        Object parentData = getParentData();
        this.outerMeasurablePlaceable.recalculateParentData();
        if (!p.f(parentData, getParentData()) && (parent$ui_release2 = getParent$ui_release()) != null) {
            requestRemeasure$ui_release$default(parent$ui_release2, false, 1, null);
        }
        if ((zShouldInvalidateParentLayer || shouldInvalidateParentLayer()) && (parent$ui_release = getParent$ui_release()) != null) {
            parent$ui_release.invalidateLayer$ui_release();
        }
    }

    public final void setNeedsOnPositionedDispatch$ui_release(boolean z10) {
        this.needsOnPositionedDispatch = z10;
    }

    public final void setOnAttach$ui_release(@Nullable l<? super Owner, r> lVar) {
        this.onAttach = lVar;
    }

    public final void setOnDetach$ui_release(@Nullable l<? super Owner, r> lVar) {
        this.onDetach = lVar;
    }

    public final void setSubcompositionsState$ui_release(@Nullable LayoutNodeSubcompositionsState layoutNodeSubcompositionsState) {
        this.subcompositionsState = layoutNodeSubcompositionsState;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setViewConfiguration(@NotNull ViewConfiguration viewConfiguration) {
        p.k(viewConfiguration, "<set-?>");
        this.viewConfiguration = viewConfiguration;
    }

    @NotNull
    public String toString() {
        return JvmActuals_jvmKt.simpleIdentityToString(this, null) + " children: " + getChildren$ui_release().size() + " measurePolicy: " + getMeasurePolicy();
    }
}
