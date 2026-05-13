package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.exifinterface.media.ExifInterface;
import cn.h;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBuilderBridgeCommon;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.b;
import tn.p;
import zn.n;

/* JADX INFO: compiled from: PersistentVectorBuilder.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0010*\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010)\n\u0000\n\u0002\u0010+\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003BA\u0012\f\u0010r\u001a\b\u0012\u0004\u0012\u00028\u00000b\u0012\u0010\u0010t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b\u0012\u000e\u0010v\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012\u0006\u0010w\u001a\u00020\u0004¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u001f\u0010\f\u001a\u00020\u000b2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ)\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0010\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017JA\u0010\u001c\u001a\u00020\u001b2\u0010\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b2\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJA\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0010\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b2\u000e\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u001f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010!J?\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\"\u001a\u00020\u00042\u000e\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0#H\u0002¢\u0006\u0004\b%\u0010&JG\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0010\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010'\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b0\bH\u0002¢\u0006\u0004\b(\u0010)JO\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0010\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\u0014\u0010*\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b0#H\u0002¢\u0006\u0004\b+\u0010,J1\u0010.\u001a\u00020\u001b2\u0010\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b2\u0006\u0010-\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00028\u0000H\u0002¢\u0006\u0004\b.\u0010/JI\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\t2\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b2\u00103J]\u00102\u001a\u00020\u001b2\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u0000042\u0006\u0010-\u001a\u00020\u00042\u0006\u00106\u001a\u00020\u00042\u0016\u0010'\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b0\b2\u0006\u00107\u001a\u00020\u00042\u000e\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0002¢\u0006\u0004\b2\u00109JW\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010:\u001a\u00020\u00042\u0006\u00106\u001a\u00020\u00042\u0016\u0010'\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b0\b2\u0006\u00107\u001a\u00020\u00042\u000e\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0002¢\u0006\u0004\b;\u0010<Jm\u0010?\u001a\u00020\u001b2\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u0000042\u0006\u0010-\u001a\u00020\u00042\u000e\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010>\u001a\u00020\u00042\u0016\u0010'\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b0\b2\u0006\u00107\u001a\u00020\u00042\u000e\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0002¢\u0006\u0004\b?\u0010@J\u001f\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010-\u001a\u00020\u0004H\u0002¢\u0006\u0004\bA\u0010BJ;\u0010C\u001a\u0004\u0018\u00010\t2\u0010\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0004H\u0002¢\u0006\u0004\bC\u0010DJ?\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00042\u0006\u0010E\u001a\u000200H\u0002¢\u0006\u0004\bF\u0010GJ1\u0010H\u001a\u00020\u001b2\u0010\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0004H\u0002¢\u0006\u0004\bH\u0010IJA\u0010J\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b2\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010E\u001a\u000200H\u0002¢\u0006\u0004\bJ\u0010GJ\u001c\u0010M\u001a\u00020\u000b2\u0012\u0010L\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0KH\u0002J1\u0010N\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b2\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\bN\u0010\u0012J7\u0010O\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010-\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0004H\u0002¢\u0006\u0004\bO\u0010PJ,\u0010R\u001a\u00020\u00042\u0012\u0010L\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0K2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010Q\u001a\u000200H\u0002JC\u0010M\u001a\u00020\u00042\u0012\u0010L\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0K2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010S\u001a\u00020\u00042\u0006\u0010Q\u001a\u000200H\u0002¢\u0006\u0004\bM\u0010TJw\u0010X\u001a\u00020\u00042\u0012\u0010L\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0K2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010S\u001a\u00020\u00042\u0006\u0010U\u001a\u00020\u00042\u0006\u0010Q\u001a\u0002002\u0014\u0010W\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b0V2\u0014\u0010'\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b0VH\u0002¢\u0006\u0004\bX\u0010YJG\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00042\u0006\u0010Z\u001a\u00028\u00002\u0006\u0010[\u001a\u000200H\u0002¢\u0006\u0004\b\\\u00103J\u001e\u0010^\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b0]2\u0006\u0010-\u001a\u00020\u0004H\u0002J\u000f\u0010a\u001a\u00020\u0004H\u0000¢\u0006\u0004\b_\u0010`J\u000e\u0010c\u001a\b\u0012\u0004\u0012\u00028\u00000bH\u0016J\u0017\u0010d\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\bd\u0010eJ\u0016\u0010f\u001a\u00020\u000b2\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u000004H\u0016J\u001f\u0010d\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\bd\u0010gJ\u001e\u0010f\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u00042\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u000004H\u0016J\u0018\u0010h\u001a\u00028\u00002\u0006\u0010-\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\bh\u0010iJ\u0017\u0010j\u001a\u00028\u00002\u0006\u0010-\u001a\u00020\u0004H\u0016¢\u0006\u0004\bj\u0010iJ\u0016\u0010M\u001a\u00020\u000b2\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u000004H\u0016J\u001a\u0010k\u001a\u00020\u000b2\u0012\u0010L\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0KJ \u0010l\u001a\u00028\u00002\u0006\u0010-\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\bl\u0010mJ\u000f\u0010o\u001a\b\u0012\u0004\u0012\u00028\u00000nH\u0096\u0002J\u000e\u0010q\u001a\b\u0012\u0004\u0012\u00028\u00000pH\u0016J\u0016\u0010q\u001a\b\u0012\u0004\u0012\u00028\u00000p2\u0006\u0010-\u001a\u00020\u0004H\u0016R\u001c\u0010r\u001a\b\u0012\u0004\u0012\u00028\u00000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR \u0010t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u001e\u0010v\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010uR\"\u0010w\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010`\"\u0004\bz\u0010{R\u0016\u0010}\u001a\u00020|8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~R9\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b2\u0010\u0010\u007f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b8\u0000@BX\u0080\u000e¢\u0006\r\n\u0004\b\u0018\u0010u\u001a\u0005\b\u0080\u0001\u0010\u0017R5\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u000e\u0010\u007f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0000@BX\u0080\u000e¢\u0006\r\n\u0004\b\u001e\u0010u\u001a\u0005\b\u0081\u0001\u0010\u0017R%\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u007f\u001a\u00020\u00048\u0016@RX\u0096\u000e¢\u0006\r\n\u0004\b\u0006\u0010x\u001a\u0005\b\u0082\u0001\u0010`¨\u0006\u0085\u0001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;", ExifInterface.LONGITUDE_EAST, "Lcn/h;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList$Builder;", "", "rootSize", "size", "tailSize", "", "", "buffer", "", "isMutable", "([Ljava/lang/Object;)Z", "makeMutable", "([Ljava/lang/Object;)[Ljava/lang/Object;", "distance", "makeMutableShiftingRight", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "element", "mutableBufferWith", "(Ljava/lang/Object;)[Ljava/lang/Object;", "mutableBuffer", "()[Ljava/lang/Object;", "root", "filledTail", "newTail", "Lbn/r;", "pushFilledTail", "([Ljava/lang/Object;[Ljava/lang/Object;[Ljava/lang/Object;)V", "tail", "shift", "pushTail", "([Ljava/lang/Object;[Ljava/lang/Object;I)[Ljava/lang/Object;", "bufferIndex", "", "sourceIterator", "copyToBuffer", "([Ljava/lang/Object;ILjava/util/Iterator;)[Ljava/lang/Object;", "buffers", "pushBuffersIncreasingHeightIfNeeded", "([Ljava/lang/Object;I[[Ljava/lang/Object;)[Ljava/lang/Object;", "buffersIterator", "pushBuffers", "([Ljava/lang/Object;IILjava/util/Iterator;)[Ljava/lang/Object;", "index", "insertIntoTail", "([Ljava/lang/Object;ILjava/lang/Object;)V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;", "elementCarry", "insertIntoRoot", "([Ljava/lang/Object;IILjava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;)[Ljava/lang/Object;", "", "elements", "rightShift", "nullBuffers", "nextBuffer", "(Ljava/util/Collection;II[[Ljava/lang/Object;I[Ljava/lang/Object;)V", "startLeafIndex", "shiftLeafBuffers", "(II[[Ljava/lang/Object;I[Ljava/lang/Object;)[Ljava/lang/Object;", "startBuffer", "startBufferSize", "splitToBuffers", "(Ljava/util/Collection;I[Ljava/lang/Object;I[[Ljava/lang/Object;I[Ljava/lang/Object;)V", "bufferFor", "(I)[Ljava/lang/Object;", "removeFromTailAt", "([Ljava/lang/Object;III)Ljava/lang/Object;", "tailCarry", "removeFromRootAt", "([Ljava/lang/Object;IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;)[Ljava/lang/Object;", "pullLastBufferFromRoot", "([Ljava/lang/Object;II)V", "pullLastBuffer", "Lkotlin/Function1;", "predicate", "removeAll", "retainFirst", "nullifyAfter", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "bufferRef", "removeAllFromTail", "bufferSize", "(Lsn/l;[Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;)I", "toBufferSize", "", "recyclableBuffers", "recyclableRemoveAll", "(Lsn/l;[Ljava/lang/Object;IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;Ljava/util/List;Ljava/util/List;)I", "e", "oldElementCarry", "setInRoot", "", "leafBufferIterator", "getModCount$runtime_release", "()I", "getModCount", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", BillingClientBuilderBridgeCommon.buildMethodName, ImpressionLog.f51742l, "(Ljava/lang/Object;)Z", "addAll", "(ILjava/lang/Object;)V", "get", "(I)Ljava/lang/Object;", "removeAt", "removeAllWithPredicate", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "", "iterator", "", "listIterator", "vector", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "vectorRoot", "[Ljava/lang/Object;", "vectorTail", "rootShift", "I", "getRootShift$runtime_release", "setRootShift$runtime_release", "(I)V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "ownership", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "<set-?>", "getRoot$runtime_release", "getTail$runtime_release", "getSize", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;[Ljava/lang/Object;[Ljava/lang/Object;I)V", "runtime_release"}, k = 1, mv = {1, 6, 0})
public final class PersistentVectorBuilder<E> extends h<E> implements PersistentList.Builder<E> {

    @NotNull
    private MutabilityOwnership ownership;

    @Nullable
    private Object[] root;
    private int rootShift;
    private int size;

    @NotNull
    private Object[] tail;

    @NotNull
    private PersistentList<? extends E> vector;

    @Nullable
    private Object[] vectorRoot;

    @NotNull
    private Object[] vectorTail;

    public PersistentVectorBuilder(@NotNull PersistentList<? extends E> persistentList, @Nullable Object[] objArr, @NotNull Object[] objArr2, int i10) {
        p.k(persistentList, "vector");
        p.k(objArr2, "vectorTail");
        this.vector = persistentList;
        this.vectorRoot = objArr;
        this.vectorTail = objArr2;
        this.rootShift = i10;
        this.ownership = new MutabilityOwnership();
        this.root = this.vectorRoot;
        this.tail = this.vectorTail;
        this.size = this.vector.size();
    }

    private final Object[] bufferFor(int index) {
        if (rootSize() <= index) {
            return this.tail;
        }
        Object[] objArr = this.root;
        p.h(objArr);
        for (int i10 = this.rootShift; i10 > 0; i10 -= 5) {
            Object[] objArr2 = objArr[UtilsKt.indexSegment(index, i10)];
            if (objArr2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
            objArr = objArr2;
        }
        return objArr;
    }

    private final Object[] copyToBuffer(Object[] buffer, int bufferIndex, Iterator<? extends Object> sourceIterator) {
        while (bufferIndex < 32 && sourceIterator.hasNext()) {
            buffer[bufferIndex] = sourceIterator.next();
            bufferIndex++;
        }
        return buffer;
    }

    private final void insertIntoRoot(Collection<? extends E> elements, int index, int rightShift, Object[][] buffers, int nullBuffers, Object[] nextBuffer) {
        if (this.root == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        int i10 = index >> 5;
        Object[] objArrShiftLeafBuffers = shiftLeafBuffers(i10, rightShift, buffers, nullBuffers, nextBuffer);
        int iRootSize = nullBuffers - (((rootSize() >> 5) - 1) - i10);
        if (iRootSize < nullBuffers) {
            nextBuffer = buffers[iRootSize];
            p.h(nextBuffer);
        }
        splitToBuffers(elements, index, objArrShiftLeafBuffers, 32, buffers, iRootSize, nextBuffer);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
    
        return r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object[] insertIntoRoot(java.lang.Object[] r9, int r10, int r11, java.lang.Object r12, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.ObjectRef r13) {
        /*
            r8 = this;
            int r0 = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.indexSegment(r11, r10)
            if (r10 != 0) goto L1a
            r10 = 31
            r11 = r9[r10]
            r13.setValue(r11)
            java.lang.Object[] r11 = r8.makeMutable(r9)
            int r13 = r0 + 1
            java.lang.Object[] r9 = cn.p.l(r9, r11, r13, r0, r10)
            r9[r0] = r12
            return r9
        L1a:
            java.lang.Object[] r9 = r8.makeMutable(r9)
            int r10 = r10 + (-5)
            r1 = r9[r0]
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"
            if (r1 == 0) goto L59
            r2 = r1
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r1 = r8
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            java.lang.Object[] r11 = r1.insertIntoRoot(r2, r3, r4, r5, r6)
            r9[r0] = r11
        L34:
            int r0 = r0 + 1
            r11 = 32
            if (r0 >= r11) goto L58
            r11 = r9[r0]
            if (r11 == 0) goto L58
            if (r11 == 0) goto L52
            r2 = r11
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r4 = 0
            java.lang.Object r5 = r13.getValue()
            r1 = r8
            r3 = r10
            r6 = r13
            java.lang.Object[] r11 = r1.insertIntoRoot(r2, r3, r4, r5, r6)
            r9[r0] = r11
            goto L34
        L52:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            r9.<init>(r7)
            throw r9
        L58:
            return r9
        L59:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            r9.<init>(r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder.insertIntoRoot(java.lang.Object[], int, int, java.lang.Object, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.ObjectRef):java.lang.Object[]");
    }

    private final void insertIntoTail(Object[] root, int index, E element) {
        int iTailSize = tailSize();
        Object[] objArrMakeMutable = makeMutable(this.tail);
        if (iTailSize < 32) {
            cn.p.l(this.tail, objArrMakeMutable, index + 1, index, iTailSize);
            objArrMakeMutable[index] = element;
            this.root = root;
            this.tail = objArrMakeMutable;
            this.size = size() + 1;
            return;
        }
        Object[] objArr = this.tail;
        Object obj = objArr[31];
        cn.p.l(objArr, objArrMakeMutable, index + 1, index, 31);
        objArrMakeMutable[index] = element;
        pushFilledTail(root, objArrMakeMutable, mutableBufferWith(obj));
    }

    private final boolean isMutable(Object[] buffer) {
        return buffer.length == 33 && buffer[32] == this.ownership;
    }

    private final ListIterator<Object[]> leafBufferIterator(int index) {
        if (this.root == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        int iRootSize = rootSize() >> 5;
        ListImplementation.checkPositionIndex$runtime_release(index, iRootSize);
        int i10 = this.rootShift;
        if (i10 == 0) {
            Object[] objArr = this.root;
            p.h(objArr);
            return new SingleElementListIterator(objArr, index);
        }
        Object[] objArr2 = this.root;
        p.h(objArr2);
        return new TrieIterator(objArr2, index, iRootSize, i10 / 5);
    }

    private final Object[] makeMutable(Object[] buffer) {
        return buffer == null ? mutableBuffer() : isMutable(buffer) ? buffer : cn.p.p(buffer, mutableBuffer(), 0, 0, n.j(buffer.length, 32), 6, null);
    }

    private final Object[] makeMutableShiftingRight(Object[] buffer, int distance) {
        return isMutable(buffer) ? cn.p.l(buffer, buffer, distance, 0, 32 - distance) : cn.p.l(buffer, mutableBuffer(), distance, 0, 32 - distance);
    }

    private final Object[] mutableBuffer() {
        Object[] objArr = new Object[33];
        objArr[32] = this.ownership;
        return objArr;
    }

    private final Object[] mutableBufferWith(Object element) {
        Object[] objArr = new Object[33];
        objArr[0] = element;
        objArr[32] = this.ownership;
        return objArr;
    }

    private final Object[] nullifyAfter(Object[] root, int index, int shift) {
        if (!(shift >= 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (shift == 0) {
            return root;
        }
        int iIndexSegment = UtilsKt.indexSegment(index, shift);
        Object obj = root[iIndexSegment];
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        Object objNullifyAfter = nullifyAfter((Object[]) obj, index, shift - 5);
        if (iIndexSegment < 31) {
            int i10 = iIndexSegment + 1;
            if (root[i10] != null) {
                if (isMutable(root)) {
                    cn.p.v(root, null, i10, 32);
                }
                root = cn.p.l(root, mutableBuffer(), 0, 0, i10);
            }
        }
        if (objNullifyAfter == root[iIndexSegment]) {
            return root;
        }
        Object[] objArrMakeMutable = makeMutable(root);
        objArrMakeMutable[iIndexSegment] = objNullifyAfter;
        return objArrMakeMutable;
    }

    private final Object[] pullLastBuffer(Object[] root, int shift, int rootSize, ObjectRef tailCarry) {
        Object[] objArrPullLastBuffer;
        int iIndexSegment = UtilsKt.indexSegment(rootSize - 1, shift);
        if (shift == 5) {
            tailCarry.setValue(root[iIndexSegment]);
            objArrPullLastBuffer = null;
        } else {
            Object obj = root[iIndexSegment];
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
            objArrPullLastBuffer = pullLastBuffer((Object[]) obj, shift - 5, rootSize, tailCarry);
        }
        if (objArrPullLastBuffer == null && iIndexSegment == 0) {
            return null;
        }
        Object[] objArrMakeMutable = makeMutable(root);
        objArrMakeMutable[iIndexSegment] = objArrPullLastBuffer;
        return objArrMakeMutable;
    }

    private final void pullLastBufferFromRoot(Object[] root, int rootSize, int shift) {
        if (shift == 0) {
            this.root = null;
            if (root == null) {
                root = new Object[0];
            }
            this.tail = root;
            this.size = rootSize;
            this.rootShift = shift;
            return;
        }
        ObjectRef objectRef = new ObjectRef(null);
        p.h(root);
        Object[] objArrPullLastBuffer = pullLastBuffer(root, shift, rootSize, objectRef);
        p.h(objArrPullLastBuffer);
        Object value = objectRef.getValue();
        if (value == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        this.tail = (Object[]) value;
        this.size = rootSize;
        if (objArrPullLastBuffer[1] == null) {
            this.root = (Object[]) objArrPullLastBuffer[0];
            this.rootShift = shift - 5;
        } else {
            this.root = objArrPullLastBuffer;
            this.rootShift = shift;
        }
    }

    private final Object[] pushBuffers(Object[] root, int rootSize, int shift, Iterator<Object[]> buffersIterator) {
        if (!buffersIterator.hasNext()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(shift >= 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (shift == 0) {
            return buffersIterator.next();
        }
        Object[] objArrMakeMutable = makeMutable(root);
        int iIndexSegment = UtilsKt.indexSegment(rootSize, shift);
        int i10 = shift - 5;
        objArrMakeMutable[iIndexSegment] = pushBuffers((Object[]) objArrMakeMutable[iIndexSegment], rootSize, i10, buffersIterator);
        while (true) {
            iIndexSegment++;
            if (iIndexSegment >= 32 || !buffersIterator.hasNext()) {
                break;
            }
            objArrMakeMutable[iIndexSegment] = pushBuffers((Object[]) objArrMakeMutable[iIndexSegment], 0, i10, buffersIterator);
        }
        return objArrMakeMutable;
    }

    private final Object[] pushBuffersIncreasingHeightIfNeeded(Object[] root, int rootSize, Object[][] buffers) {
        Iterator<Object[]> itA = b.a(buffers);
        int i10 = rootSize >> 5;
        int i11 = this.rootShift;
        Object[] objArrPushBuffers = i10 < (1 << i11) ? pushBuffers(root, rootSize, i11, itA) : makeMutable(root);
        while (itA.hasNext()) {
            this.rootShift += 5;
            objArrPushBuffers = mutableBufferWith(objArrPushBuffers);
            int i12 = this.rootShift;
            pushBuffers(objArrPushBuffers, 1 << i12, i12, itA);
        }
        return objArrPushBuffers;
    }

    private final void pushFilledTail(Object[] root, Object[] filledTail, Object[] newTail) {
        int size = size() >> 5;
        int i10 = this.rootShift;
        if (size > (1 << i10)) {
            this.root = pushTail(mutableBufferWith(root), filledTail, this.rootShift + 5);
            this.tail = newTail;
            this.rootShift += 5;
            this.size = size() + 1;
            return;
        }
        if (root == null) {
            this.root = filledTail;
            this.tail = newTail;
            this.size = size() + 1;
        } else {
            this.root = pushTail(root, filledTail, i10);
            this.tail = newTail;
            this.size = size() + 1;
        }
    }

    private final Object[] pushTail(Object[] root, Object[] tail, int shift) {
        int iIndexSegment = UtilsKt.indexSegment(size() - 1, shift);
        Object[] objArrMakeMutable = makeMutable(root);
        if (shift == 5) {
            objArrMakeMutable[iIndexSegment] = tail;
        } else {
            objArrMakeMutable[iIndexSegment] = pushTail((Object[]) objArrMakeMutable[iIndexSegment], tail, shift - 5);
        }
        return objArrMakeMutable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int recyclableRemoveAll(l<? super E, Boolean> predicate, Object[] buffer, int bufferSize, int toBufferSize, ObjectRef bufferRef, List<Object[]> recyclableBuffers, List<Object[]> buffers) {
        if (isMutable(buffer)) {
            recyclableBuffers.add(buffer);
        }
        Object value = bufferRef.getValue();
        if (value == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        Object[] objArr = (Object[]) value;
        Object[] objArrRemove = objArr;
        for (int i10 = 0; i10 < bufferSize; i10++) {
            Object obj = buffer[i10];
            if (!predicate.invoke(obj).booleanValue()) {
                if (toBufferSize == 32) {
                    objArrRemove = recyclableBuffers.isEmpty() ^ true ? recyclableBuffers.remove(recyclableBuffers.size() - 1) : mutableBuffer();
                    toBufferSize = 0;
                }
                objArrRemove[toBufferSize] = obj;
                toBufferSize++;
            }
        }
        bufferRef.setValue(objArrRemove);
        if (objArr != bufferRef.getValue()) {
            buffers.add(objArr);
        }
        return toBufferSize;
    }

    private final int removeAll(l<? super E, Boolean> predicate, Object[] buffer, int bufferSize, ObjectRef bufferRef) {
        Object[] objArrMakeMutable = buffer;
        int i10 = bufferSize;
        boolean z10 = false;
        for (int i11 = 0; i11 < bufferSize; i11++) {
            Object obj = buffer[i11];
            if (predicate.invoke(obj).booleanValue()) {
                if (!z10) {
                    objArrMakeMutable = makeMutable(buffer);
                    z10 = true;
                    i10 = i11;
                }
            } else if (z10) {
                objArrMakeMutable[i10] = obj;
                i10++;
            }
        }
        bufferRef.setValue(objArrMakeMutable);
        return i10;
    }

    private final boolean removeAll(l<? super E, Boolean> lVar) {
        Object[] objArrPushBuffers;
        int iTailSize = tailSize();
        ObjectRef objectRef = new ObjectRef(null);
        if (this.root == null) {
            return removeAllFromTail(lVar, iTailSize, objectRef) != iTailSize;
        }
        ListIterator<Object[]> listIteratorLeafBufferIterator = leafBufferIterator(0);
        int iRemoveAll = 32;
        while (iRemoveAll == 32 && listIteratorLeafBufferIterator.hasNext()) {
            iRemoveAll = removeAll(lVar, listIteratorLeafBufferIterator.next(), 32, objectRef);
        }
        if (iRemoveAll == 32) {
            CommonFunctionsKt.m1286assert(!listIteratorLeafBufferIterator.hasNext());
            int iRemoveAllFromTail = removeAllFromTail(lVar, iTailSize, objectRef);
            if (iRemoveAllFromTail == 0) {
                pullLastBufferFromRoot(this.root, size(), this.rootShift);
            }
            return iRemoveAllFromTail != iTailSize;
        }
        int iPreviousIndex = listIteratorLeafBufferIterator.previousIndex() << 5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iRecyclableRemoveAll = iRemoveAll;
        while (listIteratorLeafBufferIterator.hasNext()) {
            iRecyclableRemoveAll = recyclableRemoveAll(lVar, listIteratorLeafBufferIterator.next(), 32, iRecyclableRemoveAll, objectRef, arrayList2, arrayList);
            iPreviousIndex = iPreviousIndex;
        }
        int i10 = iPreviousIndex;
        int iRecyclableRemoveAll2 = recyclableRemoveAll(lVar, this.tail, iTailSize, iRecyclableRemoveAll, objectRef, arrayList2, arrayList);
        Object value = objectRef.getValue();
        if (value == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        Object[] objArr = (Object[]) value;
        cn.p.v(objArr, null, iRecyclableRemoveAll2, 32);
        if (arrayList.isEmpty()) {
            objArrPushBuffers = this.root;
            p.h(objArrPushBuffers);
        } else {
            objArrPushBuffers = pushBuffers(this.root, i10, this.rootShift, arrayList.iterator());
        }
        int size = i10 + (arrayList.size() << 5);
        this.root = retainFirst(objArrPushBuffers, size);
        this.tail = objArr;
        this.size = size + iRecyclableRemoveAll2;
        return true;
    }

    private final int removeAllFromTail(l<? super E, Boolean> lVar, int i10, ObjectRef objectRef) {
        int iRemoveAll = removeAll(lVar, this.tail, i10, objectRef);
        if (iRemoveAll == i10) {
            CommonFunctionsKt.m1286assert(objectRef.getValue() == this.tail);
            return i10;
        }
        Object value = objectRef.getValue();
        if (value == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        Object[] objArr = (Object[]) value;
        cn.p.v(objArr, null, iRemoveAll, i10);
        this.tail = objArr;
        this.size = size() - (i10 - iRemoveAll);
        return iRemoveAll;
    }

    private final Object[] removeFromRootAt(Object[] root, int shift, int index, ObjectRef tailCarry) {
        int iIndexSegment = UtilsKt.indexSegment(index, shift);
        if (shift == 0) {
            Object obj = root[iIndexSegment];
            Object[] objArrL = cn.p.l(root, makeMutable(root), iIndexSegment, iIndexSegment + 1, 32);
            objArrL[31] = tailCarry.getValue();
            tailCarry.setValue(obj);
            return objArrL;
        }
        int iIndexSegment2 = root[31] == null ? UtilsKt.indexSegment(rootSize() - 1, shift) : 31;
        Object[] objArrMakeMutable = makeMutable(root);
        int i10 = shift - 5;
        int i11 = iIndexSegment + 1;
        if (i11 <= iIndexSegment2) {
            while (true) {
                Object obj2 = objArrMakeMutable[iIndexSegment2];
                if (obj2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                }
                objArrMakeMutable[iIndexSegment2] = removeFromRootAt((Object[]) obj2, i10, 0, tailCarry);
                if (iIndexSegment2 == i11) {
                    break;
                }
                iIndexSegment2--;
            }
        }
        Object obj3 = objArrMakeMutable[iIndexSegment];
        if (obj3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        objArrMakeMutable[iIndexSegment] = removeFromRootAt((Object[]) obj3, i10, index, tailCarry);
        return objArrMakeMutable;
    }

    private final Object removeFromTailAt(Object[] root, int rootSize, int shift, int index) {
        int size = size() - rootSize;
        CommonFunctionsKt.m1286assert(index < size);
        if (size == 1) {
            Object obj = this.tail[0];
            pullLastBufferFromRoot(root, rootSize, shift);
            return obj;
        }
        Object[] objArr = this.tail;
        Object obj2 = objArr[index];
        Object[] objArrL = cn.p.l(objArr, makeMutable(objArr), index, index + 1, size);
        objArrL[size - 1] = null;
        this.root = root;
        this.tail = objArrL;
        this.size = (rootSize + size) - 1;
        this.rootShift = shift;
        return obj2;
    }

    private final Object[] retainFirst(Object[] root, int size) {
        if (!((size & 31) == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (size == 0) {
            this.rootShift = 0;
            return null;
        }
        int i10 = size - 1;
        while (true) {
            int i11 = this.rootShift;
            if ((i10 >> i11) != 0) {
                return nullifyAfter(root, i10, i11);
            }
            this.rootShift = i11 - 5;
            Object[] objArr = root[0];
            if (objArr == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
            root = objArr;
        }
    }

    private final int rootSize() {
        if (size() <= 32) {
            return 0;
        }
        return UtilsKt.rootSize(size());
    }

    private final Object[] setInRoot(Object[] root, int shift, int index, E e10, ObjectRef oldElementCarry) {
        int iIndexSegment = UtilsKt.indexSegment(index, shift);
        Object[] objArrMakeMutable = makeMutable(root);
        if (shift == 0) {
            if (objArrMakeMutable != root) {
                ((AbstractList) this).modCount++;
            }
            oldElementCarry.setValue(objArrMakeMutable[iIndexSegment]);
            objArrMakeMutable[iIndexSegment] = e10;
            return objArrMakeMutable;
        }
        Object obj = objArrMakeMutable[iIndexSegment];
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        objArrMakeMutable[iIndexSegment] = setInRoot((Object[]) obj, shift - 5, index, e10, oldElementCarry);
        return objArrMakeMutable;
    }

    private final Object[] shiftLeafBuffers(int startLeafIndex, int rightShift, Object[][] buffers, int nullBuffers, Object[] nextBuffer) {
        if (this.root == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        ListIterator<Object[]> listIteratorLeafBufferIterator = leafBufferIterator(rootSize() >> 5);
        while (listIteratorLeafBufferIterator.previousIndex() != startLeafIndex) {
            Object[] objArrPrevious = listIteratorLeafBufferIterator.previous();
            cn.p.l(objArrPrevious, nextBuffer, 0, 32 - rightShift, 32);
            nextBuffer = makeMutableShiftingRight(objArrPrevious, rightShift);
            nullBuffers--;
            buffers[nullBuffers] = nextBuffer;
        }
        return listIteratorLeafBufferIterator.previous();
    }

    private final void splitToBuffers(Collection<? extends E> elements, int index, Object[] startBuffer, int startBufferSize, Object[][] buffers, int nullBuffers, Object[] nextBuffer) {
        Object[] objArrMutableBuffer;
        if (!(nullBuffers >= 1)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        Object[] objArrMakeMutable = makeMutable(startBuffer);
        buffers[0] = objArrMakeMutable;
        int i10 = index & 31;
        int size = ((index + elements.size()) - 1) & 31;
        int i11 = (startBufferSize - i10) + size;
        if (i11 < 32) {
            cn.p.l(objArrMakeMutable, nextBuffer, size + 1, i10, startBufferSize);
        } else {
            int i12 = (i11 - 32) + 1;
            if (nullBuffers == 1) {
                objArrMutableBuffer = objArrMakeMutable;
            } else {
                objArrMutableBuffer = mutableBuffer();
                nullBuffers--;
                buffers[nullBuffers] = objArrMutableBuffer;
            }
            int i13 = startBufferSize - i12;
            cn.p.l(objArrMakeMutable, nextBuffer, 0, i13, startBufferSize);
            cn.p.l(objArrMakeMutable, objArrMutableBuffer, size + 1, i10, i13);
            nextBuffer = objArrMutableBuffer;
        }
        Iterator<? extends E> it = elements.iterator();
        copyToBuffer(objArrMakeMutable, i10, it);
        for (int i14 = 1; i14 < nullBuffers; i14++) {
            buffers[i14] = copyToBuffer(mutableBuffer(), 0, it);
        }
        copyToBuffer(nextBuffer, 0, it);
    }

    private final int tailSize() {
        return tailSize(size());
    }

    private final int tailSize(int size) {
        return size <= 32 ? size : size - UtilsKt.rootSize(size);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // cn.h, java.util.AbstractList, java.util.List
    public void add(int index, E element) {
        ListImplementation.checkPositionIndex$runtime_release(index, size());
        if (index == size()) {
            add(element);
            return;
        }
        ((AbstractList) this).modCount++;
        int iRootSize = rootSize();
        if (index >= iRootSize) {
            insertIntoTail(this.root, index - iRootSize, element);
            return;
        }
        ObjectRef objectRef = new ObjectRef(null);
        Object[] objArr = this.root;
        p.h(objArr);
        insertIntoTail(insertIntoRoot(objArr, this.rootShift, index, element, objectRef), 0, objectRef.getValue());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E element) {
        ((AbstractList) this).modCount++;
        int iTailSize = tailSize();
        if (iTailSize < 32) {
            Object[] objArrMakeMutable = makeMutable(this.tail);
            objArrMakeMutable[iTailSize] = element;
            this.tail = objArrMakeMutable;
            this.size = size() + 1;
        } else {
            pushFilledTail(this.root, this.tail, mutableBufferWith(element));
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int index, @NotNull Collection<? extends E> elements) {
        Object[] objArrL;
        p.k(elements, "elements");
        ListImplementation.checkPositionIndex$runtime_release(index, size());
        if (index == size()) {
            return addAll(elements);
        }
        if (elements.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i10 = (index >> 5) << 5;
        int size = (((size() - i10) + elements.size()) - 1) / 32;
        if (size == 0) {
            CommonFunctionsKt.m1286assert(index >= rootSize());
            int i11 = index & 31;
            int size2 = ((index + elements.size()) - 1) & 31;
            Object[] objArr = this.tail;
            Object[] objArrL2 = cn.p.l(objArr, makeMutable(objArr), size2 + 1, i11, tailSize());
            copyToBuffer(objArrL2, i11, elements.iterator());
            this.tail = objArrL2;
            this.size = size() + elements.size();
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iTailSize = tailSize();
        int iTailSize2 = tailSize(size() + elements.size());
        if (index >= rootSize()) {
            objArrL = mutableBuffer();
            splitToBuffers(elements, index, this.tail, iTailSize, objArr2, size, objArrL);
        } else if (iTailSize2 > iTailSize) {
            int i12 = iTailSize2 - iTailSize;
            objArrL = makeMutableShiftingRight(this.tail, i12);
            insertIntoRoot(elements, index, i12, objArr2, size, objArrL);
        } else {
            int i13 = iTailSize - iTailSize2;
            objArrL = cn.p.l(this.tail, mutableBuffer(), 0, i13, iTailSize);
            int i14 = 32 - i13;
            Object[] objArrMakeMutableShiftingRight = makeMutableShiftingRight(this.tail, i14);
            int i15 = size - 1;
            objArr2[i15] = objArrMakeMutableShiftingRight;
            insertIntoRoot(elements, index, i14, objArr2, i15, objArrMakeMutableShiftingRight);
        }
        this.root = pushBuffersIncreasingHeightIfNeeded(this.root, i10, objArr2);
        this.tail = objArrL;
        this.size = size() + elements.size();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@NotNull Collection<? extends E> elements) {
        p.k(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iTailSize = tailSize();
        Iterator<? extends E> it = elements.iterator();
        if (32 - iTailSize >= elements.size()) {
            this.tail = copyToBuffer(makeMutable(this.tail), iTailSize, it);
            this.size = size() + elements.size();
        } else {
            int size = ((elements.size() + iTailSize) - 1) / 32;
            Object[][] objArr = new Object[size][];
            objArr[0] = copyToBuffer(makeMutable(this.tail), iTailSize, it);
            for (int i10 = 1; i10 < size; i10++) {
                objArr[i10] = copyToBuffer(mutableBuffer(), 0, it);
            }
            this.root = pushBuffersIncreasingHeightIfNeeded(this.root, rootSize(), objArr);
            this.tail = copyToBuffer(mutableBuffer(), 0, it);
            this.size = size() + elements.size();
        }
        return true;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder
    @NotNull
    public PersistentList<E> build() {
        PersistentVector persistentVector;
        if (this.root == this.vectorRoot && this.tail == this.vectorTail) {
            persistentVector = this.vector;
        } else {
            this.ownership = new MutabilityOwnership();
            Object[] objArr = this.root;
            this.vectorRoot = objArr;
            Object[] objArr2 = this.tail;
            this.vectorTail = objArr2;
            if (objArr == null) {
                if (objArr2.length == 0) {
                    persistentVector = UtilsKt.persistentVectorOf();
                } else {
                    Object[] objArrCopyOf = Arrays.copyOf(this.tail, size());
                    p.j(objArrCopyOf, "copyOf(this, newSize)");
                    persistentVector = new SmallPersistentVector(objArrCopyOf);
                }
            } else {
                Object[] objArr3 = this.root;
                p.h(objArr3);
                persistentVector = new PersistentVector(objArr3, this.tail, size(), this.rootShift);
            }
        }
        this.vector = persistentVector;
        return (PersistentList<E>) persistentVector;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int index) {
        ListImplementation.checkElementIndex$runtime_release(index, size());
        return (E) bufferFor(index)[index & 31];
    }

    public final int getModCount$runtime_release() {
        return ((AbstractList) this).modCount;
    }

    @Nullable
    /* JADX INFO: renamed from: getRoot$runtime_release, reason: from getter */
    public final Object[] getRoot() {
        return this.root;
    }

    /* JADX INFO: renamed from: getRootShift$runtime_release, reason: from getter */
    public final int getRootShift() {
        return this.rootShift;
    }

    @Override // cn.h
    public int getSize() {
        return this.size;
    }

    @NotNull
    /* JADX INFO: renamed from: getTail$runtime_release, reason: from getter */
    public final Object[] getTail() {
        return this.tail;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<E> iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<E> listIterator(int index) {
        ListImplementation.checkPositionIndex$runtime_release(index, size());
        return new PersistentVectorMutableIterator(this, index);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@NotNull final Collection<? extends Object> elements) {
        p.k(elements, "elements");
        return removeAllWithPredicate(new l<E, Boolean>() { // from class: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder.removeAll.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(E e10) {
                return Boolean.valueOf(elements.contains(e10));
            }
        });
    }

    public final boolean removeAllWithPredicate(@NotNull l<? super E, Boolean> lVar) {
        p.k(lVar, "predicate");
        boolean zRemoveAll = removeAll(lVar);
        if (zRemoveAll) {
            ((AbstractList) this).modCount++;
        }
        return zRemoveAll;
    }

    @Override // cn.h
    public E removeAt(int index) {
        ListImplementation.checkElementIndex$runtime_release(index, size());
        ((AbstractList) this).modCount++;
        int iRootSize = rootSize();
        if (index >= iRootSize) {
            return (E) removeFromTailAt(this.root, iRootSize, this.rootShift, index - iRootSize);
        }
        ObjectRef objectRef = new ObjectRef(this.tail[0]);
        Object[] objArr = this.root;
        p.h(objArr);
        removeFromTailAt(removeFromRootAt(objArr, this.rootShift, index, objectRef), iRootSize, this.rootShift, 0);
        return (E) objectRef.getValue();
    }

    @Override // cn.h, java.util.AbstractList, java.util.List
    public E set(int index, E element) {
        ListImplementation.checkElementIndex$runtime_release(index, size());
        if (rootSize() > index) {
            ObjectRef objectRef = new ObjectRef(null);
            Object[] objArr = this.root;
            p.h(objArr);
            this.root = setInRoot(objArr, this.rootShift, index, element, objectRef);
            return (E) objectRef.getValue();
        }
        Object[] objArrMakeMutable = makeMutable(this.tail);
        if (objArrMakeMutable != this.tail) {
            ((AbstractList) this).modCount++;
        }
        int i10 = index & 31;
        E e10 = (E) objArrMakeMutable[i10];
        objArrMakeMutable[i10] = element;
        this.tail = objArrMakeMutable;
        return e10;
    }

    public final void setRootShift$runtime_release(int i10) {
        this.rootShift = i10;
    }
}
