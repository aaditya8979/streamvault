package androidx.compose.runtime;

import androidx.compose.runtime.Composer;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import cn.f0;
import cn.p;
import cn.w;
import com.ironsource.G5;
import com.mgs.carparking.dbtable.VideoLookHistoryEntry;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import un.a;
import zn.n;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010(\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0000\u0018\u0000 ¦\u00012\u00020\u0001:\u0002¦\u0001B\u0011\u0012\u0006\u0010m\u001a\u00020l¢\u0006\u0006\b¤\u0001\u0010¥\u0001J,\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0002J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\bH\u0002J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\u0013\u001a\u00020\bH\u0002J\b\u0010\u0014\u001a\u00020\u0002H\u0002J \u0010\u0018\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H\u0002J\u0010\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0002H\u0002J\u0018\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0010\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u0002H\u0002J\u0018\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0018\u0010!\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0002H\u0002J \u0010\"\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u001a\u0010$\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u0002J\u0018\u0010'\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0002H\u0002J\u0018\u0010)\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002H\u0002J \u0010,\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002H\u0002J\u0018\u0010/\u001a\u00020\b*\u00060-j\u0002`.2\u0006\u0010\u0019\u001a\u00020\u0002H\u0002J\u0010\u00100\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002H\u0002J\u0010\u00102\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u0002H\u0002J\u0014\u0010\u0015\u001a\u00020\u0002*\u0002032\u0006\u0010\u0019\u001a\u00020\u0002H\u0002J\u0010\u00101\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002H\u0002J\u0014\u00101\u001a\u00020\u0002*\u0002032\u0006\u00104\u001a\u00020\u0002H\u0002J\u0014\u00105\u001a\u00020\u0002*\u0002032\u0006\u00104\u001a\u00020\u0002H\u0002J\u001c\u00106\u001a\u00020\b*\u0002032\u0006\u00104\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u0002H\u0002J\u0014\u00107\u001a\u00020\u0002*\u0002032\u0006\u00104\u001a\u00020\u0002H\u0002J\u0014\u00108\u001a\u00020\u0002*\u0002032\u0006\u00104\u001a\u00020\u0002H\u0002J\u0012\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000209*\u000203H\u0002J\u000e\u0010;\u001a\b\u0012\u0004\u0012\u00020\u000209H\u0002J(\u0010>\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00022\u0006\u0010<\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u0002H\u0002J \u0010@\u001a\u00020\u00022\u0006\u0010?\u001a\u00020\u00022\u0006\u0010<\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u0002H\u0002J\u0018\u0010A\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0002H\u0002J\u0010\u0010B\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0002J\u000e\u0010C\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002J\u000e\u0010D\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002J\u0010\u0010E\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0019\u001a\u00020\u0002J\u000e\u0010F\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002J\u0010\u0010G\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0019\u001a\u00020\u0002J\u000e\u0010H\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0002J\u000e\u0010I\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0002J\u0016\u0010J\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002J\u0010\u0010K\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0019\u001a\u00020\u0002J\u0010\u0010K\u001a\u0004\u0018\u00010\u00012\u0006\u0010?\u001a\u00020LJ\u000e\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002J\u000e\u0010\u0015\u001a\u00020\u00022\u0006\u0010?\u001a\u00020LJ\u0006\u0010M\u001a\u00020\bJ\u0006\u0010N\u001a\u00020\bJ\u0012\u0010O\u001a\u0004\u0018\u00010\u00012\b\u0010#\u001a\u0004\u0018\u00010\u0001J\u0010\u0010P\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\u0001J\u0010\u0010Q\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\u0001J\u0010\u0010R\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\u0001J\u0018\u0010R\u001a\u00020\b2\u0006\u0010?\u001a\u00020L2\b\u0010#\u001a\u0004\u0018\u00010\u0001J\u0010\u0010S\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\u0001J\u0010\u0010\u0010\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\u0001J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\u0001J\b\u0010T\u001a\u0004\u0018\u00010\u0001J\u0018\u0010U\u001a\u0004\u0018\u00010\u00012\u0006\u0010?\u001a\u00020L2\u0006\u0010\u0019\u001a\u00020\u0002J\u0018\u0010U\u001a\u0004\u0018\u00010\u00012\u0006\u0010V\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002J\u000e\u0010X\u001a\u00020\b2\u0006\u0010W\u001a\u00020\u0002J\u000e\u0010Y\u001a\u00020\b2\u0006\u0010?\u001a\u00020LJ\u0006\u0010Z\u001a\u00020\bJ\u0006\u0010[\u001a\u00020\bJ\u0006\u0010\\\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010]\u001a\u0004\u0018\u00010\u0001J\u0010\u0010^\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001J\u001a\u0010^\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010K\u001a\u0004\u0018\u00010\u0001J\"\u0010_\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001J\u0018\u0010_\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001J\u0006\u0010\u0016\u001a\u00020\u0002J\u000f\u0010b\u001a\u00020\bH\u0000¢\u0006\u0004\b`\u0010aJ\u000e\u0010c\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0002J\u000e\u0010c\u001a\u00020\b2\u0006\u0010?\u001a\u00020LJ\u0006\u0010d\u001a\u00020\u0002J\u0006\u0010e\u001a\u00020\u0005J\u000e\u0010g\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010fJ\u000e\u0010i\u001a\u00020\b2\u0006\u0010h\u001a\u00020\u0002J$\u0010k\u001a\b\u0012\u0004\u0012\u00020L092\u0006\u0010?\u001a\u00020L2\u0006\u0010h\u001a\u00020\u00022\u0006\u0010j\u001a\u00020\u0000J\u001c\u0010n\u001a\b\u0012\u0004\u0012\u00020L092\u0006\u0010m\u001a\u00020l2\u0006\u0010\u0019\u001a\u00020\u0002J\u000e\u0010o\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010p\u001a\u00020\b2\u0006\u00104\u001a\u00020\u00022\u0006\u0010W\u001a\u00020\u0002J$\u0010q\u001a\b\u0012\u0004\u0012\u00020L092\u0006\u0010h\u001a\u00020\u00022\u0006\u0010m\u001a\u00020l2\u0006\u0010\u0019\u001a\u00020\u0002J\u0010\u0010?\u001a\u00020L2\b\b\u0002\u0010\u0019\u001a\u00020\u0002J\u0010\u0010r\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0002J\u000e\u0010s\u001a\u00020\u00022\u0006\u0010?\u001a\u00020LJ\b\u0010u\u001a\u00020tH\u0016J\u0006\u0010v\u001a\u00020tJ\u000f\u0010x\u001a\u00020\bH\u0000¢\u0006\u0004\bw\u0010aJ\u000f\u0010z\u001a\u00020\bH\u0000¢\u0006\u0004\by\u0010aR\u001a\u0010m\u001a\u00020l8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bm\u0010{\u001a\u0004\b|\u0010}R\u0016\u0010~\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\"\u0010\u0081\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0080\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R+\u0010\u0085\u0001\u001a\u0014\u0012\u0004\u0012\u00020L0\u0083\u0001j\t\u0012\u0004\u0012\u00020L`\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0019\u0010\u0087\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0019\u0010\u0089\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u0088\u0001R\u0019\u0010\u008a\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u0088\u0001R\u0019\u0010\u008b\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u0088\u0001R\u0019\u0010\u008c\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u0088\u0001R\u0019\u0010\u008d\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u0088\u0001R\u0019\u0010\u008e\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u0088\u0001R\u0019\u0010\u008f\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0088\u0001R\u0019\u0010\u0090\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0088\u0001R\u0017\u0010C\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bC\u0010\u0088\u0001R\u0018\u0010\u0092\u0001\u001a\u00030\u0091\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0018\u0010\u0094\u0001\u001a\u00030\u0091\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0093\u0001R\u0018\u0010\u0095\u0001\u001a\u00030\u0091\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0093\u0001R*\u0010\u0097\u0001\u001a\u00020\u00022\u0007\u0010\u0096\u0001\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0097\u0001\u0010\u0088\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R(\u0010\u0015\u001a\u00020\u00022\u0007\u0010\u0096\u0001\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b\u0015\u0010\u0088\u0001\u001a\u0006\b\u009a\u0001\u0010\u0099\u0001R*\u0010\u009b\u0001\u001a\u00020\u00052\u0007\u0010\u0096\u0001\u001a\u00020\u00058\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R\u001b\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u0016\u0010=\u001a\u00020\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\b¡\u0001\u0010\u0099\u0001R\u0014\u0010¢\u0001\u001a\u00020\u00058F¢\u0006\b\u001a\u0006\b¢\u0001\u0010\u009e\u0001R\u0012\u0010\u0006\u001a\u00020\u00058F¢\u0006\u0007\u001a\u0005\b\u0006\u0010\u009e\u0001R\u0016\u0010\u001c\u001a\u00020\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b£\u0001\u0010\u0099\u0001¨\u0006§\u0001"}, d2 = {"Landroidx/compose/runtime/SlotWriter;", "", "", "key", "objectKey", "", "isNode", "aux", "Lbn/r;", "startGroup", "group", "containsGroupMark", "containsAnyGroupMarks", "recalculateMarks", "updateContainsMark", "Landroidx/compose/runtime/PrioritySet;", "set", "updateContainsMarkNow", "childContainsAnyMarks", "saveCurrentGroupEnd", "restoreCurrentGroupEnd", "parent", "endGroup", "firstChild", "fixParentAnchorsFor", "index", "moveGroupGapTo", "moveSlotGapTo", "size", "insertGroups", "insertSlots", "start", "len", "removeGroups", "removeSlots", "value", "updateNodeOfGroup", "previousGapStart", "newGapStart", "updateAnchors", "gapStart", "removeAnchors", "originalLocation", "newLocation", "moveAnchors", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "groupAsString", "groupIndexToAddress", "dataIndex", "dataIndexToDataAddress", "", "address", "slotIndex", "updateDataIndex", "nodeIndex", "auxIndex", "", "dataIndexes", "keys", "gapLen", "capacity", "dataIndexToDataAnchor", "anchor", "dataAnchorToDataIndex", "parentIndexToAnchor", "parentAnchorToIndex", "nodeCount", "groupKey", "groupObjectKey", "groupSize", "groupAux", "indexInParent", "indexInCurrentGroup", "indexInGroup", "node", "Landroidx/compose/runtime/Anchor;", "close", "reset", "update", "updateAux", "insertAux", "updateNode", "updateParentNode", "skip", "slot", "groupIndex", "amount", "advanceBy", "seek", "skipToGroupEnd", "beginInsert", "endInsert", "dataKey", "startNode", "startData", "bashGroup$runtime_release", "()V", "bashGroup", "ensureStarted", "skipGroup", "removeGroup", "", "groupSlots", TypedValues.CycleType.S_WAVE_OFFSET, "moveGroup", "writer", "moveTo", "Landroidx/compose/runtime/SlotTable;", G5.Q, "moveFrom", "insertParentGroup", "addToGroupSizeAlongSpine", "moveIntoGroupFrom", "markGroup", "anchorIndex", "", "toString", "groupsAsString", "verifyDataAnchors$runtime_release", "verifyDataAnchors", "verifyParentAnchors$runtime_release", "verifyParentAnchors", "Landroidx/compose/runtime/SlotTable;", "getTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "groups", "[I", "", "slots", "[Ljava/lang/Object;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "anchors", "Ljava/util/ArrayList;", "groupGapStart", "I", "groupGapLen", "currentGroupEnd", "currentSlot", "currentSlotEnd", "slotsGapStart", "slotsGapLen", "slotsGapOwner", "insertCount", "Landroidx/compose/runtime/IntStack;", "startStack", "Landroidx/compose/runtime/IntStack;", "endStack", "nodeCountStack", "<set-?>", "currentGroup", "getCurrentGroup", "()I", "getParent", "closed", "Z", "getClosed", "()Z", "pendingRecalculateMarks", "Landroidx/compose/runtime/PrioritySet;", "getCapacity", "isGroupEnd", "getSize$runtime_release", "<init>", "(Landroidx/compose/runtime/SlotTable;)V", VastTagName.COMPANION, "runtime_release"}, k = 1, mv = {1, 6, 0})
public final class SlotWriter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private ArrayList<Anchor> anchors;
    private boolean closed;
    private int currentGroup;
    private int currentGroupEnd;
    private int currentSlot;
    private int currentSlotEnd;

    @NotNull
    private final IntStack endStack;
    private int groupGapLen;
    private int groupGapStart;

    @NotNull
    private int[] groups;
    private int insertCount;
    private int nodeCount;

    @NotNull
    private final IntStack nodeCountStack;
    private int parent;

    @Nullable
    private PrioritySet pendingRecalculateMarks;

    @NotNull
    private Object[] slots;
    private int slotsGapLen;
    private int slotsGapOwner;
    private int slotsGapStart;

    @NotNull
    private final IntStack startStack;

    @NotNull
    private final SlotTable table;

    /* JADX INFO: compiled from: SlotTable.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002¨\u0006\u000e"}, d2 = {"Landroidx/compose/runtime/SlotWriter$Companion;", "", "()V", "moveGroup", "", "Landroidx/compose/runtime/Anchor;", "fromWriter", "Landroidx/compose/runtime/SlotWriter;", "fromIndex", "", "toWriter", "updateFromCursor", "", "updateToCursor", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<Anchor> moveGroup(SlotWriter fromWriter, int fromIndex, SlotWriter toWriter, boolean updateFromCursor, boolean updateToCursor) {
            List<Anchor> listM;
            boolean zRemoveGroup;
            int i10;
            int iGroupSize = fromWriter.groupSize(fromIndex);
            int i11 = fromIndex + iGroupSize;
            int iDataIndex = fromWriter.dataIndex(fromIndex);
            int iDataIndex2 = fromWriter.dataIndex(i11);
            int i12 = iDataIndex2 - iDataIndex;
            boolean zContainsAnyGroupMarks = fromWriter.containsAnyGroupMarks(fromIndex);
            toWriter.insertGroups(iGroupSize);
            toWriter.insertSlots(i12, toWriter.getCurrentGroup());
            if (fromWriter.groupGapStart < i11) {
                fromWriter.moveGroupGapTo(i11);
            }
            if (fromWriter.slotsGapStart < iDataIndex2) {
                fromWriter.moveSlotGapTo(iDataIndex2, i11);
            }
            int[] iArr = toWriter.groups;
            int currentGroup = toWriter.getCurrentGroup();
            p.j(fromWriter.groups, iArr, currentGroup * 5, fromIndex * 5, i11 * 5);
            Object[] objArr = toWriter.slots;
            int i13 = toWriter.currentSlot;
            p.l(fromWriter.slots, objArr, i13, iDataIndex, iDataIndex2);
            int parent = toWriter.getParent();
            SlotTableKt.updateParentAnchor(iArr, currentGroup, parent);
            int i14 = currentGroup - fromIndex;
            int i15 = currentGroup + iGroupSize;
            int iDataIndex3 = i13 - toWriter.dataIndex(iArr, currentGroup);
            int i16 = toWriter.slotsGapOwner;
            int i17 = toWriter.slotsGapLen;
            int length = objArr.length;
            int i18 = i16;
            int i19 = currentGroup;
            while (true) {
                if (i19 >= i15) {
                    break;
                }
                if (i19 != currentGroup) {
                    i10 = i15;
                    SlotTableKt.updateParentAnchor(iArr, i19, SlotTableKt.parentAnchor(iArr, i19) + i14);
                } else {
                    i10 = i15;
                }
                int i20 = iDataIndex3;
                SlotTableKt.updateDataAnchor(iArr, i19, toWriter.dataIndexToDataAnchor(toWriter.dataIndex(iArr, i19) + iDataIndex3, i18 >= i19 ? toWriter.slotsGapStart : 0, i17, length));
                if (i19 == i18) {
                    i18++;
                }
                i19++;
                iDataIndex3 = i20;
                i15 = i10;
            }
            int i21 = i15;
            toWriter.slotsGapOwner = i18;
            int iLocationOf = SlotTableKt.locationOf(fromWriter.anchors, fromIndex, fromWriter.getSize$runtime_release());
            int iLocationOf2 = SlotTableKt.locationOf(fromWriter.anchors, i11, fromWriter.getSize$runtime_release());
            if (iLocationOf < iLocationOf2) {
                ArrayList arrayList = fromWriter.anchors;
                ArrayList arrayList2 = new ArrayList(iLocationOf2 - iLocationOf);
                for (int i22 = iLocationOf; i22 < iLocationOf2; i22++) {
                    Object obj = arrayList.get(i22);
                    tn.p.j(obj, "sourceAnchors[anchorIndex]");
                    Anchor anchor = (Anchor) obj;
                    anchor.setLocation$runtime_release(anchor.getLocation() + i14);
                    arrayList2.add(anchor);
                }
                toWriter.anchors.addAll(SlotTableKt.locationOf(toWriter.anchors, toWriter.getCurrentGroup(), toWriter.getSize$runtime_release()), arrayList2);
                arrayList.subList(iLocationOf, iLocationOf2).clear();
                listM = arrayList2;
            } else {
                listM = w.m();
            }
            int iParent = fromWriter.parent(fromIndex);
            if (updateFromCursor) {
                int i23 = iParent >= 0 ? 1 : 0;
                if (i23 != 0) {
                    fromWriter.startGroup();
                    fromWriter.advanceBy(iParent - fromWriter.getCurrentGroup());
                    fromWriter.startGroup();
                }
                fromWriter.advanceBy(fromIndex - fromWriter.getCurrentGroup());
                zRemoveGroup = fromWriter.removeGroup();
                if (i23 != 0) {
                    fromWriter.skipToGroupEnd();
                    fromWriter.endGroup();
                    fromWriter.skipToGroupEnd();
                    fromWriter.endGroup();
                }
            } else {
                boolean zRemoveGroups = fromWriter.removeGroups(fromIndex, iGroupSize);
                fromWriter.removeSlots(iDataIndex, i12, fromIndex - 1);
                zRemoveGroup = zRemoveGroups;
            }
            if (!(!zRemoveGroup)) {
                ComposerKt.composeRuntimeError("Unexpectedly removed anchors".toString());
                throw new KotlinNothingValueException();
            }
            toWriter.nodeCount += SlotTableKt.isNode(iArr, currentGroup) ? 1 : SlotTableKt.nodeCount(iArr, currentGroup);
            if (updateToCursor) {
                toWriter.currentGroup = i21;
                toWriter.currentSlot = i13 + i12;
            }
            if (zContainsAnyGroupMarks) {
                toWriter.updateContainsMark(parent);
            }
            return listM;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.SlotWriter$groupSlots$1, reason: invalid class name */
    /* JADX INFO: compiled from: SlotTable.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0010(\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\t\u0010\t\u001a\u00020\nH\u0096\u0002J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"androidx/compose/runtime/SlotWriter$groupSlots$1", "", "", VideoLookHistoryEntry.CURRNET, "", "getCurrent", "()I", "setCurrent", "(I)V", "hasNext", "", "next", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class AnonymousClass1 implements Iterator<Object>, a {
        public final /* synthetic */ int $end;
        private int current;
        public final /* synthetic */ SlotWriter this$0;

        public AnonymousClass1(int i10, int i11, SlotWriter slotWriter) {
            this.$end = i11;
            this.this$0 = slotWriter;
            this.current = i10;
        }

        public final int getCurrent() {
            return this.current;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.current < this.$end;
        }

        @Override // java.util.Iterator
        @Nullable
        public Object next() {
            if (!hasNext()) {
                return null;
            }
            Object[] objArr = this.this$0.slots;
            SlotWriter slotWriter = this.this$0;
            int i10 = this.current;
            this.current = i10 + 1;
            return objArr[slotWriter.dataIndexToDataAddress(i10)];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setCurrent(int i10) {
            this.current = i10;
        }
    }

    public SlotWriter(@NotNull SlotTable slotTable) {
        tn.p.k(slotTable, G5.Q);
        this.table = slotTable;
        this.groups = slotTable.getGroups();
        this.slots = slotTable.getSlots();
        this.anchors = slotTable.getAnchors$runtime_release();
        this.groupGapStart = slotTable.getGroupsSize();
        this.groupGapLen = (this.groups.length / 5) - slotTable.getGroupsSize();
        this.currentGroupEnd = slotTable.getGroupsSize();
        this.slotsGapStart = slotTable.getSlotsSize();
        this.slotsGapLen = this.slots.length - slotTable.getSlotsSize();
        this.slotsGapOwner = slotTable.getGroupsSize();
        this.startStack = new IntStack();
        this.endStack = new IntStack();
        this.nodeCountStack = new IntStack();
        this.parent = -1;
    }

    public static /* synthetic */ Anchor anchor$default(SlotWriter slotWriter, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = slotWriter.currentGroup;
        }
        return slotWriter.anchor(i10);
    }

    private final int auxIndex(int[] iArr, int i10) {
        return dataIndex(iArr, i10) + SlotTableKt.countOneBits(SlotTableKt.groupInfo(iArr, i10) >> 29);
    }

    private final boolean childContainsAnyMarks(int group) {
        int iGroupSize = group + 1;
        int iGroupSize2 = group + groupSize(group);
        while (iGroupSize < iGroupSize2) {
            if (SlotTableKt.containsAnyMark(this.groups, groupIndexToAddress(iGroupSize))) {
                return true;
            }
            iGroupSize += groupSize(iGroupSize);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean containsAnyGroupMarks(int group) {
        return group >= 0 && SlotTableKt.containsAnyMark(this.groups, groupIndexToAddress(group));
    }

    private final boolean containsGroupMark(int group) {
        return group >= 0 && SlotTableKt.containsMark(this.groups, groupIndexToAddress(group));
    }

    private final int dataAnchorToDataIndex(int anchor, int gapLen, int capacity) {
        return anchor < 0 ? (capacity - gapLen) + anchor + 1 : anchor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndex(int index) {
        return dataIndex(this.groups, groupIndexToAddress(index));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndex(int[] iArr, int i10) {
        return i10 >= getCapacity() ? this.slots.length - this.slotsGapLen : dataAnchorToDataIndex(SlotTableKt.dataAnchor(iArr, i10), this.slotsGapLen, this.slots.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndexToDataAddress(int dataIndex) {
        return dataIndex < this.slotsGapStart ? dataIndex : dataIndex + this.slotsGapLen;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndexToDataAnchor(int index, int gapStart, int gapLen, int capacity) {
        return index > gapStart ? -(((capacity - gapLen) - index) + 1) : index;
    }

    private final List<Integer> dataIndexes(int[] iArr) {
        List listDataAnchors$default = SlotTableKt.dataAnchors$default(this.groups, 0, 1, null);
        List listO0 = f0.O0(f0.V0(listDataAnchors$default, n.v(0, this.groupGapStart)), f0.V0(listDataAnchors$default, n.v(this.groupGapStart + this.groupGapLen, iArr.length / 5)));
        ArrayList arrayList = new ArrayList(listO0.size());
        int size = listO0.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(Integer.valueOf(dataAnchorToDataIndex(((Number) listO0.get(i10)).intValue(), this.slotsGapLen, this.slots.length)));
        }
        return arrayList;
    }

    private final void fixParentAnchorsFor(int i10, int i11, int i12) {
        int iParentIndexToAnchor = parentIndexToAnchor(i10, this.groupGapStart);
        while (i12 < i11) {
            SlotTableKt.updateParentAnchor(this.groups, groupIndexToAddress(i12), iParentIndexToAnchor);
            int iGroupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress(i12)) + i12;
            fixParentAnchorsFor(i12, iGroupSize, i12 + 1);
            i12 = iGroupSize;
        }
    }

    private final int getCapacity() {
        return this.groups.length / 5;
    }

    private final void groupAsString(StringBuilder sb2, int i10) {
        int iGroupIndexToAddress = groupIndexToAddress(i10);
        sb2.append("Group(");
        if (i10 < 10) {
            sb2.append(' ');
        }
        if (i10 < 100) {
            sb2.append(' ');
        }
        if (i10 < 1000) {
            sb2.append(' ');
        }
        sb2.append(i10);
        if (iGroupIndexToAddress != i10) {
            sb2.append("(");
            sb2.append(iGroupIndexToAddress);
            sb2.append(")");
        }
        sb2.append('#');
        sb2.append(SlotTableKt.groupSize(this.groups, iGroupIndexToAddress));
        boolean zGroupAsString$isStarted = groupAsString$isStarted(this, i10);
        if (zGroupAsString$isStarted) {
            sb2.append('?');
        }
        sb2.append('^');
        sb2.append(parentAnchorToIndex(SlotTableKt.parentAnchor(this.groups, iGroupIndexToAddress)));
        sb2.append(": key=");
        sb2.append(SlotTableKt.key(this.groups, iGroupIndexToAddress));
        sb2.append(", nodes=");
        sb2.append(SlotTableKt.nodeCount(this.groups, iGroupIndexToAddress));
        if (zGroupAsString$isStarted) {
            sb2.append('?');
        }
        sb2.append(", dataAnchor=");
        sb2.append(SlotTableKt.dataAnchor(this.groups, iGroupIndexToAddress));
        sb2.append(", parentAnchor=");
        sb2.append(SlotTableKt.parentAnchor(this.groups, iGroupIndexToAddress));
        if (SlotTableKt.isNode(this.groups, iGroupIndexToAddress)) {
            sb2.append(", node=" + this.slots[dataIndexToDataAddress(nodeIndex(this.groups, iGroupIndexToAddress))]);
        }
        int iSlotIndex = slotIndex(this.groups, iGroupIndexToAddress);
        int iDataIndex = dataIndex(this.groups, iGroupIndexToAddress + 1);
        if (iDataIndex > iSlotIndex) {
            sb2.append(", [");
            for (int i11 = iSlotIndex; i11 < iDataIndex; i11++) {
                if (i11 != iSlotIndex) {
                    sb2.append(", ");
                }
                sb2.append(String.valueOf(this.slots[dataIndexToDataAddress(i11)]));
            }
            sb2.append(']');
        }
        sb2.append(")");
    }

    private static final boolean groupAsString$isStarted(SlotWriter slotWriter, int i10) {
        return i10 < slotWriter.currentGroup && (i10 == slotWriter.parent || slotWriter.startStack.indexOf(i10) >= 0 || groupAsString$isStarted(slotWriter, slotWriter.parent(i10)));
    }

    private final int groupIndexToAddress(int index) {
        return index < this.groupGapStart ? index : index + this.groupGapLen;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void insertGroups(int i10) {
        if (i10 > 0) {
            int i11 = this.currentGroup;
            moveGroupGapTo(i11);
            int i12 = this.groupGapStart;
            int i13 = this.groupGapLen;
            int[] iArr = this.groups;
            int length = iArr.length / 5;
            int i14 = length - i13;
            if (i13 < i10) {
                int iMax = Math.max(Math.max(length * 2, i14 + i10), 32);
                int[] iArr2 = new int[iMax * 5];
                int i15 = iMax - i14;
                p.j(iArr, iArr2, 0, 0, i12 * 5);
                p.j(iArr, iArr2, (i12 + i15) * 5, (i13 + i12) * 5, length * 5);
                this.groups = iArr2;
                i13 = i15;
            }
            int i16 = this.currentGroupEnd;
            if (i16 >= i12) {
                this.currentGroupEnd = i16 + i10;
            }
            int i17 = i12 + i10;
            this.groupGapStart = i17;
            this.groupGapLen = i13 - i10;
            int iDataIndexToDataAnchor = dataIndexToDataAnchor(i14 > 0 ? dataIndex(i11 + i10) : 0, this.slotsGapOwner >= i12 ? this.slotsGapStart : 0, this.slotsGapLen, this.slots.length);
            for (int i18 = i12; i18 < i17; i18++) {
                SlotTableKt.updateDataAnchor(this.groups, i18, iDataIndexToDataAnchor);
            }
            int i19 = this.slotsGapOwner;
            if (i19 >= i12) {
                this.slotsGapOwner = i19 + i10;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void insertSlots(int i10, int i11) {
        if (i10 > 0) {
            moveSlotGapTo(this.currentSlot, i11);
            int i12 = this.slotsGapStart;
            int i13 = this.slotsGapLen;
            if (i13 < i10) {
                Object[] objArr = this.slots;
                int length = objArr.length;
                int i14 = length - i13;
                int iMax = Math.max(Math.max(length * 2, i14 + i10), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i15 = 0; i15 < iMax; i15++) {
                    objArr2[i15] = null;
                }
                int i16 = iMax - i14;
                p.l(objArr, objArr2, 0, 0, i12);
                p.l(objArr, objArr2, i12 + i16, i13 + i12, length);
                this.slots = objArr2;
                i13 = i16;
            }
            int i17 = this.currentSlotEnd;
            if (i17 >= i12) {
                this.currentSlotEnd = i17 + i10;
            }
            this.slotsGapStart = i12 + i10;
            this.slotsGapLen = i13 - i10;
        }
    }

    private final List<Integer> keys() {
        List listKeys$default = SlotTableKt.keys$default(this.groups, 0, 1, null);
        ArrayList arrayList = new ArrayList(listKeys$default.size());
        int size = listKeys$default.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = listKeys$default.get(i10);
            ((Number) obj).intValue();
            int i11 = this.groupGapStart;
            if (i10 < i11 || i10 >= i11 + this.groupGapLen) {
                arrayList.add(obj);
            }
            i10++;
        }
        return arrayList;
    }

    public static /* synthetic */ void markGroup$default(SlotWriter slotWriter, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = slotWriter.parent;
        }
        slotWriter.markGroup(i10);
    }

    private final void moveAnchors(int i10, int i11, int i12) {
        int i13 = i12 + i10;
        int size$runtime_release = getSize$runtime_release();
        int iLocationOf = SlotTableKt.locationOf(this.anchors, i10, size$runtime_release);
        ArrayList arrayList = new ArrayList();
        if (iLocationOf >= 0) {
            while (iLocationOf < this.anchors.size()) {
                Anchor anchor = this.anchors.get(iLocationOf);
                tn.p.j(anchor, "anchors[index]");
                Anchor anchor2 = anchor;
                int iAnchorIndex = anchorIndex(anchor2);
                if (iAnchorIndex < i10 || iAnchorIndex >= i13) {
                    break;
                }
                arrayList.add(anchor2);
                this.anchors.remove(iLocationOf);
            }
        }
        int i14 = i11 - i10;
        int size = arrayList.size();
        for (int i15 = 0; i15 < size; i15++) {
            Anchor anchor3 = (Anchor) arrayList.get(i15);
            int iAnchorIndex2 = anchorIndex(anchor3) + i14;
            if (iAnchorIndex2 >= this.groupGapStart) {
                anchor3.setLocation$runtime_release(-(size$runtime_release - iAnchorIndex2));
            } else {
                anchor3.setLocation$runtime_release(iAnchorIndex2);
            }
            this.anchors.add(SlotTableKt.locationOf(this.anchors, iAnchorIndex2, size$runtime_release), anchor3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveGroupGapTo(int i10) {
        int i11 = this.groupGapLen;
        int i12 = this.groupGapStart;
        if (i12 != i10) {
            if (!this.anchors.isEmpty()) {
                updateAnchors(i12, i10);
            }
            if (i11 > 0) {
                int[] iArr = this.groups;
                int i13 = i10 * 5;
                int i14 = i11 * 5;
                int i15 = i12 * 5;
                if (i10 < i12) {
                    p.j(iArr, iArr, i14 + i13, i13, i15);
                } else {
                    p.j(iArr, iArr, i15, i15 + i14, i13 + i14);
                }
            }
            if (i10 < i12) {
                i12 = i10 + i11;
            }
            int capacity = getCapacity();
            ComposerKt.runtimeCheck(i12 < capacity);
            while (i12 < capacity) {
                int iParentAnchor = SlotTableKt.parentAnchor(this.groups, i12);
                int iParentIndexToAnchor = parentIndexToAnchor(parentAnchorToIndex(iParentAnchor), i10);
                if (iParentIndexToAnchor != iParentAnchor) {
                    SlotTableKt.updateParentAnchor(this.groups, i12, iParentIndexToAnchor);
                }
                i12++;
                if (i12 == i10) {
                    i12 += i11;
                }
            }
        }
        this.groupGapStart = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveSlotGapTo(int i10, int i11) {
        int i12 = this.slotsGapLen;
        int i13 = this.slotsGapStart;
        int i14 = this.slotsGapOwner;
        if (i13 != i10) {
            Object[] objArr = this.slots;
            if (i10 < i13) {
                p.l(objArr, objArr, i10 + i12, i10, i13);
            } else {
                p.l(objArr, objArr, i13, i13 + i12, i10 + i12);
            }
            p.v(objArr, null, i10, i10 + i12);
        }
        int iMin = Math.min(i11 + 1, getSize$runtime_release());
        if (i14 != iMin) {
            int length = this.slots.length - i12;
            if (iMin < i14) {
                int iGroupIndexToAddress = groupIndexToAddress(iMin);
                int iGroupIndexToAddress2 = groupIndexToAddress(i14);
                int i15 = this.groupGapStart;
                while (iGroupIndexToAddress < iGroupIndexToAddress2) {
                    int iDataAnchor = SlotTableKt.dataAnchor(this.groups, iGroupIndexToAddress);
                    if (!(iDataAnchor >= 0)) {
                        ComposerKt.composeRuntimeError("Unexpected anchor value, expected a positive anchor".toString());
                        throw new KotlinNothingValueException();
                    }
                    SlotTableKt.updateDataAnchor(this.groups, iGroupIndexToAddress, -((length - iDataAnchor) + 1));
                    iGroupIndexToAddress++;
                    if (iGroupIndexToAddress == i15) {
                        iGroupIndexToAddress += this.groupGapLen;
                    }
                }
            } else {
                int iGroupIndexToAddress3 = groupIndexToAddress(i14);
                int iGroupIndexToAddress4 = groupIndexToAddress(iMin);
                while (iGroupIndexToAddress3 < iGroupIndexToAddress4) {
                    int iDataAnchor2 = SlotTableKt.dataAnchor(this.groups, iGroupIndexToAddress3);
                    if (!(iDataAnchor2 < 0)) {
                        ComposerKt.composeRuntimeError("Unexpected anchor value, expected a negative anchor".toString());
                        throw new KotlinNothingValueException();
                    }
                    SlotTableKt.updateDataAnchor(this.groups, iGroupIndexToAddress3, iDataAnchor2 + length + 1);
                    iGroupIndexToAddress3++;
                    if (iGroupIndexToAddress3 == this.groupGapStart) {
                        iGroupIndexToAddress3 += this.groupGapLen;
                    }
                }
            }
            this.slotsGapOwner = iMin;
        }
        this.slotsGapStart = i10;
    }

    private final int nodeIndex(int[] iArr, int i10) {
        return dataIndex(iArr, i10);
    }

    private final int parent(int[] iArr, int i10) {
        return parentAnchorToIndex(SlotTableKt.parentAnchor(iArr, groupIndexToAddress(i10)));
    }

    private final int parentAnchorToIndex(int index) {
        return index > -2 ? index : getSize$runtime_release() + index + 2;
    }

    private final int parentIndexToAnchor(int index, int gapStart) {
        return index < gapStart ? index : -((getSize$runtime_release() - index) + 2);
    }

    private final void recalculateMarks() {
        PrioritySet prioritySet = this.pendingRecalculateMarks;
        if (prioritySet != null) {
            while (prioritySet.isNotEmpty()) {
                updateContainsMarkNow(prioritySet.takeMax(), prioritySet);
            }
        }
    }

    private final boolean removeAnchors(int gapStart, int size) {
        int i10 = size + gapStart;
        int iLocationOf = SlotTableKt.locationOf(this.anchors, i10, getCapacity() - this.groupGapLen);
        if (iLocationOf >= this.anchors.size()) {
            iLocationOf--;
        }
        int i11 = iLocationOf + 1;
        int i12 = 0;
        while (iLocationOf >= 0) {
            Anchor anchor = this.anchors.get(iLocationOf);
            tn.p.j(anchor, "anchors[index]");
            Anchor anchor2 = anchor;
            int iAnchorIndex = anchorIndex(anchor2);
            if (iAnchorIndex < gapStart) {
                break;
            }
            if (iAnchorIndex < i10) {
                anchor2.setLocation$runtime_release(Integer.MIN_VALUE);
                if (i12 == 0) {
                    i12 = iLocationOf + 1;
                }
                i11 = iLocationOf;
            }
            iLocationOf--;
        }
        boolean z10 = i11 < i12;
        if (z10) {
            this.anchors.subList(i11, i12).clear();
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean removeGroups(int start, int len) {
        if (len > 0) {
            ArrayList<Anchor> arrayList = this.anchors;
            moveGroupGapTo(start);
            zRemoveAnchors = arrayList.isEmpty() ^ true ? removeAnchors(start, len) : false;
            this.groupGapStart = start;
            this.groupGapLen += len;
            int i10 = this.slotsGapOwner;
            if (i10 > start) {
                this.slotsGapOwner = Math.max(start, i10 - len);
            }
            int i11 = this.currentGroupEnd;
            if (i11 >= this.groupGapStart) {
                this.currentGroupEnd = i11 - len;
            }
            if (containsGroupMark(this.parent)) {
                updateContainsMark(this.parent);
            }
        }
        return zRemoveAnchors;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeSlots(int i10, int i11, int i12) {
        if (i11 > 0) {
            int i13 = this.slotsGapLen;
            int i14 = i10 + i11;
            moveSlotGapTo(i14, i12);
            this.slotsGapStart = i10;
            this.slotsGapLen = i13 + i11;
            p.v(this.slots, null, i10, i14);
            int i15 = this.currentSlotEnd;
            if (i15 >= i10) {
                this.currentSlotEnd = i15 - i11;
            }
        }
    }

    private final int restoreCurrentGroupEnd() {
        int capacity = (getCapacity() - this.groupGapLen) - this.endStack.pop();
        this.currentGroupEnd = capacity;
        return capacity;
    }

    private final void saveCurrentGroupEnd() {
        this.endStack.push((getCapacity() - this.groupGapLen) - this.currentGroupEnd);
    }

    private final int slotIndex(int[] iArr, int i10) {
        return i10 >= getCapacity() ? this.slots.length - this.slotsGapLen : dataAnchorToDataIndex(SlotTableKt.slotAnchor(iArr, i10), this.slotsGapLen, this.slots.length);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void startGroup(int i10, Object obj, boolean z10, Object obj2) {
        int iGroupSize;
        Object[] objArr = this.insertCount > 0;
        this.nodeCountStack.push(this.nodeCount);
        if (objArr == true) {
            insertGroups(1);
            int i11 = this.currentGroup;
            int iGroupIndexToAddress = groupIndexToAddress(i11);
            Composer.Companion companion = Composer.INSTANCE;
            int i12 = obj != companion.getEmpty() ? 1 : 0;
            int i13 = (z10 || obj2 == companion.getEmpty()) ? 0 : 1;
            SlotTableKt.initGroup(this.groups, iGroupIndexToAddress, i10, z10, i12, i13, this.parent, this.currentSlot);
            this.currentSlotEnd = this.currentSlot;
            int i14 = (z10 ? 1 : 0) + i12 + i13;
            if (i14 > 0) {
                insertSlots(i14, i11);
                Object[] objArr2 = this.slots;
                int i15 = this.currentSlot;
                if (z10) {
                    objArr2[i15] = obj2;
                    i15++;
                }
                if (i12 != 0) {
                    objArr2[i15] = obj;
                    i15++;
                }
                if (i13 != 0) {
                    objArr2[i15] = obj2;
                    i15++;
                }
                this.currentSlot = i15;
            }
            this.nodeCount = 0;
            iGroupSize = i11 + 1;
            this.parent = i11;
            this.currentGroup = iGroupSize;
        } else {
            this.startStack.push(this.parent);
            saveCurrentGroupEnd();
            int i16 = this.currentGroup;
            int iGroupIndexToAddress2 = groupIndexToAddress(i16);
            if (!tn.p.f(obj2, Composer.INSTANCE.getEmpty())) {
                if (z10) {
                    updateNode(obj2);
                } else {
                    updateAux(obj2);
                }
            }
            this.currentSlot = slotIndex(this.groups, iGroupIndexToAddress2);
            this.currentSlotEnd = dataIndex(this.groups, groupIndexToAddress(this.currentGroup + 1));
            this.nodeCount = SlotTableKt.nodeCount(this.groups, iGroupIndexToAddress2);
            this.parent = i16;
            this.currentGroup = i16 + 1;
            iGroupSize = i16 + SlotTableKt.groupSize(this.groups, iGroupIndexToAddress2);
        }
        this.currentGroupEnd = iGroupSize;
    }

    private final void updateAnchors(int i10, int i11) {
        int i12;
        int capacity = getCapacity() - this.groupGapLen;
        if (i10 >= i11) {
            for (int iLocationOf = SlotTableKt.locationOf(this.anchors, i11, capacity); iLocationOf < this.anchors.size(); iLocationOf++) {
                Anchor anchor = this.anchors.get(iLocationOf);
                tn.p.j(anchor, "anchors[index]");
                Anchor anchor2 = anchor;
                int location = anchor2.getLocation();
                if (location < 0) {
                    return;
                }
                anchor2.setLocation$runtime_release(-(capacity - location));
            }
            return;
        }
        for (int iLocationOf2 = SlotTableKt.locationOf(this.anchors, i10, capacity); iLocationOf2 < this.anchors.size(); iLocationOf2++) {
            Anchor anchor3 = this.anchors.get(iLocationOf2);
            tn.p.j(anchor3, "anchors[index]");
            Anchor anchor4 = anchor3;
            int location2 = anchor4.getLocation();
            if (location2 >= 0 || (i12 = location2 + capacity) >= i11) {
                return;
            }
            anchor4.setLocation$runtime_release(i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void updateContainsMark(int i10) {
        if (i10 >= 0) {
            PrioritySet prioritySet = this.pendingRecalculateMarks;
            if (prioritySet == null) {
                prioritySet = new PrioritySet(null, 1, 0 == true ? 1 : 0);
                this.pendingRecalculateMarks = prioritySet;
            }
            prioritySet.add(i10);
        }
    }

    private final void updateContainsMarkNow(int i10, PrioritySet prioritySet) {
        int iGroupIndexToAddress = groupIndexToAddress(i10);
        boolean zChildContainsAnyMarks = childContainsAnyMarks(i10);
        if (SlotTableKt.containsMark(this.groups, iGroupIndexToAddress) != zChildContainsAnyMarks) {
            SlotTableKt.updateContainsMark(this.groups, iGroupIndexToAddress, zChildContainsAnyMarks);
            int iParent = parent(i10);
            if (iParent >= 0) {
                prioritySet.add(iParent);
            }
        }
    }

    private final void updateDataIndex(int[] iArr, int i10, int i11) {
        SlotTableKt.updateDataAnchor(iArr, i10, dataIndexToDataAnchor(i11, this.slotsGapStart, this.slotsGapLen, this.slots.length));
    }

    private final void updateNodeOfGroup(int i10, Object obj) {
        int iGroupIndexToAddress = groupIndexToAddress(i10);
        int[] iArr = this.groups;
        if (iGroupIndexToAddress < iArr.length && SlotTableKt.isNode(iArr, iGroupIndexToAddress)) {
            this.slots[dataIndexToDataAddress(nodeIndex(this.groups, iGroupIndexToAddress))] = obj;
            return;
        }
        ComposerKt.composeRuntimeError(("Updating the node of a group at " + i10 + " that was not created with as a node group").toString());
        throw new KotlinNothingValueException();
    }

    public final void addToGroupSizeAlongSpine(int i10, int i11) {
        while (i10 > 0) {
            int[] iArr = this.groups;
            SlotTableKt.updateGroupSize(iArr, i10, SlotTableKt.groupSize(iArr, i10) + i11);
            i10 = groupIndexToAddress(parentAnchorToIndex(SlotTableKt.parentAnchor(this.groups, i10)));
        }
    }

    public final void advanceBy(int i10) {
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException("Cannot seek backwards".toString());
        }
        if (!(this.insertCount <= 0)) {
            throw new IllegalStateException("Cannot call seek() while inserting".toString());
        }
        if (i10 == 0) {
            return;
        }
        int i11 = this.currentGroup + i10;
        if (i11 >= this.parent && i11 <= this.currentGroupEnd) {
            this.currentGroup = i11;
            int iDataIndex = dataIndex(this.groups, groupIndexToAddress(i11));
            this.currentSlot = iDataIndex;
            this.currentSlotEnd = iDataIndex;
            return;
        }
        ComposerKt.composeRuntimeError(("Cannot seek outside the current group (" + this.parent + '-' + this.currentGroupEnd + ')').toString());
        throw new KotlinNothingValueException();
    }

    @NotNull
    public final Anchor anchor(int index) {
        ArrayList<Anchor> arrayList = this.anchors;
        int iSearch = SlotTableKt.search(arrayList, index, getSize$runtime_release());
        if (iSearch >= 0) {
            Anchor anchor = arrayList.get(iSearch);
            tn.p.j(anchor, "get(location)");
            return anchor;
        }
        if (index > this.groupGapStart) {
            index = -(getSize$runtime_release() - index);
        }
        Anchor anchor2 = new Anchor(index);
        arrayList.add(-(iSearch + 1), anchor2);
        return anchor2;
    }

    public final int anchorIndex(@NotNull Anchor anchor) {
        tn.p.k(anchor, "anchor");
        int location = anchor.getLocation();
        return location < 0 ? location + getSize$runtime_release() : location;
    }

    public final void bashGroup$runtime_release() {
        startGroup();
        while (!isGroupEnd()) {
            insertParentGroup(-3);
            skipGroup();
        }
        endGroup();
    }

    public final void beginInsert() {
        int i10 = this.insertCount;
        this.insertCount = i10 + 1;
        if (i10 == 0) {
            saveCurrentGroupEnd();
        }
    }

    public final void close() {
        this.closed = true;
        if (this.startStack.isEmpty()) {
            moveGroupGapTo(getSize$runtime_release());
            moveSlotGapTo(this.slots.length - this.slotsGapLen, this.groupGapStart);
            recalculateMarks();
        }
        this.table.close$runtime_release(this, this.groups, this.groupGapStart, this.slots, this.slotsGapStart, this.anchors);
    }

    public final int endGroup() {
        boolean z10 = this.insertCount > 0;
        int i10 = this.currentGroup;
        int i11 = this.currentGroupEnd;
        int i12 = this.parent;
        int iGroupIndexToAddress = groupIndexToAddress(i12);
        int i13 = this.nodeCount;
        int i14 = i10 - i12;
        boolean zIsNode = SlotTableKt.isNode(this.groups, iGroupIndexToAddress);
        if (z10) {
            SlotTableKt.updateGroupSize(this.groups, iGroupIndexToAddress, i14);
            SlotTableKt.updateNodeCount(this.groups, iGroupIndexToAddress, i13);
            this.nodeCount = this.nodeCountStack.pop() + (zIsNode ? 1 : i13);
            this.parent = parent(this.groups, i12);
        } else {
            if ((i10 != i11 ? 0 : 1) == 0) {
                throw new IllegalArgumentException("Expected to be at the end of a group".toString());
            }
            int iGroupSize = SlotTableKt.groupSize(this.groups, iGroupIndexToAddress);
            int iNodeCount = SlotTableKt.nodeCount(this.groups, iGroupIndexToAddress);
            SlotTableKt.updateGroupSize(this.groups, iGroupIndexToAddress, i14);
            SlotTableKt.updateNodeCount(this.groups, iGroupIndexToAddress, i13);
            int iPop = this.startStack.pop();
            restoreCurrentGroupEnd();
            this.parent = iPop;
            int iParent = parent(this.groups, i12);
            int iPop2 = this.nodeCountStack.pop();
            this.nodeCount = iPop2;
            if (iParent == iPop) {
                this.nodeCount = iPop2 + (zIsNode ? 0 : i13 - iNodeCount);
            } else {
                int i15 = i14 - iGroupSize;
                int i16 = zIsNode ? 0 : i13 - iNodeCount;
                if (i15 != 0 || i16 != 0) {
                    while (iParent != 0 && iParent != iPop && (i16 != 0 || i15 != 0)) {
                        int iGroupIndexToAddress2 = groupIndexToAddress(iParent);
                        if (i15 != 0) {
                            SlotTableKt.updateGroupSize(this.groups, iGroupIndexToAddress2, SlotTableKt.groupSize(this.groups, iGroupIndexToAddress2) + i15);
                        }
                        if (i16 != 0) {
                            int[] iArr = this.groups;
                            SlotTableKt.updateNodeCount(iArr, iGroupIndexToAddress2, SlotTableKt.nodeCount(iArr, iGroupIndexToAddress2) + i16);
                        }
                        if (SlotTableKt.isNode(this.groups, iGroupIndexToAddress2)) {
                            i16 = 0;
                        }
                        iParent = parent(this.groups, iParent);
                    }
                }
                this.nodeCount += i16;
            }
        }
        return i13;
    }

    public final void endInsert() {
        int i10 = this.insertCount;
        if (!(i10 > 0)) {
            throw new IllegalStateException("Unbalanced begin/end insert".toString());
        }
        int i11 = i10 - 1;
        this.insertCount = i11;
        if (i11 == 0) {
            if (this.nodeCountStack.getTos() == this.startStack.getTos()) {
                restoreCurrentGroupEnd();
            } else {
                ComposerKt.composeRuntimeError("startGroup/endGroup mismatch while inserting".toString());
                throw new KotlinNothingValueException();
            }
        }
    }

    public final void ensureStarted(int i10) {
        if (!(this.insertCount <= 0)) {
            throw new IllegalArgumentException("Cannot call ensureStarted() while inserting".toString());
        }
        int i11 = this.parent;
        if (i11 != i10) {
            if (!(i10 >= i11 && i10 < this.currentGroupEnd)) {
                throw new IllegalArgumentException(("Started group at " + i10 + " must be a subgroup of the group at " + i11).toString());
            }
            int i12 = this.currentGroup;
            int i13 = this.currentSlot;
            int i14 = this.currentSlotEnd;
            this.currentGroup = i10;
            startGroup();
            this.currentGroup = i12;
            this.currentSlot = i13;
            this.currentSlotEnd = i14;
        }
    }

    public final void ensureStarted(@NotNull Anchor anchor) {
        tn.p.k(anchor, "anchor");
        ensureStarted(anchor.toIndexFor(this));
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final int getCurrentGroup() {
        return this.currentGroup;
    }

    public final int getParent() {
        return this.parent;
    }

    public final int getSize$runtime_release() {
        return getCapacity() - this.groupGapLen;
    }

    @NotNull
    /* JADX INFO: renamed from: getTable$runtime_release, reason: from getter */
    public final SlotTable getTable() {
        return this.table;
    }

    @Nullable
    public final Object groupAux(int index) {
        int iGroupIndexToAddress = groupIndexToAddress(index);
        return SlotTableKt.hasAux(this.groups, iGroupIndexToAddress) ? this.slots[auxIndex(this.groups, iGroupIndexToAddress)] : Composer.INSTANCE.getEmpty();
    }

    public final int groupKey(int index) {
        return SlotTableKt.key(this.groups, groupIndexToAddress(index));
    }

    @Nullable
    public final Object groupObjectKey(int index) {
        int iGroupIndexToAddress = groupIndexToAddress(index);
        if (SlotTableKt.hasObjectKey(this.groups, iGroupIndexToAddress)) {
            return this.slots[SlotTableKt.objectKeyIndex(this.groups, iGroupIndexToAddress)];
        }
        return null;
    }

    public final int groupSize(int index) {
        return SlotTableKt.groupSize(this.groups, groupIndexToAddress(index));
    }

    @NotNull
    public final Iterator<Object> groupSlots() {
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(this.currentGroup));
        int[] iArr = this.groups;
        int i10 = this.currentGroup;
        return new AnonymousClass1(iDataIndex, dataIndex(iArr, groupIndexToAddress(i10 + groupSize(i10))), this);
    }

    @NotNull
    public final String groupsAsString() {
        StringBuilder sb2 = new StringBuilder();
        int size$runtime_release = getSize$runtime_release();
        for (int i10 = 0; i10 < size$runtime_release; i10++) {
            groupAsString(sb2, i10);
            sb2.append('\n');
        }
        String string = sb2.toString();
        tn.p.j(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final boolean indexInCurrentGroup(int index) {
        return indexInGroup(index, this.currentGroup);
    }

    public final boolean indexInGroup(int index, int group) {
        int iIndexOf;
        int capacity;
        if (group == this.parent) {
            capacity = this.currentGroupEnd;
        } else if (group <= this.startStack.peekOr(0) && (iIndexOf = this.startStack.indexOf(group)) >= 0) {
            capacity = (getCapacity() - this.groupGapLen) - this.endStack.peek(iIndexOf);
        } else {
            int iGroupSize = groupSize(group);
            capacity = iGroupSize + group;
        }
        return index > group && index < capacity;
    }

    public final boolean indexInParent(int index) {
        int i10 = this.parent;
        return (index > i10 && index < this.currentGroupEnd) || (i10 == 0 && index == 0);
    }

    public final void insertAux(@Nullable Object obj) {
        if (!(this.insertCount >= 0)) {
            ComposerKt.composeRuntimeError("Cannot insert auxiliary data when not inserting".toString());
            throw new KotlinNothingValueException();
        }
        int i10 = this.parent;
        int iGroupIndexToAddress = groupIndexToAddress(i10);
        if (!(!SlotTableKt.hasAux(this.groups, iGroupIndexToAddress))) {
            ComposerKt.composeRuntimeError("Group already has auxiliary data".toString());
            throw new KotlinNothingValueException();
        }
        insertSlots(1, i10);
        int iAuxIndex = auxIndex(this.groups, iGroupIndexToAddress);
        int iDataIndexToDataAddress = dataIndexToDataAddress(iAuxIndex);
        int i11 = this.currentSlot;
        if (i11 > iAuxIndex) {
            int i12 = i11 - iAuxIndex;
            if (!(i12 < 3)) {
                throw new IllegalStateException("Moving more than two slot not supported".toString());
            }
            if (i12 > 1) {
                Object[] objArr = this.slots;
                objArr[iDataIndexToDataAddress + 2] = objArr[iDataIndexToDataAddress + 1];
            }
            Object[] objArr2 = this.slots;
            objArr2[iDataIndexToDataAddress + 1] = objArr2[iDataIndexToDataAddress];
        }
        SlotTableKt.addAux(this.groups, iGroupIndexToAddress);
        this.slots[iDataIndexToDataAddress] = obj;
        this.currentSlot++;
    }

    public final void insertParentGroup(int i10) {
        int iNodeCount = 0;
        if (!(this.insertCount == 0)) {
            ComposerKt.composeRuntimeError("Writer cannot be inserting".toString());
            throw new KotlinNothingValueException();
        }
        if (isGroupEnd()) {
            beginInsert();
            startGroup(i10);
            endGroup();
            endInsert();
            return;
        }
        int i11 = this.currentGroup;
        int iParent = parent(this.groups, i11);
        int iGroupSize = iParent + groupSize(iParent);
        int i12 = iGroupSize - i11;
        int iGroupSize2 = i11;
        while (iGroupSize2 < iGroupSize) {
            int iGroupIndexToAddress = groupIndexToAddress(iGroupSize2);
            iNodeCount += SlotTableKt.nodeCount(this.groups, iGroupIndexToAddress);
            iGroupSize2 += SlotTableKt.groupSize(this.groups, iGroupIndexToAddress);
        }
        int iDataAnchor = SlotTableKt.dataAnchor(this.groups, groupIndexToAddress(i11));
        beginInsert();
        insertGroups(1);
        endInsert();
        int iGroupIndexToAddress2 = groupIndexToAddress(i11);
        SlotTableKt.initGroup(this.groups, iGroupIndexToAddress2, i10, false, false, false, iParent, iDataAnchor);
        SlotTableKt.updateGroupSize(this.groups, iGroupIndexToAddress2, i12 + 1);
        SlotTableKt.updateNodeCount(this.groups, iGroupIndexToAddress2, iNodeCount);
        addToGroupSizeAlongSpine(groupIndexToAddress(iParent), 1);
        fixParentAnchorsFor(iParent, iGroupSize, i11);
        this.currentGroup = iGroupSize;
    }

    public final boolean isGroupEnd() {
        return this.currentGroup == this.currentGroupEnd;
    }

    public final boolean isNode() {
        int i10 = this.currentGroup;
        return i10 < this.currentGroupEnd && SlotTableKt.isNode(this.groups, groupIndexToAddress(i10));
    }

    public final boolean isNode(int index) {
        return SlotTableKt.isNode(this.groups, groupIndexToAddress(index));
    }

    public final void markGroup(int i10) {
        int iGroupIndexToAddress = groupIndexToAddress(i10);
        if (SlotTableKt.hasMark(this.groups, iGroupIndexToAddress)) {
            return;
        }
        SlotTableKt.updateMark(this.groups, iGroupIndexToAddress, true);
        if (SlotTableKt.containsMark(this.groups, iGroupIndexToAddress)) {
            return;
        }
        updateContainsMark(parent(i10));
    }

    @NotNull
    public final List<Anchor> moveFrom(@NotNull SlotTable table, int index) {
        tn.p.k(table, G5.Q);
        if (!(this.insertCount > 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (index != 0 || this.currentGroup != 0 || this.table.getGroupsSize() != 0) {
            SlotWriter slotWriterOpenWriter = table.openWriter();
            try {
                return INSTANCE.moveGroup(slotWriterOpenWriter, index, this, true, true);
            } finally {
                slotWriterOpenWriter.close();
            }
        }
        int[] iArr = this.groups;
        Object[] objArr = this.slots;
        ArrayList<Anchor> arrayList = this.anchors;
        int[] groups = table.getGroups();
        int groupsSize = table.getGroupsSize();
        Object[] slots = table.getSlots();
        int slotsSize = table.getSlotsSize();
        this.groups = groups;
        this.slots = slots;
        this.anchors = table.getAnchors$runtime_release();
        this.groupGapStart = groupsSize;
        this.groupGapLen = (groups.length / 5) - groupsSize;
        this.slotsGapStart = slotsSize;
        this.slotsGapLen = slots.length - slotsSize;
        this.slotsGapOwner = groupsSize;
        table.setTo$runtime_release(iArr, 0, objArr, 0, arrayList);
        return this.anchors;
    }

    public final void moveGroup(int i10) {
        if (!(this.insertCount == 0)) {
            throw new IllegalArgumentException("Cannot move a group while inserting".toString());
        }
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException("Parameter offset is out of bounds".toString());
        }
        if (i10 == 0) {
            return;
        }
        int i11 = this.currentGroup;
        int i12 = this.parent;
        int i13 = this.currentGroupEnd;
        int iGroupSize = i11;
        for (int i14 = i10; i14 > 0; i14--) {
            iGroupSize += SlotTableKt.groupSize(this.groups, groupIndexToAddress(iGroupSize));
            if (!(iGroupSize <= i13)) {
                throw new IllegalArgumentException("Parameter offset is out of bounds".toString());
            }
        }
        int iGroupSize2 = SlotTableKt.groupSize(this.groups, groupIndexToAddress(iGroupSize));
        int i15 = this.currentSlot;
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(iGroupSize));
        int i16 = iGroupSize + iGroupSize2;
        int iDataIndex2 = dataIndex(this.groups, groupIndexToAddress(i16));
        int i17 = iDataIndex2 - iDataIndex;
        insertSlots(i17, Math.max(this.currentGroup - 1, 0));
        insertGroups(iGroupSize2);
        int[] iArr = this.groups;
        int iGroupIndexToAddress = groupIndexToAddress(i16) * 5;
        p.j(iArr, iArr, groupIndexToAddress(i11) * 5, iGroupIndexToAddress, (iGroupSize2 * 5) + iGroupIndexToAddress);
        if (i17 > 0) {
            Object[] objArr = this.slots;
            p.l(objArr, objArr, i15, dataIndexToDataAddress(iDataIndex + i17), dataIndexToDataAddress(iDataIndex2 + i17));
        }
        int i18 = iDataIndex + i17;
        int i19 = i18 - i15;
        int i20 = this.slotsGapStart;
        int i21 = this.slotsGapLen;
        int length = this.slots.length;
        int i22 = this.slotsGapOwner;
        int i23 = i11 + iGroupSize2;
        int i24 = i11;
        while (i24 < i23) {
            int iGroupIndexToAddress2 = groupIndexToAddress(i24);
            int i25 = i20;
            int i26 = i19;
            updateDataIndex(iArr, iGroupIndexToAddress2, dataIndexToDataAnchor(dataIndex(iArr, iGroupIndexToAddress2) - i19, i22 < iGroupIndexToAddress2 ? 0 : i25, i21, length));
            i24++;
            i20 = i25;
            i19 = i26;
        }
        moveAnchors(i16, i11, iGroupSize2);
        if (!(!removeGroups(i16, iGroupSize2))) {
            ComposerKt.composeRuntimeError("Unexpectedly removed anchors".toString());
            throw new KotlinNothingValueException();
        }
        fixParentAnchorsFor(i12, this.currentGroupEnd, i11);
        if (i17 > 0) {
            removeSlots(i18, i17, i16 - 1);
        }
    }

    @NotNull
    public final List<Anchor> moveIntoGroupFrom(int offset, @NotNull SlotTable table, int index) {
        tn.p.k(table, G5.Q);
        ComposerKt.runtimeCheck(this.insertCount <= 0 && groupSize(this.currentGroup + offset) == 1);
        int i10 = this.currentGroup;
        int i11 = this.currentSlot;
        int i12 = this.currentSlotEnd;
        advanceBy(offset);
        startGroup();
        beginInsert();
        SlotWriter slotWriterOpenWriter = table.openWriter();
        try {
            List<Anchor> listMoveGroup = INSTANCE.moveGroup(slotWriterOpenWriter, index, this, false, true);
            slotWriterOpenWriter.close();
            endInsert();
            endGroup();
            this.currentGroup = i10;
            this.currentSlot = i11;
            this.currentSlotEnd = i12;
            return listMoveGroup;
        } catch (Throwable th2) {
            slotWriterOpenWriter.close();
            throw th2;
        }
    }

    @NotNull
    public final List<Anchor> moveTo(@NotNull Anchor anchor, int offset, @NotNull SlotWriter writer) {
        tn.p.k(anchor, "anchor");
        tn.p.k(writer, "writer");
        if (!(writer.insertCount > 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(this.insertCount == 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!anchor.getValid()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int iAnchorIndex = anchorIndex(anchor) + offset;
        int i10 = this.currentGroup;
        if (!(i10 <= iAnchorIndex && iAnchorIndex < this.currentGroupEnd)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int iParent = parent(iAnchorIndex);
        int iGroupSize = groupSize(iAnchorIndex);
        int iNodeCount = isNode(iAnchorIndex) ? 1 : nodeCount(iAnchorIndex);
        List<Anchor> listMoveGroup = INSTANCE.moveGroup(this, iAnchorIndex, writer, false, false);
        updateContainsMark(iParent);
        boolean z10 = iNodeCount > 0;
        while (iParent >= i10) {
            int iGroupIndexToAddress = groupIndexToAddress(iParent);
            int[] iArr = this.groups;
            SlotTableKt.updateGroupSize(iArr, iGroupIndexToAddress, SlotTableKt.groupSize(iArr, iGroupIndexToAddress) - iGroupSize);
            if (z10) {
                if (SlotTableKt.isNode(this.groups, iGroupIndexToAddress)) {
                    z10 = false;
                } else {
                    int[] iArr2 = this.groups;
                    SlotTableKt.updateNodeCount(iArr2, iGroupIndexToAddress, SlotTableKt.nodeCount(iArr2, iGroupIndexToAddress) - iNodeCount);
                }
            }
            iParent = parent(iParent);
        }
        if (z10) {
            ComposerKt.runtimeCheck(this.nodeCount >= iNodeCount);
            this.nodeCount -= iNodeCount;
        }
        return listMoveGroup;
    }

    @Nullable
    public final Object node(int index) {
        int iGroupIndexToAddress = groupIndexToAddress(index);
        if (SlotTableKt.isNode(this.groups, iGroupIndexToAddress)) {
            return this.slots[dataIndexToDataAddress(nodeIndex(this.groups, iGroupIndexToAddress))];
        }
        return null;
    }

    @Nullable
    public final Object node(@NotNull Anchor anchor) {
        tn.p.k(anchor, "anchor");
        return node(anchor.toIndexFor(this));
    }

    public final int nodeCount(int index) {
        return SlotTableKt.nodeCount(this.groups, groupIndexToAddress(index));
    }

    public final int parent(int index) {
        return parent(this.groups, index);
    }

    public final int parent(@NotNull Anchor anchor) {
        tn.p.k(anchor, "anchor");
        if (anchor.getValid()) {
            return parent(this.groups, anchorIndex(anchor));
        }
        return -1;
    }

    public final boolean removeGroup() {
        if (!(this.insertCount == 0)) {
            throw new IllegalArgumentException("Cannot remove group while inserting".toString());
        }
        int i10 = this.currentGroup;
        int i11 = this.currentSlot;
        int iSkipGroup = skipGroup();
        PrioritySet prioritySet = this.pendingRecalculateMarks;
        if (prioritySet != null) {
            while (prioritySet.isNotEmpty() && prioritySet.peek() >= i10) {
                prioritySet.takeMax();
            }
        }
        boolean zRemoveGroups = removeGroups(i10, this.currentGroup - i10);
        removeSlots(i11, this.currentSlot - i11, i10 - 1);
        this.currentGroup = i10;
        this.currentSlot = i11;
        this.nodeCount -= iSkipGroup;
        return zRemoveGroups;
    }

    public final void reset() {
        if (!(this.insertCount == 0)) {
            ComposerKt.composeRuntimeError("Cannot reset when inserting".toString());
            throw new KotlinNothingValueException();
        }
        recalculateMarks();
        this.currentGroup = 0;
        this.currentGroupEnd = getCapacity() - this.groupGapLen;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
        this.nodeCount = 0;
    }

    public final void seek(@NotNull Anchor anchor) {
        tn.p.k(anchor, "anchor");
        advanceBy(anchor.toIndexFor(this) - this.currentGroup);
    }

    @Nullable
    public final Object set(int index, @Nullable Object value) {
        int iSlotIndex = slotIndex(this.groups, groupIndexToAddress(this.currentGroup));
        int i10 = iSlotIndex + index;
        if (i10 >= iSlotIndex && i10 < dataIndex(this.groups, groupIndexToAddress(this.currentGroup + 1))) {
            int iDataIndexToDataAddress = dataIndexToDataAddress(i10);
            Object[] objArr = this.slots;
            Object obj = objArr[iDataIndexToDataAddress];
            objArr[iDataIndexToDataAddress] = value;
            return obj;
        }
        ComposerKt.composeRuntimeError(("Write to an invalid slot index " + index + " for group " + this.currentGroup).toString());
        throw new KotlinNothingValueException();
    }

    public final void set(@Nullable Object obj) {
        int i10 = this.currentSlot;
        if (i10 <= this.currentSlotEnd) {
            this.slots[dataIndexToDataAddress(i10 - 1)] = obj;
        } else {
            ComposerKt.composeRuntimeError("Writing to an invalid slot".toString());
            throw new KotlinNothingValueException();
        }
    }

    @Nullable
    public final Object skip() {
        if (this.insertCount > 0) {
            insertSlots(1, this.parent);
        }
        Object[] objArr = this.slots;
        int i10 = this.currentSlot;
        this.currentSlot = i10 + 1;
        return objArr[dataIndexToDataAddress(i10)];
    }

    public final int skipGroup() {
        int iGroupIndexToAddress = groupIndexToAddress(this.currentGroup);
        int iGroupSize = this.currentGroup + SlotTableKt.groupSize(this.groups, iGroupIndexToAddress);
        this.currentGroup = iGroupSize;
        this.currentSlot = dataIndex(this.groups, groupIndexToAddress(iGroupSize));
        if (SlotTableKt.isNode(this.groups, iGroupIndexToAddress)) {
            return 1;
        }
        return SlotTableKt.nodeCount(this.groups, iGroupIndexToAddress);
    }

    public final void skipToGroupEnd() {
        int i10 = this.currentGroupEnd;
        this.currentGroup = i10;
        this.currentSlot = dataIndex(this.groups, groupIndexToAddress(i10));
    }

    @Nullable
    public final Object slot(int groupIndex, int index) {
        int iSlotIndex = slotIndex(this.groups, groupIndexToAddress(groupIndex));
        int i10 = index + iSlotIndex;
        if (iSlotIndex <= i10 && i10 < dataIndex(this.groups, groupIndexToAddress(groupIndex + 1))) {
            return this.slots[dataIndexToDataAddress(i10)];
        }
        return Composer.INSTANCE.getEmpty();
    }

    @Nullable
    public final Object slot(@NotNull Anchor anchor, int index) {
        tn.p.k(anchor, "anchor");
        return slot(anchorIndex(anchor), index);
    }

    public final void startData(int i10, @Nullable Object obj) {
        startGroup(i10, Composer.INSTANCE.getEmpty(), false, obj);
    }

    public final void startData(int i10, @Nullable Object obj, @Nullable Object obj2) {
        startGroup(i10, obj, false, obj2);
    }

    public final void startGroup() {
        if (!(this.insertCount == 0)) {
            throw new IllegalArgumentException("Key must be supplied when inserting".toString());
        }
        Composer.Companion companion = Composer.INSTANCE;
        startGroup(0, companion.getEmpty(), false, companion.getEmpty());
    }

    public final void startGroup(int i10) {
        Composer.Companion companion = Composer.INSTANCE;
        startGroup(i10, companion.getEmpty(), false, companion.getEmpty());
    }

    public final void startGroup(int i10, @Nullable Object obj) {
        startGroup(i10, obj, false, Composer.INSTANCE.getEmpty());
    }

    public final void startNode(@Nullable Object obj) {
        startGroup(125, obj, true, Composer.INSTANCE.getEmpty());
    }

    public final void startNode(@Nullable Object obj, @Nullable Object obj2) {
        startGroup(125, obj, true, obj2);
    }

    @NotNull
    public String toString() {
        return "SlotWriter(current = " + this.currentGroup + " end=" + this.currentGroupEnd + " size = " + getSize$runtime_release() + " gap=" + this.groupGapStart + '-' + (this.groupGapStart + this.groupGapLen) + ')';
    }

    @Nullable
    public final Object update(@Nullable Object value) {
        Object objSkip = skip();
        set(value);
        return objSkip;
    }

    public final void updateAux(@Nullable Object obj) {
        int iGroupIndexToAddress = groupIndexToAddress(this.currentGroup);
        if (SlotTableKt.hasAux(this.groups, iGroupIndexToAddress)) {
            this.slots[dataIndexToDataAddress(auxIndex(this.groups, iGroupIndexToAddress))] = obj;
        } else {
            ComposerKt.composeRuntimeError("Updating the data of a group that was not created with a data slot".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final void updateNode(@NotNull Anchor anchor, @Nullable Object obj) {
        tn.p.k(anchor, "anchor");
        updateNodeOfGroup(anchor.toIndexFor(this), obj);
    }

    public final void updateNode(@Nullable Object obj) {
        updateNodeOfGroup(this.currentGroup, obj);
    }

    public final void updateParentNode(@Nullable Object obj) {
        updateNodeOfGroup(this.parent, obj);
    }

    public final void verifyDataAnchors$runtime_release() {
        int i10 = this.slotsGapOwner;
        int length = this.slots.length - this.slotsGapLen;
        int size$runtime_release = getSize$runtime_release();
        int i11 = 0;
        int i12 = 0;
        boolean z10 = false;
        while (i11 < size$runtime_release) {
            int iGroupIndexToAddress = groupIndexToAddress(i11);
            int iDataAnchor = SlotTableKt.dataAnchor(this.groups, iGroupIndexToAddress);
            int iDataIndex = dataIndex(this.groups, iGroupIndexToAddress);
            if (!(iDataIndex >= i12)) {
                throw new IllegalStateException(("Data index out of order at " + i11 + ", previous = " + i12 + ", current = " + iDataIndex).toString());
            }
            if (!(iDataIndex <= length)) {
                throw new IllegalStateException(("Data index, " + iDataIndex + ", out of bound at " + i11).toString());
            }
            if (iDataAnchor < 0 && !z10) {
                if (!(i10 == i11)) {
                    throw new IllegalStateException(("Expected the slot gap owner to be " + i10 + " found gap at " + i11).toString());
                }
                z10 = true;
            }
            i11++;
            i12 = iDataIndex;
        }
    }

    public final void verifyParentAnchors$runtime_release() {
        int i10 = this.groupGapStart;
        int i11 = this.groupGapLen;
        int capacity = getCapacity();
        int i12 = 0;
        while (true) {
            if (i12 >= i10) {
                for (int i13 = i11 + i10; i13 < capacity; i13++) {
                    int iParentAnchor = SlotTableKt.parentAnchor(this.groups, i13);
                    if (parentAnchorToIndex(iParentAnchor) < i10) {
                        if (!(iParentAnchor > -2)) {
                            throw new IllegalStateException(("Expected a start relative anchor at " + i13).toString());
                        }
                    } else {
                        if (!(iParentAnchor <= -2)) {
                            throw new IllegalStateException(("Expected an end relative anchor at " + i13).toString());
                        }
                    }
                }
                return;
            }
            if (!(SlotTableKt.parentAnchor(this.groups, i12) > -2)) {
                throw new IllegalStateException(("Expected a start relative anchor at " + i12).toString());
            }
            i12++;
        }
    }
}
