package androidx.compose.ui.node;

import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.MutableRectKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.input.pointer.PointerInputFilter;
import androidx.compose.ui.input.pointer.PointerInputModifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnPlacedModifier;
import androidx.compose.ui.layout.OnRemeasuredModifier;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.VerticalAlignmentLine;
import androidx.compose.ui.node.EntityList;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsEntity;
import androidx.compose.ui.semantics.SemanticsModifier;
import androidx.compose.ui.semantics.SemanticsNodeKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import bn.r;
import cn.w0;
import com.ironsource.C3978d4;
import hn.c;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: LayoutNodeWrapper.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u008a\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\u0013\b \u0018\u0000 ï\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005:\u0004ï\u0001ð\u0001B\u0013\u0012\b\u0010\u0088\u0001\u001a\u00030\u0087\u0001¢\u0006\u0006\bí\u0001\u0010î\u0001J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0006H\u0002J\b\u0010\n\u001a\u00020\u0007H\u0002J\u0081\u0001\u0010\u001b\u001a\u00020\u0007\"\u0014\b\u0000\u0010\f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u000b\"\u0004\b\u0001\u0010\r\"\b\b\u0002\u0010\u000f*\u00020\u000e*\u0004\u0018\u00018\u00002\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0089\u0001\u0010 \u001a\u00020\u0007\"\u0014\b\u0000\u0010\f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u000b\"\u0004\b\u0001\u0010\r\"\b\b\u0002\u0010\u000f*\u00020\u000e*\u0004\u0018\u00018\u00002\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001cH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0089\u0001\u0010\"\u001a\u00020\u0007\"\u0014\b\u0000\u0010\f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u000b\"\u0004\b\u0001\u0010\r\"\b\b\u0002\u0010\u000f*\u00020\u000e*\u0004\u0018\u00018\u00002\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001cH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\u001fJ%\u0010'\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0012H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&J \u0010'\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00002\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u0016H\u0002J\u0018\u0010,\u001a\u00020\u00072\u0006\u0010+\u001a\u00020(2\u0006\u0010*\u001a\u00020\u0016H\u0002J\u001d\u0010/\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010.J\u0006\u00100\u001a\u00020\u0016J\u0018\u00104\u001a\u00020\u00072\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u000201H\u0014J/\u0010;\u001a\u00020\u00012\u0006\u00106\u001a\u0002052\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u000107H\u0084\bø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b9\u0010:J\u0006\u0010<\u001a\u00020\u0007J\u0010\u0010?\u001a\u0002012\u0006\u0010>\u001a\u00020=H&J\u0011\u0010@\u001a\u0002012\u0006\u0010>\u001a\u00020=H\u0086\u0002J\b\u0010A\u001a\u00020\u0007H\u0016J;\u0010I\u001a\u00020\u00072\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u00020\u001c2\u0014\u0010F\u001a\u0010\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bG\u0010HJ\u000e\u0010J\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0006J\u0010\u0010K\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0006\u0010L\u001a\u00020\u0007J\u0011\u0010M\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0006H\u0096\u0002J\u001c\u0010N\u001a\u00020\u00072\u0014\u0010F\u001a\u0010\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005Jy\u0010Q\u001a\u00020\u0007\"\u0014\b\u0000\u0010\f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u000b\"\u0004\b\u0001\u0010\r\"\b\b\u0002\u0010\u000f*\u00020\u000e2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bO\u0010PJ{\u0010S\u001a\u00020\u0007\"\u0014\b\u0000\u0010\f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u000b\"\u0004\b\u0001\u0010\r\"\b\b\u0002\u0010\u000f*\u00020\u000e2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bR\u0010PJ\u0006\u0010U\u001a\u00020TJ\u001d\u0010X\u001a\u00020\u00122\u0006\u0010V\u001a\u00020\u0012H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bW\u0010.J\u001d\u0010[\u001a\u00020\u00122\u0006\u0010Y\u001a\u00020\u0012H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bZ\u0010.J%\u0010`\u001a\u00020\u00122\u0006\u0010\\\u001a\u00020\u00032\u0006\u0010]\u001a\u00020\u0012H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b^\u0010_J\u0018\u0010a\u001a\u00020T2\u0006\u0010\\\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0016H\u0016J\u001d\u0010c\u001a\u00020\u00122\u0006\u0010Y\u001a\u00020\u0012H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bb\u0010.J(\u0010d\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00062\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0084\bø\u0001\u0002J\u001d\u0010f\u001a\u00020\u00122\u0006\u0010C\u001a\u00020\u0012H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\be\u0010.J\u001d\u0010h\u001a\u00020\u00122\u0006\u0010C\u001a\u00020\u0012H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bg\u0010.J\u0018\u0010k\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010j\u001a\u00020iH\u0004J\b\u0010l\u001a\u00020\u0007H\u0016J\b\u0010m\u001a\u00020\u0007H\u0016J)\u0010q\u001a\u00020\u00072\u0006\u0010+\u001a\u00020(2\u0006\u0010*\u001a\u00020\u00162\b\b\u0002\u0010n\u001a\u00020\u0016H\u0000¢\u0006\u0004\bo\u0010pJ\u001d\u0010t\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0012H\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\br\u0010sJ\u001d\u0010v\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0012H\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bu\u0010sJ\b\u0010w\u001a\u00020\u0007H\u0016J\u001b\u0010x\u001a\u00020\u00072\u0006\u0010)\u001a\u00020TH\u0096@ø\u0001\u0000¢\u0006\u0004\bx\u0010yJ\b\u0010z\u001a\u00020\u0007H\u0016J\u0017\u0010~\u001a\u00020\u00002\u0006\u0010{\u001a\u00020\u0000H\u0000¢\u0006\u0004\b|\u0010}J\u0006\u0010\u007f\u001a\u00020\u0016J\"\u0010\u0083\u0001\u001a\u00030\u0080\u00012\b\u0010\u0081\u0001\u001a\u00030\u0080\u0001H\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u0082\u0001\u0010.J*\u0010\u0086\u0001\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0081\u0001\u001a\u00030\u0080\u0001H\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001R \u0010\u0088\u0001\u001a\u00030\u0087\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R+\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0019\u0010\u0092\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001RD\u0010F\u001a\u0010\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\u0015\u0010\u0094\u0001\u001a\u0010\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00058\u0004@BX\u0084\u000e¢\u0006\u000f\n\u0005\bF\u0010\u0095\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R\u001a\u0010\u0099\u0001\u001a\u00030\u0098\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u001a\u0010\u009c\u0001\u001a\u00030\u009b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0019\u0010\u009e\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0019\u0010 \u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0001\u0010\u0093\u0001R\u001c\u0010¢\u0001\u001a\u0005\u0018\u00010¡\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R(\u0010¥\u0001\u001a\u0011\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u000201\u0018\u00010¤\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R1\u0010C\u001a\u00020B2\u0007\u0010\u0094\u0001\u001a\u00020B8\u0006@BX\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0003¢\u0006\u000f\n\u0005\bC\u0010§\u0001\u001a\u0006\b¨\u0001\u0010©\u0001R0\u0010D\u001a\u00020\u001c2\u0007\u0010\u0094\u0001\u001a\u00020\u001c8\u0006@DX\u0086\u000e¢\u0006\u0017\n\u0005\bD\u0010\u009f\u0001\u001a\u0006\bª\u0001\u0010«\u0001\"\u0006\b¬\u0001\u0010\u00ad\u0001R)\u0010®\u0001\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b®\u0001\u0010\u0093\u0001\u001a\u0006\b®\u0001\u0010¯\u0001\"\u0006\b°\u0001\u0010±\u0001R\u001b\u0010²\u0001\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001R&\u0010µ\u0001\u001a\u00030´\u00018\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0003¢\u0006\u0010\n\u0006\bµ\u0001\u0010¶\u0001\u001a\u0006\b·\u0001\u0010¸\u0001R\u001d\u0010¹\u0001\u001a\b\u0012\u0004\u0012\u00020\u0007078\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001R*\u0010»\u0001\u001a\u00020\u00162\u0007\u0010\u0094\u0001\u001a\u00020\u00168\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\b»\u0001\u0010\u0093\u0001\u001a\u0006\b¼\u0001\u0010¯\u0001R0\u0010¾\u0001\u001a\u0005\u0018\u00010½\u00012\n\u0010\u0094\u0001\u001a\u0005\u0018\u00010½\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b¾\u0001\u0010¿\u0001\u001a\u0006\bÀ\u0001\u0010Á\u0001R\u0017\u0010Ã\u0001\u001a\u00020\u00168BX\u0082\u0004¢\u0006\b\u001a\u0006\bÂ\u0001\u0010¯\u0001R(\u0010É\u0001\u001a\u0005\u0018\u00010Æ\u0001*\f\u0012\u0005\u0012\u00030Å\u0001\u0018\u00010Ä\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÇ\u0001\u0010È\u0001R\u0018\u0010Í\u0001\u001a\u00030Ê\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bË\u0001\u0010Ì\u0001R\u0019\u0010Ï\u0001\u001a\u0004\u0018\u00010\u00008PX\u0090\u0004¢\u0006\b\u001a\u0006\bÎ\u0001\u0010\u008f\u0001R\u0018\u0010Ó\u0001\u001a\u00030Ð\u00018&X¦\u0004¢\u0006\b\u001a\u0006\bÑ\u0001\u0010Ò\u0001R\u001e\u0010Ö\u0001\u001a\u00030Ô\u00018Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0003¢\u0006\b\u001a\u0006\bÕ\u0001\u0010©\u0001R\u0014\u0010×\u0001\u001a\u00020\u00168F¢\u0006\b\u001a\u0006\b×\u0001\u0010¯\u0001R,\u0010Ý\u0001\u001a\u00030¡\u00012\b\u0010Ø\u0001\u001a\u00030¡\u00018F@@X\u0086\u000e¢\u0006\u0010\u001a\u0006\bÙ\u0001\u0010Ú\u0001\"\u0006\bÛ\u0001\u0010Ü\u0001R\u001e\u0010á\u0001\u001a\t\u0012\u0004\u0012\u00020=0Þ\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bß\u0001\u0010à\u0001R\u001a\u0010É\u0001\u001a\u0005\u0018\u00010Æ\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÇ\u0001\u0010â\u0001R\u0016\u0010å\u0001\u001a\u0004\u0018\u00010\u00038F¢\u0006\b\u001a\u0006\bã\u0001\u0010ä\u0001R\u0016\u0010ç\u0001\u001a\u0004\u0018\u00010\u00038F¢\u0006\b\u001a\u0006\bæ\u0001\u0010ä\u0001R\u0017\u0010ê\u0001\u001a\u00020(8DX\u0084\u0004¢\u0006\b\u001a\u0006\bè\u0001\u0010é\u0001R\u0017\u0010ë\u0001\u001a\u00020\u00168VX\u0096\u0004¢\u0006\b\u001a\u0006\bë\u0001\u0010¯\u0001R\u001e\u0010\u0081\u0001\u001a\u00030\u0080\u00018Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0003¢\u0006\b\u001a\u0006\bì\u0001\u0010©\u0001\u0082\u0002\u0016\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0005\b\u009920\u0001\n\u0002\b!¨\u0006ñ\u0001"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeWrapper;", "Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/node/OwnerScope;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "Lbn/r;", "canvas", "drawContainedDrawModifiers", "updateLayerParameters", "Landroidx/compose/ui/node/LayoutNodeEntity;", "T", "C", "Landroidx/compose/ui/Modifier;", "M", "Landroidx/compose/ui/node/LayoutNodeWrapper$HitTestSource;", "hitTestSource", "Landroidx/compose/ui/geometry/Offset;", "pointerPosition", "Landroidx/compose/ui/node/HitTestResult;", "hitTestResult", "", "isTouchEvent", "isInLayer", "hit-1hIXUjU", "(Landroidx/compose/ui/node/LayoutNodeEntity;Landroidx/compose/ui/node/LayoutNodeWrapper$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "hit", "", "distanceFromEdge", "hitNear-JHbHoSQ", "(Landroidx/compose/ui/node/LayoutNodeEntity;Landroidx/compose/ui/node/LayoutNodeWrapper$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;ZZF)V", "hitNear", "speculativeHit-JHbHoSQ", "speculativeHit", "ancestor", TypedValues.CycleType.S_WAVE_OFFSET, "ancestorToLocal-R5De75A", "(Landroidx/compose/ui/node/LayoutNodeWrapper;J)J", "ancestorToLocal", "Landroidx/compose/ui/geometry/MutableRect;", "rect", "clipBounds", "bounds", "fromParentRect", "offsetFromEdge-MK-Hz9U", "(J)J", "offsetFromEdge", "isTransparent", "", "width", "height", "onMeasureResultChanged", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Lkotlin/Function0;", "block", "performingMeasure-K40F9xA", "(JLsn/a;)Landroidx/compose/ui/layout/Placeable;", "performingMeasure", "onMeasured", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "calculateAlignmentLine", "get", "onInitialize", "Landroidx/compose/ui/unit/IntOffset;", C3978d4.i.L, "zIndex", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "layerBlock", "placeAt-f8xVGno", "(JFLsn/l;)V", "placeAt", "draw", "performDraw", "onPlaced", "invoke", "onLayerBlockUpdated", "hitTest-YqVAtuI", "(Landroidx/compose/ui/node/LayoutNodeWrapper$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "hitTest", "hitTestChild-YqVAtuI", "hitTestChild", "Landroidx/compose/ui/geometry/Rect;", "touchBoundsInRoot", "relativeToWindow", "windowToLocal-MK-Hz9U", "windowToLocal", "relativeToLocal", "localToWindow-MK-Hz9U", "localToWindow", "sourceCoordinates", "relativeToSource", "localPositionOf-R5De75A", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)J", "localPositionOf", "localBoundingBoxOf", "localToRoot-MK-Hz9U", "localToRoot", "withPositionTranslation", "toParentPosition-MK-Hz9U", "toParentPosition", "fromParentPosition-MK-Hz9U", "fromParentPosition", "Landroidx/compose/ui/graphics/Paint;", "paint", "drawBorder", "attach", "detach", "clipToMinimumTouchTargetSize", "rectInParent$ui_release", "(Landroidx/compose/ui/geometry/MutableRect;ZZ)V", "rectInParent", "withinLayerBounds-k-4lQ0M", "(J)Z", "withinLayerBounds", "isPointerInBounds-k-4lQ0M", "isPointerInBounds", "invalidateLayer", "propagateRelocationRequest", "(Landroidx/compose/ui/geometry/Rect;Lhn/c;)Ljava/lang/Object;", "onModifierChanged", "other", "findCommonAncestor$ui_release", "(Landroidx/compose/ui/node/LayoutNodeWrapper;)Landroidx/compose/ui/node/LayoutNodeWrapper;", "findCommonAncestor", "shouldSharePointerInputWithSiblings", "Landroidx/compose/ui/geometry/Size;", "minimumTouchTargetSize", "calculateMinimumTouchTargetPadding-E7KxVPU", "calculateMinimumTouchTargetPadding", "distanceInMinimumTouchTarget-tz77jQw", "(JJ)F", "distanceInMinimumTouchTarget", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode$ui_release", "()Landroidx/compose/ui/node/LayoutNode;", "wrappedBy", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "getWrappedBy$ui_release", "()Landroidx/compose/ui/node/LayoutNodeWrapper;", "setWrappedBy$ui_release", "(Landroidx/compose/ui/node/LayoutNodeWrapper;)V", "isClipping", "Z", "<set-?>", "Lsn/l;", "getLayerBlock", "()Lsn/l;", "Landroidx/compose/ui/unit/Density;", "layerDensity", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/LayoutDirection;", "layerLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "lastLayerAlpha", "F", "_isAttached", "Landroidx/compose/ui/layout/MeasureResult;", "_measureResult", "Landroidx/compose/ui/layout/MeasureResult;", "", "oldAlignmentLines", "Ljava/util/Map;", "J", "getPosition-nOcc-ac", "()J", "getZIndex", "()F", "setZIndex", "(F)V", "isShallowPlacing", "()Z", "setShallowPlacing", "(Z)V", "_rectCache", "Landroidx/compose/ui/geometry/MutableRect;", "Landroidx/compose/ui/node/EntityList;", "entities", "[Landroidx/compose/ui/node/LayoutNodeEntity;", "getEntities-CHwCgZE", "()[Landroidx/compose/ui/node/LayoutNodeEntity;", "invalidateParentLayer", "Lsn/a;", "lastLayerDrawingWasSkipped", "getLastLayerDrawingWasSkipped$ui_release", "Landroidx/compose/ui/node/OwnedLayer;", AdRevenueConstants.LAYER_KEY, "Landroidx/compose/ui/node/OwnedLayer;", "getLayer", "()Landroidx/compose/ui/node/OwnedLayer;", "getHasMeasureResult", "hasMeasureResult", "Landroidx/compose/ui/node/SimpleEntity;", "Landroidx/compose/ui/layout/ParentDataModifier;", "", "getParentData", "(Landroidx/compose/ui/node/SimpleEntity;)Ljava/lang/Object;", "parentData", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "snapshotObserver", "getWrapped$ui_release", "wrapped", "Landroidx/compose/ui/layout/MeasureScope;", "getMeasureScope", "()Landroidx/compose/ui/layout/MeasureScope;", "measureScope", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "size", "isAttached", "value", "getMeasureResult", "()Landroidx/compose/ui/layout/MeasureResult;", "setMeasureResult$ui_release", "(Landroidx/compose/ui/layout/MeasureResult;)V", "measureResult", "", "getProvidedAlignmentLines", "()Ljava/util/Set;", "providedAlignmentLines", "()Ljava/lang/Object;", "getParentLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "parentLayoutCoordinates", "getParentCoordinates", "parentCoordinates", "getRectCache", "()Landroidx/compose/ui/geometry/MutableRect;", "rectCache", "isValid", "getMinimumTouchTargetSize-NH-jbRc", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", VastTagName.COMPANION, "HitTestSource", "ui_release"}, k = 1, mv = {1, 6, 0})
public abstract class LayoutNodeWrapper extends Placeable implements Measurable, LayoutCoordinates, OwnerScope, l<Canvas, r> {

    @NotNull
    public static final String ExpectAttachedLayoutCoordinates = "LayoutCoordinate operations are only valid when isAttached is true";

    @NotNull
    public static final String UnmeasuredError = "Asking for measurement result of unmeasured layout modifier";
    private boolean _isAttached;

    @Nullable
    private MeasureResult _measureResult;

    @Nullable
    private MutableRect _rectCache;

    @NotNull
    private final LayoutNodeEntity<?, ?>[] entities;

    @NotNull
    private final sn.a<r> invalidateParentLayer;
    private boolean isClipping;
    private boolean isShallowPlacing;
    private float lastLayerAlpha;
    private boolean lastLayerDrawingWasSkipped;

    @Nullable
    private OwnedLayer layer;

    @Nullable
    private l<? super GraphicsLayerScope, r> layerBlock;

    @NotNull
    private Density layerDensity;

    @NotNull
    private LayoutDirection layerLayoutDirection;

    @NotNull
    private final LayoutNode layoutNode;

    @Nullable
    private Map<AlignmentLine, Integer> oldAlignmentLines;
    private long position;

    @Nullable
    private LayoutNodeWrapper wrappedBy;
    private float zIndex;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final l<LayoutNodeWrapper, r> onCommitAffectingLayerParams = new l<LayoutNodeWrapper, r>() { // from class: androidx.compose.ui.node.LayoutNodeWrapper$Companion$onCommitAffectingLayerParams$1
        @Override // sn.l
        public /* bridge */ /* synthetic */ r invoke(LayoutNodeWrapper layoutNodeWrapper) {
            invoke2(layoutNodeWrapper);
            return r.f5635a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull LayoutNodeWrapper layoutNodeWrapper) {
            p.k(layoutNodeWrapper, "wrapper");
            if (layoutNodeWrapper.isValid()) {
                layoutNodeWrapper.updateLayerParameters();
            }
        }
    };

    @NotNull
    private static final l<LayoutNodeWrapper, r> onCommitAffectingLayer = new l<LayoutNodeWrapper, r>() { // from class: androidx.compose.ui.node.LayoutNodeWrapper$Companion$onCommitAffectingLayer$1
        @Override // sn.l
        public /* bridge */ /* synthetic */ r invoke(LayoutNodeWrapper layoutNodeWrapper) {
            invoke2(layoutNodeWrapper);
            return r.f5635a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull LayoutNodeWrapper layoutNodeWrapper) {
            p.k(layoutNodeWrapper, "wrapper");
            OwnedLayer layer = layoutNodeWrapper.getLayer();
            if (layer != null) {
                layer.invalidate();
            }
        }
    };

    @NotNull
    private static final ReusableGraphicsLayerScope graphicsLayerScope = new ReusableGraphicsLayerScope();

    @NotNull
    private static final HitTestSource<PointerInputEntity, PointerInputFilter, PointerInputModifier> PointerInputSource = new HitTestSource<PointerInputEntity, PointerInputFilter, PointerInputModifier>() { // from class: androidx.compose.ui.node.LayoutNodeWrapper$Companion$PointerInputSource$1
        @Override // androidx.compose.ui.node.LayoutNodeWrapper.HitTestSource
        /* JADX INFO: renamed from: childHitTest-YqVAtuI, reason: not valid java name */
        public void mo3270childHitTestYqVAtuI(@NotNull LayoutNode layoutNode, long pointerPosition, @NotNull HitTestResult<PointerInputFilter> hitTestResult, boolean isTouchEvent, boolean isInLayer) {
            p.k(layoutNode, "layoutNode");
            p.k(hitTestResult, "hitTestResult");
            layoutNode.m3237hitTestM_7yMNQ$ui_release(pointerPosition, hitTestResult, isTouchEvent, isInLayer);
        }

        @Override // androidx.compose.ui.node.LayoutNodeWrapper.HitTestSource
        @NotNull
        public PointerInputFilter contentFrom(@NotNull PointerInputEntity entity) {
            p.k(entity, "entity");
            return entity.getModifier().getPointerInputFilter();
        }

        @Override // androidx.compose.ui.node.LayoutNodeWrapper.HitTestSource
        /* JADX INFO: renamed from: entityType-EEbPh1w, reason: not valid java name */
        public int mo3271entityTypeEEbPh1w() {
            return EntityList.INSTANCE.m3221getPointerInputEntityTypeEEbPh1w();
        }

        @Override // androidx.compose.ui.node.LayoutNodeWrapper.HitTestSource
        public boolean interceptOutOfBoundsChildEvents(@NotNull PointerInputEntity entity) {
            p.k(entity, "entity");
            return entity.getModifier().getPointerInputFilter().getInterceptOutOfBoundsChildEvents();
        }

        @Override // androidx.compose.ui.node.LayoutNodeWrapper.HitTestSource
        public boolean shouldHitTestChildren(@NotNull LayoutNode parentLayoutNode) {
            p.k(parentLayoutNode, "parentLayoutNode");
            return true;
        }
    };

    @NotNull
    private static final HitTestSource<SemanticsEntity, SemanticsEntity, SemanticsModifier> SemanticsSource = new HitTestSource<SemanticsEntity, SemanticsEntity, SemanticsModifier>() { // from class: androidx.compose.ui.node.LayoutNodeWrapper$Companion$SemanticsSource$1
        @Override // androidx.compose.ui.node.LayoutNodeWrapper.HitTestSource
        /* JADX INFO: renamed from: childHitTest-YqVAtuI */
        public void mo3270childHitTestYqVAtuI(@NotNull LayoutNode layoutNode, long pointerPosition, @NotNull HitTestResult<SemanticsEntity> hitTestResult, boolean isTouchEvent, boolean isInLayer) {
            p.k(layoutNode, "layoutNode");
            p.k(hitTestResult, "hitTestResult");
            layoutNode.m3238hitTestSemanticsM_7yMNQ$ui_release(pointerPosition, hitTestResult, isTouchEvent, isInLayer);
        }

        @Override // androidx.compose.ui.node.LayoutNodeWrapper.HitTestSource
        @NotNull
        public SemanticsEntity contentFrom(@NotNull SemanticsEntity entity) {
            p.k(entity, "entity");
            return entity;
        }

        @Override // androidx.compose.ui.node.LayoutNodeWrapper.HitTestSource
        /* JADX INFO: renamed from: entityType-EEbPh1w */
        public int mo3271entityTypeEEbPh1w() {
            return EntityList.INSTANCE.m3223getSemanticsEntityTypeEEbPh1w();
        }

        @Override // androidx.compose.ui.node.LayoutNodeWrapper.HitTestSource
        public boolean interceptOutOfBoundsChildEvents(@NotNull SemanticsEntity entity) {
            p.k(entity, "entity");
            return false;
        }

        @Override // androidx.compose.ui.node.LayoutNodeWrapper.HitTestSource
        public boolean shouldHitTestChildren(@NotNull LayoutNode parentLayoutNode) {
            SemanticsConfiguration semanticsConfigurationCollapsedSemanticsConfiguration;
            p.k(parentLayoutNode, "parentLayoutNode");
            SemanticsEntity outerSemantics = SemanticsNodeKt.getOuterSemantics(parentLayoutNode);
            boolean z10 = false;
            if (outerSemantics != null && (semanticsConfigurationCollapsedSemanticsConfiguration = outerSemantics.collapsedSemanticsConfiguration()) != null && semanticsConfigurationCollapsedSemanticsConfiguration.getIsClearingSemantics()) {
                z10 = true;
            }
            return !z10;
        }
    };

    /* JADX INFO: compiled from: LayoutNodeWrapper.kt */
    @Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cR)\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR)\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\tR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeWrapper$Companion;", "", "Landroidx/compose/ui/node/LayoutNodeWrapper$HitTestSource;", "Landroidx/compose/ui/node/PointerInputEntity;", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "Landroidx/compose/ui/input/pointer/PointerInputModifier;", "PointerInputSource", "Landroidx/compose/ui/node/LayoutNodeWrapper$HitTestSource;", "getPointerInputSource", "()Landroidx/compose/ui/node/LayoutNodeWrapper$HitTestSource;", "Landroidx/compose/ui/semantics/SemanticsEntity;", "Landroidx/compose/ui/semantics/SemanticsModifier;", "SemanticsSource", "getSemanticsSource", "", "ExpectAttachedLayoutCoordinates", "Ljava/lang/String;", "UnmeasuredError", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "graphicsLayerScope", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "Lkotlin/Function1;", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "Lbn/r;", "onCommitAffectingLayer", "Lsn/l;", "onCommitAffectingLayerParams", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @NotNull
        public final HitTestSource<PointerInputEntity, PointerInputFilter, PointerInputModifier> getPointerInputSource() {
            return LayoutNodeWrapper.PointerInputSource;
        }

        @NotNull
        public final HitTestSource<SemanticsEntity, SemanticsEntity, SemanticsModifier> getSemanticsSource() {
            return LayoutNodeWrapper.SemanticsSource;
        }
    }

    /* JADX INFO: compiled from: LayoutNodeWrapper.kt */
    @Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000*\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0001*\u0004\b\u0001\u0010\u0003*\b\b\u0002\u0010\u0005*\u00020\u00042\u00020\u0006J$\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0007H&ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00028\u0000H&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00028\u0000H&¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H&JC\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000eH&ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u001c\u0010\u001dø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u001fÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeWrapper$HitTestSource;", "Landroidx/compose/ui/node/LayoutNodeEntity;", "T", "C", "Landroidx/compose/ui/Modifier;", "M", "", "Landroidx/compose/ui/node/EntityList$EntityType;", "entityType-EEbPh1w", "()I", "entityType", "entity", "contentFrom", "(Landroidx/compose/ui/node/LayoutNodeEntity;)Ljava/lang/Object;", "", "interceptOutOfBoundsChildEvents", "(Landroidx/compose/ui/node/LayoutNodeEntity;)Z", "Landroidx/compose/ui/node/LayoutNode;", "parentLayoutNode", "shouldHitTestChildren", "layoutNode", "Landroidx/compose/ui/geometry/Offset;", "pointerPosition", "Landroidx/compose/ui/node/HitTestResult;", "hitTestResult", "isTouchEvent", "isInLayer", "Lbn/r;", "childHitTest-YqVAtuI", "(Landroidx/compose/ui/node/LayoutNode;JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "childHitTest", "ui_release"}, k = 1, mv = {1, 6, 0})
    public interface HitTestSource<T extends LayoutNodeEntity<T, M>, C, M extends Modifier> {
        /* JADX INFO: renamed from: childHitTest-YqVAtuI */
        void mo3270childHitTestYqVAtuI(@NotNull LayoutNode layoutNode, long pointerPosition, @NotNull HitTestResult<C> hitTestResult, boolean isTouchEvent, boolean isInLayer);

        C contentFrom(@NotNull T entity);

        /* JADX INFO: renamed from: entityType-EEbPh1w */
        int mo3271entityTypeEEbPh1w();

        boolean interceptOutOfBoundsChildEvents(@NotNull T entity);

        boolean shouldHitTestChildren(@NotNull LayoutNode parentLayoutNode);
    }

    public LayoutNodeWrapper(@NotNull LayoutNode layoutNode) {
        p.k(layoutNode, "layoutNode");
        this.layoutNode = layoutNode;
        this.layerDensity = layoutNode.getDensity();
        this.layerLayoutDirection = layoutNode.getLayoutDirection();
        this.lastLayerAlpha = 0.8f;
        this.position = IntOffset.INSTANCE.m3954getZeronOccac();
        this.entities = EntityList.m3206constructorimpl$default(null, 1, null);
        this.invalidateParentLayer = new sn.a<r>() { // from class: androidx.compose.ui.node.LayoutNodeWrapper$invalidateParentLayer$1
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
                LayoutNodeWrapper wrappedBy = this.this$0.getWrappedBy();
                if (wrappedBy != null) {
                    wrappedBy.invalidateLayer();
                }
            }
        };
    }

    private final void ancestorToLocal(LayoutNodeWrapper layoutNodeWrapper, MutableRect mutableRect, boolean z10) {
        if (layoutNodeWrapper == this) {
            return;
        }
        LayoutNodeWrapper layoutNodeWrapper2 = this.wrappedBy;
        if (layoutNodeWrapper2 != null) {
            layoutNodeWrapper2.ancestorToLocal(layoutNodeWrapper, mutableRect, z10);
        }
        fromParentRect(mutableRect, z10);
    }

    /* JADX INFO: renamed from: ancestorToLocal-R5De75A, reason: not valid java name */
    private final long m3254ancestorToLocalR5De75A(LayoutNodeWrapper ancestor, long offset) {
        if (ancestor == this) {
            return offset;
        }
        LayoutNodeWrapper layoutNodeWrapper = this.wrappedBy;
        return (layoutNodeWrapper == null || p.f(ancestor, layoutNodeWrapper)) ? m3261fromParentPositionMKHz9U(offset) : m3261fromParentPositionMKHz9U(layoutNodeWrapper.m3254ancestorToLocalR5De75A(ancestor, offset));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void drawContainedDrawModifiers(Canvas canvas) {
        DrawEntity drawEntity = (DrawEntity) EntityList.m3214head0OSVbXo(this.entities, EntityList.INSTANCE.m3218getDrawEntityTypeEEbPh1w());
        if (drawEntity == null) {
            performDraw(canvas);
        } else {
            drawEntity.draw(canvas);
        }
    }

    private final void fromParentRect(MutableRect mutableRect, boolean z10) {
        float fM3944getXimpl = IntOffset.m3944getXimpl(this.position);
        mutableRect.setLeft(mutableRect.getLeft() - fM3944getXimpl);
        mutableRect.setRight(mutableRect.getRight() - fM3944getXimpl);
        float fM3945getYimpl = IntOffset.m3945getYimpl(this.position);
        mutableRect.setTop(mutableRect.getTop() - fM3945getYimpl);
        mutableRect.setBottom(mutableRect.getBottom() - fM3945getYimpl);
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mapBounds(mutableRect, true);
            if (this.isClipping && z10) {
                mutableRect.intersect(0.0f, 0.0f, IntSize.m3986getWidthimpl(mo3114getSizeYbymL2g()), IntSize.m3985getHeightimpl(mo3114getSizeYbymL2g()));
                mutableRect.isEmpty();
            }
        }
    }

    private final boolean getHasMeasureResult() {
        return this._measureResult != null;
    }

    private final Object getParentData(SimpleEntity<ParentDataModifier> simpleEntity) {
        if (simpleEntity != null) {
            return simpleEntity.getModifier().modifyParentData(getMeasureScope(), getParentData((SimpleEntity) simpleEntity.getNext()));
        }
        LayoutNodeWrapper wrapped$ui_release = getWrapped$ui_release();
        if (wrapped$ui_release != null) {
            return wrapped$ui_release.getParentData();
        }
        return null;
    }

    private final OwnerSnapshotObserver getSnapshotObserver() {
        return LayoutNodeKt.requireOwner(this.layoutNode).getSnapshotObserver();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: hit-1hIXUjU, reason: not valid java name */
    public final <T extends LayoutNodeEntity<T, M>, C, M extends Modifier> void m3255hit1hIXUjU(final T t10, final HitTestSource<T, C, M> hitTestSource, final long j10, final HitTestResult<C> hitTestResult, final boolean z10, final boolean z11) {
        if (t10 == null) {
            mo3232hitTestChildYqVAtuI(hitTestSource, j10, hitTestResult, z10, z11);
        } else {
            hitTestResult.hit(hitTestSource.contentFrom(t10), z11, new sn.a<r>() { // from class: androidx.compose.ui.node.LayoutNodeWrapper$hit$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/ui/node/LayoutNodeWrapper;TT;Landroidx/compose/ui/node/LayoutNodeWrapper$HitTestSource<TT;TC;TM;>;JLandroidx/compose/ui/node/HitTestResult<TC;>;ZZ)V */
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
                    this.this$0.m3255hit1hIXUjU(t10.getNext(), hitTestSource, j10, hitTestResult, z10, z11);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: hitNear-JHbHoSQ, reason: not valid java name */
    public final <T extends LayoutNodeEntity<T, M>, C, M extends Modifier> void m3256hitNearJHbHoSQ(final T t10, final HitTestSource<T, C, M> hitTestSource, final long j10, final HitTestResult<C> hitTestResult, final boolean z10, final boolean z11, final float f10) {
        if (t10 == null) {
            mo3232hitTestChildYqVAtuI(hitTestSource, j10, hitTestResult, z10, z11);
        } else {
            hitTestResult.hitInMinimumTouchTarget(hitTestSource.contentFrom(t10), f10, z11, new sn.a<r>() { // from class: androidx.compose.ui.node.LayoutNodeWrapper$hitNear$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/ui/node/LayoutNodeWrapper;TT;Landroidx/compose/ui/node/LayoutNodeWrapper$HitTestSource<TT;TC;TM;>;JLandroidx/compose/ui/node/HitTestResult<TC;>;ZZF)V */
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
                    this.this$0.m3256hitNearJHbHoSQ(t10.getNext(), hitTestSource, j10, hitTestResult, z10, z11, f10);
                }
            });
        }
    }

    /* JADX INFO: renamed from: offsetFromEdge-MK-Hz9U, reason: not valid java name */
    private final long m3257offsetFromEdgeMKHz9U(long pointerPosition) {
        float fM1383getXimpl = Offset.m1383getXimpl(pointerPosition);
        float fMax = Math.max(0.0f, fM1383getXimpl < 0.0f ? -fM1383getXimpl : fM1383getXimpl - getMeasuredWidth());
        float fM1384getYimpl = Offset.m1384getYimpl(pointerPosition);
        return OffsetKt.Offset(fMax, Math.max(0.0f, fM1384getYimpl < 0.0f ? -fM1384getYimpl : fM1384getYimpl - getMeasuredHeight()));
    }

    public static /* synthetic */ Object propagateRelocationRequest$suspendImpl(LayoutNodeWrapper layoutNodeWrapper, Rect rect, c cVar) {
        Object objPropagateRelocationRequest;
        LayoutNodeWrapper layoutNodeWrapper2 = layoutNodeWrapper.wrappedBy;
        return (layoutNodeWrapper2 != null && (objPropagateRelocationRequest = layoutNodeWrapper2.propagateRelocationRequest(rect.m1420translatek4lQ0M(layoutNodeWrapper2.localBoundingBoxOf(layoutNodeWrapper, false).m1418getTopLeftF1C5BW0()), cVar)) == in.a.g()) ? objPropagateRelocationRequest : r.f5635a;
    }

    public static /* synthetic */ void rectInParent$ui_release$default(LayoutNodeWrapper layoutNodeWrapper, MutableRect mutableRect, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        layoutNodeWrapper.rectInParent$ui_release(mutableRect, z10, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: speculativeHit-JHbHoSQ, reason: not valid java name */
    public final <T extends LayoutNodeEntity<T, M>, C, M extends Modifier> void m3258speculativeHitJHbHoSQ(final T t10, final HitTestSource<T, C, M> hitTestSource, final long j10, final HitTestResult<C> hitTestResult, final boolean z10, final boolean z11, final float f10) {
        if (t10 == null) {
            mo3232hitTestChildYqVAtuI(hitTestSource, j10, hitTestResult, z10, z11);
        } else if (hitTestSource.interceptOutOfBoundsChildEvents(t10)) {
            hitTestResult.speculativeHit(hitTestSource.contentFrom(t10), f10, z11, new sn.a<r>() { // from class: androidx.compose.ui.node.LayoutNodeWrapper$speculativeHit$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/ui/node/LayoutNodeWrapper;TT;Landroidx/compose/ui/node/LayoutNodeWrapper$HitTestSource<TT;TC;TM;>;JLandroidx/compose/ui/node/HitTestResult<TC;>;ZZF)V */
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
                    this.this$0.m3258speculativeHitJHbHoSQ(t10.getNext(), hitTestSource, j10, hitTestResult, z10, z11, f10);
                }
            });
        } else {
            m3258speculativeHitJHbHoSQ(t10.getNext(), hitTestSource, j10, hitTestResult, z10, z11, f10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateLayerParameters() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            final l<? super GraphicsLayerScope, r> lVar = this.layerBlock;
            if (lVar == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            ReusableGraphicsLayerScope reusableGraphicsLayerScope = graphicsLayerScope;
            reusableGraphicsLayerScope.reset();
            reusableGraphicsLayerScope.setGraphicsDensity$ui_release(this.layoutNode.getDensity());
            getSnapshotObserver().observeReads$ui_release(this, onCommitAffectingLayerParams, new sn.a<r>() { // from class: androidx.compose.ui.node.LayoutNodeWrapper.updateLayerParameters.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
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
                    lVar.invoke(LayoutNodeWrapper.graphicsLayerScope);
                }
            });
            ownedLayer.mo3283updateLayerPropertiesNHXXZp8(reusableGraphicsLayerScope.getScaleX(), reusableGraphicsLayerScope.getScaleY(), reusableGraphicsLayerScope.getAlpha(), reusableGraphicsLayerScope.getTranslationX(), reusableGraphicsLayerScope.getTranslationY(), reusableGraphicsLayerScope.getShadowElevation(), reusableGraphicsLayerScope.getRotationX(), reusableGraphicsLayerScope.getRotationY(), reusableGraphicsLayerScope.getRotationZ(), reusableGraphicsLayerScope.getCameraDistance(), reusableGraphicsLayerScope.getTransformOrigin(), reusableGraphicsLayerScope.getShape(), reusableGraphicsLayerScope.getClip(), reusableGraphicsLayerScope.getRenderEffect(), reusableGraphicsLayerScope.getAmbientShadowColor(), reusableGraphicsLayerScope.getSpotShadowColor(), this.layoutNode.getLayoutDirection(), this.layoutNode.getDensity());
            this.isClipping = reusableGraphicsLayerScope.getClip();
        } else {
            if (!(this.layerBlock == null)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
        this.lastLayerAlpha = graphicsLayerScope.getAlpha();
        Owner owner = this.layoutNode.getOwner();
        if (owner != null) {
            owner.onLayoutChange(this.layoutNode);
        }
    }

    public void attach() {
        this._isAttached = true;
        onLayerBlockUpdated(this.layerBlock);
        for (LayoutNodeEntity<?, ?> next : this.entities) {
            for (; next != null; next = next.getNext()) {
                next.onAttach();
            }
        }
    }

    public abstract int calculateAlignmentLine(@NotNull AlignmentLine alignmentLine);

    /* JADX INFO: renamed from: calculateMinimumTouchTargetPadding-E7KxVPU, reason: not valid java name */
    public final long m3259calculateMinimumTouchTargetPaddingE7KxVPU(long minimumTouchTargetSize) {
        return SizeKt.Size(Math.max(0.0f, (Size.m1452getWidthimpl(minimumTouchTargetSize) - getMeasuredWidth()) / 2.0f), Math.max(0.0f, (Size.m1449getHeightimpl(minimumTouchTargetSize) - getMeasuredHeight()) / 2.0f));
    }

    public void detach() {
        for (LayoutNodeEntity<?, ?> next : this.entities) {
            for (; next != null; next = next.getNext()) {
                next.onDetach();
            }
        }
        this._isAttached = false;
        onLayerBlockUpdated(this.layerBlock);
        LayoutNode parent$ui_release = this.layoutNode.getParent$ui_release();
        if (parent$ui_release != null) {
            parent$ui_release.invalidateLayer$ui_release();
        }
    }

    /* JADX INFO: renamed from: distanceInMinimumTouchTarget-tz77jQw, reason: not valid java name */
    public final float m3260distanceInMinimumTouchTargettz77jQw(long pointerPosition, long minimumTouchTargetSize) {
        if (getMeasuredWidth() >= Size.m1452getWidthimpl(minimumTouchTargetSize) && getMeasuredHeight() >= Size.m1449getHeightimpl(minimumTouchTargetSize)) {
            return Float.POSITIVE_INFINITY;
        }
        long jM3259calculateMinimumTouchTargetPaddingE7KxVPU = m3259calculateMinimumTouchTargetPaddingE7KxVPU(minimumTouchTargetSize);
        float fM1452getWidthimpl = Size.m1452getWidthimpl(jM3259calculateMinimumTouchTargetPaddingE7KxVPU);
        float fM1449getHeightimpl = Size.m1449getHeightimpl(jM3259calculateMinimumTouchTargetPaddingE7KxVPU);
        long jM3257offsetFromEdgeMKHz9U = m3257offsetFromEdgeMKHz9U(pointerPosition);
        if ((fM1452getWidthimpl > 0.0f || fM1449getHeightimpl > 0.0f) && Offset.m1383getXimpl(jM3257offsetFromEdgeMKHz9U) <= fM1452getWidthimpl && Offset.m1384getYimpl(jM3257offsetFromEdgeMKHz9U) <= fM1449getHeightimpl) {
            return Offset.m1382getDistanceSquaredimpl(jM3257offsetFromEdgeMKHz9U);
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void draw(@NotNull Canvas canvas) {
        p.k(canvas, "canvas");
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.drawLayer(canvas);
            return;
        }
        float fM3944getXimpl = IntOffset.m3944getXimpl(this.position);
        float fM3945getYimpl = IntOffset.m3945getYimpl(this.position);
        canvas.translate(fM3944getXimpl, fM3945getYimpl);
        drawContainedDrawModifiers(canvas);
        canvas.translate(-fM3944getXimpl, -fM3945getYimpl);
    }

    public final void drawBorder(@NotNull Canvas canvas, @NotNull Paint paint) {
        p.k(canvas, "canvas");
        p.k(paint, "paint");
        canvas.drawRect(new Rect(0.5f, 0.5f, IntSize.m3986getWidthimpl(getMeasuredSize()) - 0.5f, IntSize.m3985getHeightimpl(getMeasuredSize()) - 0.5f), paint);
    }

    @NotNull
    public final LayoutNodeWrapper findCommonAncestor$ui_release(@NotNull LayoutNodeWrapper other) {
        p.k(other, "other");
        LayoutNode parent$ui_release = other.layoutNode;
        LayoutNode parent$ui_release2 = this.layoutNode;
        if (parent$ui_release == parent$ui_release2) {
            LayoutNodeWrapper outerLayoutNodeWrapper$ui_release = parent$ui_release2.getOuterLayoutNodeWrapper$ui_release();
            LayoutNodeWrapper layoutNodeWrapper = this;
            while (layoutNodeWrapper != outerLayoutNodeWrapper$ui_release && layoutNodeWrapper != other) {
                layoutNodeWrapper = layoutNodeWrapper.wrappedBy;
                p.h(layoutNodeWrapper);
            }
            return layoutNodeWrapper == other ? other : this;
        }
        while (parent$ui_release.getDepth() > parent$ui_release2.getDepth()) {
            parent$ui_release = parent$ui_release.getParent$ui_release();
            p.h(parent$ui_release);
        }
        while (parent$ui_release2.getDepth() > parent$ui_release.getDepth()) {
            parent$ui_release2 = parent$ui_release2.getParent$ui_release();
            p.h(parent$ui_release2);
        }
        while (parent$ui_release != parent$ui_release2) {
            parent$ui_release = parent$ui_release.getParent$ui_release();
            parent$ui_release2 = parent$ui_release2.getParent$ui_release();
            if (parent$ui_release == null || parent$ui_release2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        return parent$ui_release2 == this.layoutNode ? this : parent$ui_release == other.layoutNode ? other : parent$ui_release.getInnerLayoutNodeWrapper();
    }

    /* JADX INFO: renamed from: fromParentPosition-MK-Hz9U, reason: not valid java name */
    public long m3261fromParentPositionMKHz9U(long position) {
        long jM3956minusNvtHpc = IntOffsetKt.m3956minusNvtHpc(position, this.position);
        OwnedLayer ownedLayer = this.layer;
        return ownedLayer != null ? ownedLayer.mo3280mapOffset8S9VItk(jM3956minusNvtHpc, true) : jM3956minusNvtHpc;
    }

    @Override // androidx.compose.ui.layout.Measured
    public final int get(@NotNull AlignmentLine alignmentLine) {
        int iCalculateAlignmentLine;
        p.k(alignmentLine, "alignmentLine");
        if (getHasMeasureResult() && (iCalculateAlignmentLine = calculateAlignmentLine(alignmentLine)) != Integer.MIN_VALUE) {
            return iCalculateAlignmentLine + (alignmentLine instanceof VerticalAlignmentLine ? IntOffset.m3944getXimpl(m3149getApparentToRealOffsetnOccac()) : IntOffset.m3945getYimpl(m3149getApparentToRealOffsetnOccac()));
        }
        return Integer.MIN_VALUE;
    }

    @NotNull
    /* JADX INFO: renamed from: getEntities-CHwCgZE, reason: not valid java name */
    public final LayoutNodeEntity<?, ?>[] m3262getEntitiesCHwCgZE() {
        return this.entities;
    }

    /* JADX INFO: renamed from: getLastLayerDrawingWasSkipped$ui_release, reason: from getter */
    public final boolean getLastLayerDrawingWasSkipped() {
        return this.lastLayerDrawingWasSkipped;
    }

    @Nullable
    public final OwnedLayer getLayer() {
        return this.layer;
    }

    @Nullable
    public final l<GraphicsLayerScope, r> getLayerBlock() {
        return this.layerBlock;
    }

    @NotNull
    /* JADX INFO: renamed from: getLayoutNode$ui_release, reason: from getter */
    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    @NotNull
    public final MeasureResult getMeasureResult() {
        MeasureResult measureResult = this._measureResult;
        if (measureResult != null) {
            return measureResult;
        }
        throw new IllegalStateException(UnmeasuredError.toString());
    }

    @NotNull
    public abstract MeasureScope getMeasureScope();

    /* JADX INFO: renamed from: getMinimumTouchTargetSize-NH-jbRc, reason: not valid java name */
    public final long m3263getMinimumTouchTargetSizeNHjbRc() {
        return this.layerDensity.mo307toSizeXkaWNTQ(this.layoutNode.getViewConfiguration().mo3241getMinimumTouchTargetSizeMYxV2XQ());
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    @Nullable
    public final LayoutCoordinates getParentCoordinates() {
        if (isAttached()) {
            return this.wrappedBy;
        }
        throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
    }

    @Override // androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
    @Nullable
    public Object getParentData() {
        return getParentData((SimpleEntity) EntityList.m3214head0OSVbXo(this.entities, EntityList.INSTANCE.m3220getParentDataEntityTypeEEbPh1w()));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    @Nullable
    public final LayoutCoordinates getParentLayoutCoordinates() {
        if (isAttached()) {
            return this.layoutNode.getOuterLayoutNodeWrapper$ui_release().wrappedBy;
        }
        throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
    }

    /* JADX INFO: renamed from: getPosition-nOcc-ac, reason: not valid java name and from getter */
    public final long getPosition() {
        return this.position;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    @NotNull
    public Set<AlignmentLine> getProvidedAlignmentLines() {
        LinkedHashSet linkedHashSet = null;
        for (LayoutNodeWrapper wrapped$ui_release = this; wrapped$ui_release != null; wrapped$ui_release = wrapped$ui_release.getWrapped$ui_release()) {
            MeasureResult measureResult = wrapped$ui_release._measureResult;
            Map<AlignmentLine, Integer> alignmentLines = measureResult != null ? measureResult.getAlignmentLines() : null;
            boolean z10 = false;
            if (alignmentLines != null && (!alignmentLines.isEmpty())) {
                z10 = true;
            }
            if (z10) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.addAll(alignmentLines.keySet());
            }
        }
        return linkedHashSet == null ? w0.f() : linkedHashSet;
    }

    @NotNull
    public final MutableRect getRectCache() {
        MutableRect mutableRect = this._rectCache;
        if (mutableRect != null) {
            return mutableRect;
        }
        MutableRect mutableRect2 = new MutableRect(0.0f, 0.0f, 0.0f, 0.0f);
        this._rectCache = mutableRect2;
        return mutableRect2;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: getSize-YbymL2g */
    public final long mo3114getSizeYbymL2g() {
        return getMeasuredSize();
    }

    @Nullable
    public LayoutNodeWrapper getWrapped$ui_release() {
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: getWrappedBy$ui_release, reason: from getter */
    public final LayoutNodeWrapper getWrappedBy() {
        return this.wrappedBy;
    }

    public final float getZIndex() {
        return this.zIndex;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: hitTest-YqVAtuI, reason: not valid java name */
    public final <T extends LayoutNodeEntity<T, M>, C, M extends Modifier> void m3265hitTestYqVAtuI(@NotNull HitTestSource<T, C, M> hitTestSource, long pointerPosition, @NotNull HitTestResult<C> hitTestResult, boolean isTouchEvent, boolean isInLayer) {
        p.k(hitTestSource, "hitTestSource");
        p.k(hitTestResult, "hitTestResult");
        LayoutNodeEntity layoutNodeEntityM3214head0OSVbXo = EntityList.m3214head0OSVbXo(this.entities, hitTestSource.mo3271entityTypeEEbPh1w());
        if (!m3269withinLayerBoundsk4lQ0M(pointerPosition)) {
            if (isTouchEvent) {
                float fM3260distanceInMinimumTouchTargettz77jQw = m3260distanceInMinimumTouchTargettz77jQw(pointerPosition, m3263getMinimumTouchTargetSizeNHjbRc());
                if (((Float.isInfinite(fM3260distanceInMinimumTouchTargettz77jQw) || Float.isNaN(fM3260distanceInMinimumTouchTargettz77jQw)) ? false : true) && hitTestResult.isHitInMinimumTouchTargetBetter(fM3260distanceInMinimumTouchTargettz77jQw, false)) {
                    m3256hitNearJHbHoSQ(layoutNodeEntityM3214head0OSVbXo, hitTestSource, pointerPosition, hitTestResult, isTouchEvent, false, fM3260distanceInMinimumTouchTargettz77jQw);
                    return;
                }
                return;
            }
            return;
        }
        if (layoutNodeEntityM3214head0OSVbXo == null) {
            mo3232hitTestChildYqVAtuI(hitTestSource, pointerPosition, hitTestResult, isTouchEvent, isInLayer);
            return;
        }
        if (m3266isPointerInBoundsk4lQ0M(pointerPosition)) {
            m3255hit1hIXUjU(layoutNodeEntityM3214head0OSVbXo, hitTestSource, pointerPosition, hitTestResult, isTouchEvent, isInLayer);
            return;
        }
        float fM3260distanceInMinimumTouchTargettz77jQw2 = !isTouchEvent ? Float.POSITIVE_INFINITY : m3260distanceInMinimumTouchTargettz77jQw(pointerPosition, m3263getMinimumTouchTargetSizeNHjbRc());
        if (((Float.isInfinite(fM3260distanceInMinimumTouchTargettz77jQw2) || Float.isNaN(fM3260distanceInMinimumTouchTargettz77jQw2)) ? false : true) && hitTestResult.isHitInMinimumTouchTargetBetter(fM3260distanceInMinimumTouchTargettz77jQw2, isInLayer)) {
            m3256hitNearJHbHoSQ(layoutNodeEntityM3214head0OSVbXo, hitTestSource, pointerPosition, hitTestResult, isTouchEvent, isInLayer, fM3260distanceInMinimumTouchTargettz77jQw2);
        } else {
            m3258speculativeHitJHbHoSQ(layoutNodeEntityM3214head0OSVbXo, hitTestSource, pointerPosition, hitTestResult, isTouchEvent, isInLayer, fM3260distanceInMinimumTouchTargettz77jQw2);
        }
    }

    /* JADX INFO: renamed from: hitTestChild-YqVAtuI */
    public <T extends LayoutNodeEntity<T, M>, C, M extends Modifier> void mo3232hitTestChildYqVAtuI(@NotNull HitTestSource<T, C, M> hitTestSource, long pointerPosition, @NotNull HitTestResult<C> hitTestResult, boolean isTouchEvent, boolean isInLayer) {
        p.k(hitTestSource, "hitTestSource");
        p.k(hitTestResult, "hitTestResult");
        LayoutNodeWrapper wrapped$ui_release = getWrapped$ui_release();
        if (wrapped$ui_release != null) {
            wrapped$ui_release.m3265hitTestYqVAtuI(hitTestSource, wrapped$ui_release.m3261fromParentPositionMKHz9U(pointerPosition), hitTestResult, isTouchEvent, isInLayer);
        }
    }

    public void invalidateLayer() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
            return;
        }
        LayoutNodeWrapper layoutNodeWrapper = this.wrappedBy;
        if (layoutNodeWrapper != null) {
            layoutNodeWrapper.invalidateLayer();
        }
    }

    @Override // sn.l
    public /* bridge */ /* synthetic */ r invoke(Canvas canvas) {
        invoke2(canvas);
        return r.f5635a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public void invoke2(@NotNull final Canvas canvas) {
        p.k(canvas, "canvas");
        if (!this.layoutNode.getIsPlaced()) {
            this.lastLayerDrawingWasSkipped = true;
        } else {
            getSnapshotObserver().observeReads$ui_release(this, onCommitAffectingLayer, new sn.a<r>() { // from class: androidx.compose.ui.node.LayoutNodeWrapper.invoke.1
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
                    LayoutNodeWrapper.this.drawContainedDrawModifiers(canvas);
                }
            });
            this.lastLayerDrawingWasSkipped = false;
        }
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final boolean isAttached() {
        if (!this._isAttached || this.layoutNode.isAttached()) {
            return this._isAttached;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* JADX INFO: renamed from: isPointerInBounds-k-4lQ0M, reason: not valid java name */
    public final boolean m3266isPointerInBoundsk4lQ0M(long pointerPosition) {
        float fM1383getXimpl = Offset.m1383getXimpl(pointerPosition);
        float fM1384getYimpl = Offset.m1384getYimpl(pointerPosition);
        return fM1383getXimpl >= 0.0f && fM1384getYimpl >= 0.0f && fM1383getXimpl < ((float) getMeasuredWidth()) && fM1384getYimpl < ((float) getMeasuredHeight());
    }

    /* JADX INFO: renamed from: isShallowPlacing, reason: from getter */
    public final boolean getIsShallowPlacing() {
        return this.isShallowPlacing;
    }

    public final boolean isTransparent() {
        if (this.layer != null && this.lastLayerAlpha <= 0.0f) {
            return true;
        }
        LayoutNodeWrapper layoutNodeWrapper = this.wrappedBy;
        if (layoutNodeWrapper != null) {
            return layoutNodeWrapper.isTransparent();
        }
        return false;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValid() {
        return this.layer != null;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    @NotNull
    public Rect localBoundingBoxOf(@NotNull LayoutCoordinates sourceCoordinates, boolean clipBounds) {
        p.k(sourceCoordinates, "sourceCoordinates");
        if (!isAttached()) {
            throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
        }
        if (!sourceCoordinates.isAttached()) {
            throw new IllegalStateException(("LayoutCoordinates " + sourceCoordinates + " is not attached!").toString());
        }
        LayoutNodeWrapper layoutNodeWrapper = (LayoutNodeWrapper) sourceCoordinates;
        LayoutNodeWrapper layoutNodeWrapperFindCommonAncestor$ui_release = findCommonAncestor$ui_release(layoutNodeWrapper);
        MutableRect rectCache = getRectCache();
        rectCache.setLeft(0.0f);
        rectCache.setTop(0.0f);
        rectCache.setRight(IntSize.m3986getWidthimpl(sourceCoordinates.mo3114getSizeYbymL2g()));
        rectCache.setBottom(IntSize.m3985getHeightimpl(sourceCoordinates.mo3114getSizeYbymL2g()));
        while (layoutNodeWrapper != layoutNodeWrapperFindCommonAncestor$ui_release) {
            rectInParent$ui_release$default(layoutNodeWrapper, rectCache, clipBounds, false, 4, null);
            if (rectCache.isEmpty()) {
                return Rect.INSTANCE.getZero();
            }
            layoutNodeWrapper = layoutNodeWrapper.wrappedBy;
            p.h(layoutNodeWrapper);
        }
        ancestorToLocal(layoutNodeWrapperFindCommonAncestor$ui_release, rectCache, clipBounds);
        return MutableRectKt.toRect(rectCache);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localPositionOf-R5De75A */
    public long mo3115localPositionOfR5De75A(@NotNull LayoutCoordinates sourceCoordinates, long relativeToSource) {
        p.k(sourceCoordinates, "sourceCoordinates");
        LayoutNodeWrapper layoutNodeWrapper = (LayoutNodeWrapper) sourceCoordinates;
        LayoutNodeWrapper layoutNodeWrapperFindCommonAncestor$ui_release = findCommonAncestor$ui_release(layoutNodeWrapper);
        while (layoutNodeWrapper != layoutNodeWrapperFindCommonAncestor$ui_release) {
            relativeToSource = layoutNodeWrapper.m3268toParentPositionMKHz9U(relativeToSource);
            layoutNodeWrapper = layoutNodeWrapper.wrappedBy;
            p.h(layoutNodeWrapper);
        }
        return m3254ancestorToLocalR5De75A(layoutNodeWrapperFindCommonAncestor$ui_release, relativeToSource);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localToRoot-MK-Hz9U */
    public long mo3116localToRootMKHz9U(long relativeToLocal) {
        if (!isAttached()) {
            throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
        }
        for (LayoutNodeWrapper layoutNodeWrapper = this; layoutNodeWrapper != null; layoutNodeWrapper = layoutNodeWrapper.wrappedBy) {
            relativeToLocal = layoutNodeWrapper.m3268toParentPositionMKHz9U(relativeToLocal);
        }
        return relativeToLocal;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localToWindow-MK-Hz9U */
    public long mo3117localToWindowMKHz9U(long relativeToLocal) {
        return LayoutNodeKt.requireOwner(this.layoutNode).mo3285calculatePositionInWindowMKHz9U(mo3116localToRootMKHz9U(relativeToLocal));
    }

    public void onInitialize() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
        }
    }

    public final void onLayerBlockUpdated(@Nullable l<? super GraphicsLayerScope, r> lVar) {
        Owner owner;
        boolean z10 = (this.layerBlock == lVar && p.f(this.layerDensity, this.layoutNode.getDensity()) && this.layerLayoutDirection == this.layoutNode.getLayoutDirection()) ? false : true;
        this.layerBlock = lVar;
        this.layerDensity = this.layoutNode.getDensity();
        this.layerLayoutDirection = this.layoutNode.getLayoutDirection();
        if (!isAttached() || lVar == null) {
            OwnedLayer ownedLayer = this.layer;
            if (ownedLayer != null) {
                ownedLayer.destroy();
                this.layoutNode.setInnerLayerWrapperIsDirty$ui_release(true);
                this.invalidateParentLayer.invoke();
                if (isAttached() && (owner = this.layoutNode.getOwner()) != null) {
                    owner.onLayoutChange(this.layoutNode);
                }
            }
            this.layer = null;
            this.lastLayerDrawingWasSkipped = false;
            return;
        }
        if (this.layer != null) {
            if (z10) {
                updateLayerParameters();
                return;
            }
            return;
        }
        OwnedLayer ownedLayerCreateLayer = LayoutNodeKt.requireOwner(this.layoutNode).createLayer(this, this.invalidateParentLayer);
        ownedLayerCreateLayer.mo3282resizeozmzZPI(getMeasuredSize());
        ownedLayerCreateLayer.mo3281movegyyYBs(this.position);
        this.layer = ownedLayerCreateLayer;
        updateLayerParameters();
        this.layoutNode.setInnerLayerWrapperIsDirty$ui_release(true);
        this.invalidateParentLayer.invoke();
    }

    public void onMeasureResultChanged(int i10, int i11) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mo3282resizeozmzZPI(IntSizeKt.IntSize(i10, i11));
        } else {
            LayoutNodeWrapper layoutNodeWrapper = this.wrappedBy;
            if (layoutNodeWrapper != null) {
                layoutNodeWrapper.invalidateLayer();
            }
        }
        Owner owner = this.layoutNode.getOwner();
        if (owner != null) {
            owner.onLayoutChange(this.layoutNode);
        }
        m3152setMeasuredSizeozmzZPI(IntSizeKt.IntSize(i10, i11));
        for (LayoutNodeEntity<?, ?> next = this.entities[EntityList.INSTANCE.m3218getDrawEntityTypeEEbPh1w()]; next != null; next = next.getNext()) {
            ((DrawEntity) next).onMeasureResultChanged();
        }
    }

    public final void onMeasured() {
        LayoutNodeEntity<?, ?>[] layoutNodeEntityArr = this.entities;
        EntityList.Companion companion = EntityList.INSTANCE;
        if (EntityList.m3212has0OSVbXo(layoutNodeEntityArr, companion.m3222getRemeasureEntityTypeEEbPh1w())) {
            Snapshot snapshotCreateNonObservableSnapshot = Snapshot.INSTANCE.createNonObservableSnapshot();
            try {
                Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
                try {
                    for (LayoutNodeEntity<?, ?> next = this.entities[companion.m3222getRemeasureEntityTypeEEbPh1w()]; next != null; next = next.getNext()) {
                        ((OnRemeasuredModifier) ((SimpleEntity) next).getModifier()).mo239onRemeasuredozmzZPI(getMeasuredSize());
                    }
                    r rVar = r.f5635a;
                } finally {
                    snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                }
            } finally {
                snapshotCreateNonObservableSnapshot.dispose();
            }
        }
    }

    public void onModifierChanged() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
        }
    }

    public final void onPlaced() {
        for (LayoutNodeEntity<?, ?> next = this.entities[EntityList.INSTANCE.m3219getOnPlacedEntityTypeEEbPh1w()]; next != null; next = next.getNext()) {
            ((OnPlacedModifier) ((SimpleEntity) next).getModifier()).onPlaced(this);
        }
    }

    public void performDraw(@NotNull Canvas canvas) {
        p.k(canvas, "canvas");
        LayoutNodeWrapper wrapped$ui_release = getWrapped$ui_release();
        if (wrapped$ui_release != null) {
            wrapped$ui_release.draw(canvas);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: performingMeasure-K40F9xA, reason: not valid java name */
    public final Placeable m3267performingMeasureK40F9xA(long constraints, @NotNull sn.a<? extends Placeable> block) {
        p.k(block, "block");
        m3153setMeasurementConstraintsBRTryo0(constraints);
        Placeable placeableInvoke = block.invoke();
        OwnedLayer layer = getLayer();
        if (layer != null) {
            layer.mo3282resizeozmzZPI(getMeasuredSize());
        }
        return placeableInvoke;
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* JADX INFO: renamed from: placeAt-f8xVGno */
    public void mo3113placeAtf8xVGno(long position, float zIndex, @Nullable l<? super GraphicsLayerScope, r> layerBlock) {
        onLayerBlockUpdated(layerBlock);
        if (!IntOffset.m3943equalsimpl0(this.position, position)) {
            this.position = position;
            OwnedLayer ownedLayer = this.layer;
            if (ownedLayer != null) {
                ownedLayer.mo3281movegyyYBs(position);
            } else {
                LayoutNodeWrapper layoutNodeWrapper = this.wrappedBy;
                if (layoutNodeWrapper != null) {
                    layoutNodeWrapper.invalidateLayer();
                }
            }
            LayoutNodeWrapper wrapped$ui_release = getWrapped$ui_release();
            if (p.f(wrapped$ui_release != null ? wrapped$ui_release.layoutNode : null, this.layoutNode)) {
                LayoutNode parent$ui_release = this.layoutNode.getParent$ui_release();
                if (parent$ui_release != null) {
                    parent$ui_release.onAlignmentsChanged$ui_release();
                }
            } else {
                this.layoutNode.onAlignmentsChanged$ui_release();
            }
            Owner owner = this.layoutNode.getOwner();
            if (owner != null) {
                owner.onLayoutChange(this.layoutNode);
            }
        }
        this.zIndex = zIndex;
    }

    @Nullable
    public Object propagateRelocationRequest(@NotNull Rect rect, @NotNull c<? super r> cVar) {
        return propagateRelocationRequest$suspendImpl(this, rect, cVar);
    }

    public final void rectInParent$ui_release(@NotNull MutableRect bounds, boolean clipBounds, boolean clipToMinimumTouchTargetSize) {
        p.k(bounds, "bounds");
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            if (this.isClipping) {
                if (clipToMinimumTouchTargetSize) {
                    long jM3263getMinimumTouchTargetSizeNHjbRc = m3263getMinimumTouchTargetSizeNHjbRc();
                    float fM1452getWidthimpl = Size.m1452getWidthimpl(jM3263getMinimumTouchTargetSizeNHjbRc) / 2.0f;
                    float fM1449getHeightimpl = Size.m1449getHeightimpl(jM3263getMinimumTouchTargetSizeNHjbRc) / 2.0f;
                    bounds.intersect(-fM1452getWidthimpl, -fM1449getHeightimpl, IntSize.m3986getWidthimpl(mo3114getSizeYbymL2g()) + fM1452getWidthimpl, IntSize.m3985getHeightimpl(mo3114getSizeYbymL2g()) + fM1449getHeightimpl);
                } else if (clipBounds) {
                    bounds.intersect(0.0f, 0.0f, IntSize.m3986getWidthimpl(mo3114getSizeYbymL2g()), IntSize.m3985getHeightimpl(mo3114getSizeYbymL2g()));
                }
                if (bounds.isEmpty()) {
                    return;
                }
            }
            ownedLayer.mapBounds(bounds, false);
        }
        float fM3944getXimpl = IntOffset.m3944getXimpl(this.position);
        bounds.setLeft(bounds.getLeft() + fM3944getXimpl);
        bounds.setRight(bounds.getRight() + fM3944getXimpl);
        float fM3945getYimpl = IntOffset.m3945getYimpl(this.position);
        bounds.setTop(bounds.getTop() + fM3945getYimpl);
        bounds.setBottom(bounds.getBottom() + fM3945getYimpl);
    }

    public final void setMeasureResult$ui_release(@NotNull MeasureResult measureResult) {
        LayoutNode parent$ui_release;
        p.k(measureResult, "value");
        MeasureResult measureResult2 = this._measureResult;
        if (measureResult != measureResult2) {
            this._measureResult = measureResult;
            if (measureResult2 == null || measureResult.getWidth() != measureResult2.getWidth() || measureResult.getHeight() != measureResult2.getHeight()) {
                onMeasureResultChanged(measureResult.getWidth(), measureResult.getHeight());
            }
            Map<AlignmentLine, Integer> map = this.oldAlignmentLines;
            if ((!(map == null || map.isEmpty()) || (!measureResult.getAlignmentLines().isEmpty())) && !p.f(measureResult.getAlignmentLines(), this.oldAlignmentLines)) {
                LayoutNodeWrapper wrapped$ui_release = getWrapped$ui_release();
                if (p.f(wrapped$ui_release != null ? wrapped$ui_release.layoutNode : null, this.layoutNode)) {
                    LayoutNode parent$ui_release2 = this.layoutNode.getParent$ui_release();
                    if (parent$ui_release2 != null) {
                        parent$ui_release2.onAlignmentsChanged$ui_release();
                    }
                    if (this.layoutNode.getAlignmentLines().getUsedDuringParentMeasurement()) {
                        LayoutNode parent$ui_release3 = this.layoutNode.getParent$ui_release();
                        if (parent$ui_release3 != null) {
                            LayoutNode.requestRemeasure$ui_release$default(parent$ui_release3, false, 1, null);
                        }
                    } else if (this.layoutNode.getAlignmentLines().getUsedDuringParentLayout() && (parent$ui_release = this.layoutNode.getParent$ui_release()) != null) {
                        LayoutNode.requestRelayout$ui_release$default(parent$ui_release, false, 1, null);
                    }
                } else {
                    this.layoutNode.onAlignmentsChanged$ui_release();
                }
                this.layoutNode.getAlignmentLines().setDirty$ui_release(true);
                Map linkedHashMap = this.oldAlignmentLines;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                    this.oldAlignmentLines = linkedHashMap;
                }
                linkedHashMap.clear();
                linkedHashMap.putAll(measureResult.getAlignmentLines());
            }
        }
    }

    public final void setShallowPlacing(boolean z10) {
        this.isShallowPlacing = z10;
    }

    public final void setWrappedBy$ui_release(@Nullable LayoutNodeWrapper layoutNodeWrapper) {
        this.wrappedBy = layoutNodeWrapper;
    }

    public final void setZIndex(float f10) {
        this.zIndex = f10;
    }

    public final boolean shouldSharePointerInputWithSiblings() {
        PointerInputEntity pointerInputEntity = (PointerInputEntity) EntityList.m3214head0OSVbXo(this.entities, EntityList.INSTANCE.m3221getPointerInputEntityTypeEEbPh1w());
        if (pointerInputEntity != null && pointerInputEntity.shouldSharePointerInputWithSiblings()) {
            return true;
        }
        LayoutNodeWrapper wrapped$ui_release = getWrapped$ui_release();
        return wrapped$ui_release != null && wrapped$ui_release.shouldSharePointerInputWithSiblings();
    }

    /* JADX INFO: renamed from: toParentPosition-MK-Hz9U, reason: not valid java name */
    public long m3268toParentPositionMKHz9U(long position) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            position = ownedLayer.mo3280mapOffset8S9VItk(position, false);
        }
        return IntOffsetKt.m3958plusNvtHpc(position, this.position);
    }

    @NotNull
    public final Rect touchBoundsInRoot() {
        if (!isAttached()) {
            return Rect.INSTANCE.getZero();
        }
        LayoutCoordinates layoutCoordinatesFindRoot = LayoutCoordinatesKt.findRoot(this);
        MutableRect rectCache = getRectCache();
        long jM3259calculateMinimumTouchTargetPaddingE7KxVPU = m3259calculateMinimumTouchTargetPaddingE7KxVPU(m3263getMinimumTouchTargetSizeNHjbRc());
        rectCache.setLeft(-Size.m1452getWidthimpl(jM3259calculateMinimumTouchTargetPaddingE7KxVPU));
        rectCache.setTop(-Size.m1449getHeightimpl(jM3259calculateMinimumTouchTargetPaddingE7KxVPU));
        rectCache.setRight(getMeasuredWidth() + Size.m1452getWidthimpl(jM3259calculateMinimumTouchTargetPaddingE7KxVPU));
        rectCache.setBottom(getMeasuredHeight() + Size.m1449getHeightimpl(jM3259calculateMinimumTouchTargetPaddingE7KxVPU));
        LayoutNodeWrapper layoutNodeWrapper = this;
        while (layoutNodeWrapper != layoutCoordinatesFindRoot) {
            layoutNodeWrapper.rectInParent$ui_release(rectCache, false, true);
            if (rectCache.isEmpty()) {
                return Rect.INSTANCE.getZero();
            }
            layoutNodeWrapper = layoutNodeWrapper.wrappedBy;
            p.h(layoutNodeWrapper);
        }
        return MutableRectKt.toRect(rectCache);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: windowToLocal-MK-Hz9U */
    public long mo3118windowToLocalMKHz9U(long relativeToWindow) {
        if (!isAttached()) {
            throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
        }
        LayoutCoordinates layoutCoordinatesFindRoot = LayoutCoordinatesKt.findRoot(this);
        return mo3115localPositionOfR5De75A(layoutCoordinatesFindRoot, Offset.m1387minusMKHz9U(LayoutNodeKt.requireOwner(this.layoutNode).mo3284calculateLocalPositionMKHz9U(relativeToWindow), LayoutCoordinatesKt.positionInRoot(layoutCoordinatesFindRoot)));
    }

    public final void withPositionTranslation(@NotNull Canvas canvas, @NotNull l<? super Canvas, r> lVar) {
        p.k(canvas, "canvas");
        p.k(lVar, "block");
        float fM3944getXimpl = IntOffset.m3944getXimpl(getPosition());
        float fM3945getYimpl = IntOffset.m3945getYimpl(getPosition());
        canvas.translate(fM3944getXimpl, fM3945getYimpl);
        lVar.invoke(canvas);
        canvas.translate(-fM3944getXimpl, -fM3945getYimpl);
    }

    /* JADX INFO: renamed from: withinLayerBounds-k-4lQ0M, reason: not valid java name */
    public final boolean m3269withinLayerBoundsk4lQ0M(long pointerPosition) {
        if (!OffsetKt.m1400isFinitek4lQ0M(pointerPosition)) {
            return false;
        }
        OwnedLayer ownedLayer = this.layer;
        return ownedLayer == null || !this.isClipping || ownedLayer.mo3279isInLayerk4lQ0M(pointerPosition);
    }
}
