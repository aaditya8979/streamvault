package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.Internal;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.WireFormat;
import com.google.protobuf.Writer;
import com.google.protobuf.c;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: MessageSchema.java */
/* JADX INFO: loaded from: classes11.dex */
public final class a0<T> implements l0<T> {
    private static final int CHECK_INITIALIZED_BIT = 1024;
    private static final int ENFORCE_UTF8_MASK = 536870912;
    private static final int FIELD_TYPE_MASK = 267386880;
    private static final int HAS_HAS_BIT = 4096;
    private static final int INTS_PER_FIELD = 3;
    private static final int LEGACY_ENUM_IS_CLOSED_BIT = 2048;
    private static final int LEGACY_ENUM_IS_CLOSED_MASK = Integer.MIN_VALUE;
    private static final int NO_PRESENCE_SENTINEL = 1048575;
    private static final int OFFSET_BITS = 20;
    private static final int OFFSET_MASK = 1048575;
    public static final int ONEOF_TYPE_OFFSET = 51;
    private static final int REQUIRED_BIT = 256;
    private static final int REQUIRED_MASK = 268435456;
    private static final int UTF8_CHECK_BIT = 512;
    private final int[] buffer;
    private final int checkInitializedCount;
    private final MessageLite defaultInstance;
    private final j<?> extensionSchema;
    private final boolean hasExtensions;
    private final int[] intArray;
    private final r listFieldSchema;
    private final boolean lite;
    private final u mapFieldSchema;
    private final int maxFieldNumber;
    private final int minFieldNumber;
    private final c0 newInstanceSchema;
    private final Object[] objects;
    private final int repeatedFieldOffsetStart;
    private final ProtoSyntax syntax;
    private final q0<?, ?> unknownFieldSchema;
    private final boolean useCachedSizeField;
    private static final int[] EMPTY_INT_ARRAY = new int[0];
    private static final Unsafe UNSAFE = s0.getUnsafe();

    /* JADX INFO: compiled from: MessageSchema.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.MESSAGE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private a0(int[] iArr, Object[] objArr, int i10, int i11, MessageLite messageLite, ProtoSyntax protoSyntax, boolean z10, int[] iArr2, int i12, int i13, c0 c0Var, r rVar, q0<?, ?> q0Var, j<?> jVar, u uVar) {
        this.buffer = iArr;
        this.objects = objArr;
        this.minFieldNumber = i10;
        this.maxFieldNumber = i11;
        this.lite = messageLite instanceof GeneratedMessageLite;
        this.syntax = protoSyntax;
        this.hasExtensions = jVar != null && jVar.hasExtensions(messageLite);
        this.useCachedSizeField = z10;
        this.intArray = iArr2;
        this.checkInitializedCount = i12;
        this.repeatedFieldOffsetStart = i13;
        this.newInstanceSchema = c0Var;
        this.listFieldSchema = rVar;
        this.unknownFieldSchema = q0Var;
        this.extensionSchema = jVar;
        this.defaultInstance = messageLite;
        this.mapFieldSchema = uVar;
    }

    private boolean arePresentForEquals(T t10, T t11, int i10) {
        return isFieldPresent(t10, i10) == isFieldPresent(t11, i10);
    }

    private static <T> boolean booleanAt(T t10, long j10) {
        return s0.getBoolean(t10, j10);
    }

    private static void checkMutable(Object obj) {
        if (isMutable(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <K, V> int decodeMapEntry(byte[] bArr, int i10, int i11, MapEntryLite.b<K, V> bVar, Map<K, V> map, c.b bVar2) throws IOException {
        int iDecodeVarint32;
        int iDecodeVarint322 = c.decodeVarint32(bArr, i10, bVar2);
        int i12 = bVar2.int1;
        if (i12 < 0 || i12 > i11 - iDecodeVarint322) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i13 = iDecodeVarint322 + i12;
        Object obj = bVar.defaultKey;
        Object obj2 = bVar.defaultValue;
        while (iDecodeVarint322 < i13) {
            int i14 = iDecodeVarint322 + 1;
            int i15 = bArr[iDecodeVarint322];
            if (i15 < 0) {
                iDecodeVarint32 = c.decodeVarint32(i15, bArr, i14, bVar2);
                i15 = bVar2.int1;
            } else {
                iDecodeVarint32 = i14;
            }
            int i16 = i15 >>> 3;
            int i17 = i15 & 7;
            if (i16 != 1) {
                if (i16 == 2 && i17 == bVar.valueType.getWireType()) {
                    iDecodeVarint322 = decodeMapEntryValue(bArr, iDecodeVarint32, i11, bVar.valueType, bVar.defaultValue.getClass(), bVar2);
                    obj2 = bVar2.object1;
                } else {
                    iDecodeVarint322 = c.skipField(i15, bArr, iDecodeVarint32, i11, bVar2);
                }
            } else if (i17 == bVar.keyType.getWireType()) {
                iDecodeVarint322 = decodeMapEntryValue(bArr, iDecodeVarint32, i11, bVar.keyType, null, bVar2);
                obj = bVar2.object1;
            } else {
                iDecodeVarint322 = c.skipField(i15, bArr, iDecodeVarint32, i11, bVar2);
            }
        }
        if (iDecodeVarint322 != i13) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        map.put(obj, obj2);
        return i13;
    }

    private int decodeMapEntryValue(byte[] bArr, int i10, int i11, WireFormat.FieldType fieldType, Class<?> cls, c.b bVar) throws IOException {
        switch (a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                int iDecodeVarint64 = c.decodeVarint64(bArr, i10, bVar);
                bVar.object1 = Boolean.valueOf(bVar.long1 != 0);
                return iDecodeVarint64;
            case 2:
                return c.decodeBytes(bArr, i10, bVar);
            case 3:
                bVar.object1 = Double.valueOf(c.decodeDouble(bArr, i10));
                return i10 + 8;
            case 4:
            case 5:
                bVar.object1 = Integer.valueOf(c.decodeFixed32(bArr, i10));
                return i10 + 4;
            case 6:
            case 7:
                bVar.object1 = Long.valueOf(c.decodeFixed64(bArr, i10));
                return i10 + 8;
            case 8:
                bVar.object1 = Float.valueOf(c.decodeFloat(bArr, i10));
                return i10 + 4;
            case 9:
            case 10:
            case 11:
                int iDecodeVarint32 = c.decodeVarint32(bArr, i10, bVar);
                bVar.object1 = Integer.valueOf(bVar.int1);
                return iDecodeVarint32;
            case 12:
            case 13:
                int iDecodeVarint642 = c.decodeVarint64(bArr, i10, bVar);
                bVar.object1 = Long.valueOf(bVar.long1);
                return iDecodeVarint642;
            case 14:
                return c.decodeMessageField(h0.getInstance().schemaFor((Class) cls), bArr, i10, i11, bVar);
            case 15:
                int iDecodeVarint322 = c.decodeVarint32(bArr, i10, bVar);
                bVar.object1 = Integer.valueOf(CodedInputStream.decodeZigZag32(bVar.int1));
                return iDecodeVarint322;
            case 16:
                int iDecodeVarint643 = c.decodeVarint64(bArr, i10, bVar);
                bVar.object1 = Long.valueOf(CodedInputStream.decodeZigZag64(bVar.long1));
                return iDecodeVarint643;
            case 17:
                return c.decodeStringRequireUtf8(bArr, i10, bVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static <T> double doubleAt(T t10, long j10) {
        return s0.getDouble(t10, j10);
    }

    private boolean equals(T t10, T t11, int i10) {
        int iTypeAndOffsetAt = typeAndOffsetAt(i10);
        long jOffset = offset(iTypeAndOffsetAt);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                if (arePresentForEquals(t10, t11, i10) && Double.doubleToLongBits(s0.getDouble(t10, jOffset)) == Double.doubleToLongBits(s0.getDouble(t11, jOffset))) {
                    break;
                }
                break;
            case 1:
                if (arePresentForEquals(t10, t11, i10) && Float.floatToIntBits(s0.getFloat(t10, jOffset)) == Float.floatToIntBits(s0.getFloat(t11, jOffset))) {
                    break;
                }
                break;
            case 2:
                if (arePresentForEquals(t10, t11, i10) && s0.getLong(t10, jOffset) == s0.getLong(t11, jOffset)) {
                    break;
                }
                break;
            case 3:
                if (arePresentForEquals(t10, t11, i10) && s0.getLong(t10, jOffset) == s0.getLong(t11, jOffset)) {
                    break;
                }
                break;
            case 4:
                if (arePresentForEquals(t10, t11, i10) && s0.getInt(t10, jOffset) == s0.getInt(t11, jOffset)) {
                    break;
                }
                break;
            case 5:
                if (arePresentForEquals(t10, t11, i10) && s0.getLong(t10, jOffset) == s0.getLong(t11, jOffset)) {
                    break;
                }
                break;
            case 6:
                if (arePresentForEquals(t10, t11, i10) && s0.getInt(t10, jOffset) == s0.getInt(t11, jOffset)) {
                    break;
                }
                break;
            case 7:
                if (arePresentForEquals(t10, t11, i10) && s0.getBoolean(t10, jOffset) == s0.getBoolean(t11, jOffset)) {
                    break;
                }
                break;
            case 8:
                if (arePresentForEquals(t10, t11, i10) && n0.safeEquals(s0.getObject(t10, jOffset), s0.getObject(t11, jOffset))) {
                    break;
                }
                break;
            case 9:
                if (arePresentForEquals(t10, t11, i10) && n0.safeEquals(s0.getObject(t10, jOffset), s0.getObject(t11, jOffset))) {
                    break;
                }
                break;
            case 10:
                if (arePresentForEquals(t10, t11, i10) && n0.safeEquals(s0.getObject(t10, jOffset), s0.getObject(t11, jOffset))) {
                    break;
                }
                break;
            case 11:
                if (arePresentForEquals(t10, t11, i10) && s0.getInt(t10, jOffset) == s0.getInt(t11, jOffset)) {
                    break;
                }
                break;
            case 12:
                if (arePresentForEquals(t10, t11, i10) && s0.getInt(t10, jOffset) == s0.getInt(t11, jOffset)) {
                    break;
                }
                break;
            case 13:
                if (arePresentForEquals(t10, t11, i10) && s0.getInt(t10, jOffset) == s0.getInt(t11, jOffset)) {
                    break;
                }
                break;
            case 14:
                if (arePresentForEquals(t10, t11, i10) && s0.getLong(t10, jOffset) == s0.getLong(t11, jOffset)) {
                    break;
                }
                break;
            case 15:
                if (arePresentForEquals(t10, t11, i10) && s0.getInt(t10, jOffset) == s0.getInt(t11, jOffset)) {
                    break;
                }
                break;
            case 16:
                if (arePresentForEquals(t10, t11, i10) && s0.getLong(t10, jOffset) == s0.getLong(t11, jOffset)) {
                    break;
                }
                break;
            case 17:
                if (arePresentForEquals(t10, t11, i10) && n0.safeEquals(s0.getObject(t10, jOffset), s0.getObject(t11, jOffset))) {
                    break;
                }
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                if (isOneofCaseEqual(t10, t11, i10) && n0.safeEquals(s0.getObject(t10, jOffset), s0.getObject(t11, jOffset))) {
                    break;
                }
                break;
        }
        return true;
    }

    private <UT, UB> UB filterMapUnknownEnumValues(Object obj, int i10, UB ub2, q0<UT, UB> q0Var, Object obj2) {
        Internal.EnumVerifier enumFieldVerifier;
        int iNumberAt = numberAt(i10);
        Object object = s0.getObject(obj, offset(typeAndOffsetAt(i10)));
        return (object == null || (enumFieldVerifier = getEnumFieldVerifier(i10)) == null) ? ub2 : (UB) filterUnknownEnumMap(i10, iNumberAt, this.mapFieldSchema.forMutableMapData(object), enumFieldVerifier, ub2, q0Var, obj2);
    }

    private <K, V, UT, UB> UB filterUnknownEnumMap(int i10, int i11, Map<K, V> map, Internal.EnumVerifier enumVerifier, UB ub2, q0<UT, UB> q0Var, Object obj) {
        MapEntryLite.b<?, ?> bVarForMapMetadata = this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!enumVerifier.isInRange(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = q0Var.getBuilderFromMessage(obj);
                }
                ByteString.f fVarNewCodedBuilder = ByteString.newCodedBuilder(MapEntryLite.computeSerializedSize(bVarForMapMetadata, next.getKey(), next.getValue()));
                try {
                    MapEntryLite.writeTo(fVarNewCodedBuilder.getCodedOutput(), bVarForMapMetadata, next.getKey(), next.getValue());
                    q0Var.addLengthDelimited(ub2, i11, fVarNewCodedBuilder.build());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub2;
    }

    private static <T> float floatAt(T t10, long j10) {
        return s0.getFloat(t10, j10);
    }

    private Internal.EnumVerifier getEnumFieldVerifier(int i10) {
        return (Internal.EnumVerifier) this.objects[((i10 / 3) * 2) + 1];
    }

    private Object getMapFieldDefaultEntry(int i10) {
        return this.objects[(i10 / 3) * 2];
    }

    private l0 getMessageFieldSchema(int i10) {
        int i11 = (i10 / 3) * 2;
        l0 l0Var = (l0) this.objects[i11];
        if (l0Var != null) {
            return l0Var;
        }
        l0<T> l0VarSchemaFor = h0.getInstance().schemaFor((Class) this.objects[i11 + 1]);
        this.objects[i11] = l0VarSchemaFor;
        return l0VarSchemaFor;
    }

    public static UnknownFieldSetLite getMutableUnknownFields(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite != UnknownFieldSetLite.getDefaultInstance()) {
            return unknownFieldSetLite;
        }
        UnknownFieldSetLite unknownFieldSetLiteNewInstance = UnknownFieldSetLite.newInstance();
        generatedMessageLite.unknownFields = unknownFieldSetLiteNewInstance;
        return unknownFieldSetLiteNewInstance;
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(q0<UT, UB> q0Var, T t10) {
        return q0Var.getSerializedSize(q0Var.getFromMessage(t10));
    }

    private static <T> int intAt(T t10, long j10) {
        return s0.getInt(t10, j10);
    }

    private static boolean isEnforceUtf8(int i10) {
        return (i10 & 536870912) != 0;
    }

    private boolean isFieldPresent(T t10, int i10) {
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i10);
        long j10 = 1048575 & iPresenceMaskAndOffsetAt;
        if (j10 != 1048575) {
            return (s0.getInt(t10, j10) & (1 << (iPresenceMaskAndOffsetAt >>> 20))) != 0;
        }
        int iTypeAndOffsetAt = typeAndOffsetAt(i10);
        long jOffset = offset(iTypeAndOffsetAt);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                return Double.doubleToRawLongBits(s0.getDouble(t10, jOffset)) != 0;
            case 1:
                return Float.floatToRawIntBits(s0.getFloat(t10, jOffset)) != 0;
            case 2:
                return s0.getLong(t10, jOffset) != 0;
            case 3:
                return s0.getLong(t10, jOffset) != 0;
            case 4:
                return s0.getInt(t10, jOffset) != 0;
            case 5:
                return s0.getLong(t10, jOffset) != 0;
            case 6:
                return s0.getInt(t10, jOffset) != 0;
            case 7:
                return s0.getBoolean(t10, jOffset);
            case 8:
                Object object = s0.getObject(t10, jOffset);
                if (object instanceof String) {
                    return !((String) object).isEmpty();
                }
                if (object instanceof ByteString) {
                    return !ByteString.EMPTY.equals(object);
                }
                throw new IllegalArgumentException();
            case 9:
                return s0.getObject(t10, jOffset) != null;
            case 10:
                return !ByteString.EMPTY.equals(s0.getObject(t10, jOffset));
            case 11:
                return s0.getInt(t10, jOffset) != 0;
            case 12:
                return s0.getInt(t10, jOffset) != 0;
            case 13:
                return s0.getInt(t10, jOffset) != 0;
            case 14:
                return s0.getLong(t10, jOffset) != 0;
            case 15:
                return s0.getInt(t10, jOffset) != 0;
            case 16:
                return s0.getLong(t10, jOffset) != 0;
            case 17:
                return s0.getObject(t10, jOffset) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private boolean isFieldPresent(T t10, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? isFieldPresent(t10, i10) : (i12 & i13) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isInitialized(Object obj, int i10, l0 l0Var) {
        return l0Var.isInitialized(s0.getObject(obj, offset(i10)));
    }

    private static boolean isLegacyEnumIsClosed(int i10) {
        return (i10 & Integer.MIN_VALUE) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean isListInitialized(Object obj, int i10, int i11) {
        List list = (List) s0.getObject(obj, offset(i10));
        if (list.isEmpty()) {
            return true;
        }
        l0 messageFieldSchema = getMessageFieldSchema(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!messageFieldSchema.isInitialized(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [com.google.protobuf.l0] */
    private boolean isMapInitialized(T t10, int i10, int i11) {
        Map<?, ?> mapForMapData = this.mapFieldSchema.forMapData(s0.getObject(t10, offset(i10)));
        if (mapForMapData.isEmpty()) {
            return true;
        }
        if (this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i11)).valueType.getJavaType() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        ?? SchemaFor = 0;
        for (Object obj : mapForMapData.values()) {
            SchemaFor = SchemaFor;
            if (SchemaFor == 0) {
                SchemaFor = h0.getInstance().schemaFor((Class) obj.getClass());
            }
            if (!SchemaFor.isInitialized(obj)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isMutable(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) obj).isMutable();
        }
        return true;
    }

    private boolean isOneofCaseEqual(T t10, T t11, int i10) {
        long jPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i10) & 1048575;
        return s0.getInt(t10, jPresenceMaskAndOffsetAt) == s0.getInt(t11, jPresenceMaskAndOffsetAt);
    }

    private boolean isOneofPresent(T t10, int i10, int i11) {
        return s0.getInt(t10, (long) (presenceMaskAndOffsetAt(i11) & 1048575)) == i10;
    }

    private static boolean isRequired(int i10) {
        return (i10 & 268435456) != 0;
    }

    private static <T> long longAt(T t10, long j10) {
        return s0.getLong(t10, j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:243:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008b, code lost:
    
        r0 = r18.checkInitializedCount;
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0090, code lost:
    
        if (r0 >= r18.repeatedFieldOffsetStart) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0092, code lost:
    
        r4 = filterMapUnknownEnumValues(r21, r18.intArray[r0], r4, r19, r21);
        r0 = r0 + 1;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a8, code lost:
    
        r11 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a9, code lost:
    
        if (r4 == null) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ab, code lost:
    
        r7.setBuilderToMessage(r11, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ae, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0646 A[Catch: all -> 0x069e, TRY_LEAVE, TryCatch #12 {all -> 0x069e, blocks: (B:156:0x0617, B:167:0x0640, B:169:0x0646, B:179:0x066e, B:180:0x0673), top: B:212:0x0617 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x06af A[LOOP:4: B:199:0x06ab->B:201:0x06af, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x06c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private <UT, UB, ET extends com.google.protobuf.FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(com.google.protobuf.q0<UT, UB> r19, com.google.protobuf.j<ET> r20, T r21, com.google.protobuf.k0 r22, com.google.protobuf.ExtensionRegistryLite r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1878
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.a0.mergeFromHelper(com.google.protobuf.q0, com.google.protobuf.j, java.lang.Object, com.google.protobuf.k0, com.google.protobuf.ExtensionRegistryLite):void");
    }

    private final <K, V> void mergeMap(Object obj, int i10, Object obj2, ExtensionRegistryLite extensionRegistryLite, k0 k0Var) throws IOException {
        long jOffset = offset(typeAndOffsetAt(i10));
        Object object = s0.getObject(obj, jOffset);
        if (object == null) {
            object = this.mapFieldSchema.newMapField(obj2);
            s0.putObject(obj, jOffset, object);
        } else if (this.mapFieldSchema.isImmutable(object)) {
            Object objNewMapField = this.mapFieldSchema.newMapField(obj2);
            this.mapFieldSchema.mergeFrom(objNewMapField, object);
            s0.putObject(obj, jOffset, objNewMapField);
            object = objNewMapField;
        }
        k0Var.readMap(this.mapFieldSchema.forMutableMapData(object), this.mapFieldSchema.forMapMetadata(obj2), extensionRegistryLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeMessage(T t10, T t11, int i10) {
        if (isFieldPresent(t11, i10)) {
            long jOffset = offset(typeAndOffsetAt(i10));
            Unsafe unsafe = UNSAFE;
            Object object = unsafe.getObject(t11, jOffset);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + numberAt(i10) + " is present but null: " + t11);
            }
            l0 messageFieldSchema = getMessageFieldSchema(i10);
            if (!isFieldPresent(t10, i10)) {
                if (isMutable(object)) {
                    Object objNewInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(objNewInstance, object);
                    unsafe.putObject(t10, jOffset, objNewInstance);
                } else {
                    unsafe.putObject(t10, jOffset, object);
                }
                setFieldPresent(t10, i10);
                return;
            }
            Object object2 = unsafe.getObject(t10, jOffset);
            if (!isMutable(object2)) {
                Object objNewInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(t10, jOffset, objNewInstance2);
                object2 = objNewInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeOneofMessage(T t10, T t11, int i10) {
        int iNumberAt = numberAt(i10);
        if (isOneofPresent(t11, iNumberAt, i10)) {
            long jOffset = offset(typeAndOffsetAt(i10));
            Unsafe unsafe = UNSAFE;
            Object object = unsafe.getObject(t11, jOffset);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + numberAt(i10) + " is present but null: " + t11);
            }
            l0 messageFieldSchema = getMessageFieldSchema(i10);
            if (!isOneofPresent(t10, iNumberAt, i10)) {
                if (isMutable(object)) {
                    Object objNewInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(objNewInstance, object);
                    unsafe.putObject(t10, jOffset, objNewInstance);
                } else {
                    unsafe.putObject(t10, jOffset, object);
                }
                setOneofPresent(t10, iNumberAt, i10);
                return;
            }
            Object object2 = unsafe.getObject(t10, jOffset);
            if (!isMutable(object2)) {
                Object objNewInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(t10, jOffset, objNewInstance2);
                object2 = objNewInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    private void mergeSingleField(T t10, T t11, int i10) {
        int iTypeAndOffsetAt = typeAndOffsetAt(i10);
        long jOffset = offset(iTypeAndOffsetAt);
        int iNumberAt = numberAt(i10);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                if (isFieldPresent(t11, i10)) {
                    s0.putDouble(t10, jOffset, s0.getDouble(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 1:
                if (isFieldPresent(t11, i10)) {
                    s0.putFloat(t10, jOffset, s0.getFloat(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 2:
                if (isFieldPresent(t11, i10)) {
                    s0.putLong(t10, jOffset, s0.getLong(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 3:
                if (isFieldPresent(t11, i10)) {
                    s0.putLong(t10, jOffset, s0.getLong(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 4:
                if (isFieldPresent(t11, i10)) {
                    s0.putInt(t10, jOffset, s0.getInt(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 5:
                if (isFieldPresent(t11, i10)) {
                    s0.putLong(t10, jOffset, s0.getLong(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 6:
                if (isFieldPresent(t11, i10)) {
                    s0.putInt(t10, jOffset, s0.getInt(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 7:
                if (isFieldPresent(t11, i10)) {
                    s0.putBoolean(t10, jOffset, s0.getBoolean(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 8:
                if (isFieldPresent(t11, i10)) {
                    s0.putObject(t10, jOffset, s0.getObject(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 9:
                mergeMessage(t10, t11, i10);
                break;
            case 10:
                if (isFieldPresent(t11, i10)) {
                    s0.putObject(t10, jOffset, s0.getObject(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 11:
                if (isFieldPresent(t11, i10)) {
                    s0.putInt(t10, jOffset, s0.getInt(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 12:
                if (isFieldPresent(t11, i10)) {
                    s0.putInt(t10, jOffset, s0.getInt(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 13:
                if (isFieldPresent(t11, i10)) {
                    s0.putInt(t10, jOffset, s0.getInt(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 14:
                if (isFieldPresent(t11, i10)) {
                    s0.putLong(t10, jOffset, s0.getLong(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 15:
                if (isFieldPresent(t11, i10)) {
                    s0.putInt(t10, jOffset, s0.getInt(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 16:
                if (isFieldPresent(t11, i10)) {
                    s0.putLong(t10, jOffset, s0.getLong(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 17:
                mergeMessage(t10, t11, i10);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.listFieldSchema.mergeListsAt(t10, t11, jOffset);
                break;
            case 50:
                n0.mergeMap(this.mapFieldSchema, t10, t11, jOffset);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (isOneofPresent(t11, iNumberAt, i10)) {
                    s0.putObject(t10, jOffset, s0.getObject(t11, jOffset));
                    setOneofPresent(t10, iNumberAt, i10);
                }
                break;
            case 60:
                mergeOneofMessage(t10, t11, i10);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (isOneofPresent(t11, iNumberAt, i10)) {
                    s0.putObject(t10, jOffset, s0.getObject(t11, jOffset));
                    setOneofPresent(t10, iNumberAt, i10);
                }
                break;
            case 68:
                mergeOneofMessage(t10, t11, i10);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object mutableMessageFieldForMerge(T t10, int i10) {
        l0 messageFieldSchema = getMessageFieldSchema(i10);
        long jOffset = offset(typeAndOffsetAt(i10));
        if (!isFieldPresent(t10, i10)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(t10, jOffset);
        if (isMutable(object)) {
            return object;
        }
        Object objNewInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object mutableOneofMessageFieldForMerge(T t10, int i10, int i11) {
        l0 messageFieldSchema = getMessageFieldSchema(i11);
        if (!isOneofPresent(t10, i10, i11)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(t10, offset(typeAndOffsetAt(i11)));
        if (isMutable(object)) {
            return object;
        }
        Object objNewInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    public static <T> a0<T> newSchema(Class<T> cls, x xVar, c0 c0Var, r rVar, q0<?, ?> q0Var, j<?> jVar, u uVar) {
        return xVar instanceof j0 ? newSchemaForRawMessageInfo((j0) xVar, c0Var, rVar, q0Var, jVar, uVar) : newSchemaForMessageInfo((StructuralMessageInfo) xVar, c0Var, rVar, q0Var, jVar, uVar);
    }

    public static <T> a0<T> newSchemaForMessageInfo(StructuralMessageInfo structuralMessageInfo, c0 c0Var, r rVar, q0<?, ?> q0Var, j<?> jVar, u uVar) {
        int fieldNumber;
        int fieldNumber2;
        int i10;
        FieldInfo[] fields = structuralMessageInfo.getFields();
        if (fields.length == 0) {
            fieldNumber = 0;
            fieldNumber2 = 0;
        } else {
            fieldNumber = fields[0].getFieldNumber();
            fieldNumber2 = fields[fields.length - 1].getFieldNumber();
        }
        int length = fields.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        int i11 = 0;
        int i12 = 0;
        for (FieldInfo fieldInfo : fields) {
            if (fieldInfo.getType() == FieldType.MAP) {
                i11++;
            } else if (fieldInfo.getType().id() >= 18 && fieldInfo.getType().id() <= 49) {
                i12++;
            }
        }
        int[] iArr2 = i11 > 0 ? new int[i11] : null;
        int[] iArr3 = i12 > 0 ? new int[i12] : null;
        int[] checkInitialized = structuralMessageInfo.getCheckInitialized();
        if (checkInitialized == null) {
            checkInitialized = EMPTY_INT_ARRAY;
        }
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i13 < fields.length) {
            FieldInfo fieldInfo2 = fields[i13];
            int fieldNumber3 = fieldInfo2.getFieldNumber();
            storeFieldData(fieldInfo2, iArr, i14, objArr);
            if (i15 < checkInitialized.length && checkInitialized[i15] == fieldNumber3) {
                checkInitialized[i15] = i14;
                i15++;
            }
            if (fieldInfo2.getType() == FieldType.MAP) {
                iArr2[i16] = i14;
                i16++;
            } else {
                if (fieldInfo2.getType().id() >= 18 && fieldInfo2.getType().id() <= 49) {
                    i10 = i14;
                    iArr3[i17] = (int) s0.objectFieldOffset(fieldInfo2.getField());
                    i17++;
                }
                i13++;
                i14 = i10 + 3;
            }
            i10 = i14;
            i13++;
            i14 = i10 + 3;
        }
        if (iArr2 == null) {
            iArr2 = EMPTY_INT_ARRAY;
        }
        if (iArr3 == null) {
            iArr3 = EMPTY_INT_ARRAY;
        }
        int[] iArr4 = new int[checkInitialized.length + iArr2.length + iArr3.length];
        System.arraycopy(checkInitialized, 0, iArr4, 0, checkInitialized.length);
        System.arraycopy(iArr2, 0, iArr4, checkInitialized.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, checkInitialized.length + iArr2.length, iArr3.length);
        return new a0<>(iArr, objArr, fieldNumber, fieldNumber2, structuralMessageInfo.getDefaultInstance(), structuralMessageInfo.getSyntax(), true, iArr4, checkInitialized.length, checkInitialized.length + iArr2.length, c0Var, rVar, q0Var, jVar, uVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0265  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> com.google.protobuf.a0<T> newSchemaForRawMessageInfo(com.google.protobuf.j0 r32, com.google.protobuf.c0 r33, com.google.protobuf.r r34, com.google.protobuf.q0<?, ?> r35, com.google.protobuf.j<?> r36, com.google.protobuf.u r37) {
        /*
            Method dump skipped, instruction units count: 989
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.a0.newSchemaForRawMessageInfo(com.google.protobuf.j0, com.google.protobuf.c0, com.google.protobuf.r, com.google.protobuf.q0, com.google.protobuf.j, com.google.protobuf.u):com.google.protobuf.a0");
    }

    private int numberAt(int i10) {
        return this.buffer[i10];
    }

    private static long offset(int i10) {
        return i10 & 1048575;
    }

    private static <T> boolean oneofBooleanAt(T t10, long j10) {
        return ((Boolean) s0.getObject(t10, j10)).booleanValue();
    }

    private static <T> double oneofDoubleAt(T t10, long j10) {
        return ((Double) s0.getObject(t10, j10)).doubleValue();
    }

    private static <T> float oneofFloatAt(T t10, long j10) {
        return ((Float) s0.getObject(t10, j10)).floatValue();
    }

    private static <T> int oneofIntAt(T t10, long j10) {
        return ((Integer) s0.getObject(t10, j10)).intValue();
    }

    private static <T> long oneofLongAt(T t10, long j10) {
        return ((Long) s0.getObject(t10, j10)).longValue();
    }

    private <K, V> int parseMapField(T t10, byte[] bArr, int i10, int i11, int i12, long j10, c.b bVar) throws IOException {
        Unsafe unsafe = UNSAFE;
        Object mapFieldDefaultEntry = getMapFieldDefaultEntry(i12);
        Object object = unsafe.getObject(t10, j10);
        if (this.mapFieldSchema.isImmutable(object)) {
            Object objNewMapField = this.mapFieldSchema.newMapField(mapFieldDefaultEntry);
            this.mapFieldSchema.mergeFrom(objNewMapField, object);
            unsafe.putObject(t10, j10, objNewMapField);
            object = objNewMapField;
        }
        return decodeMapEntry(bArr, i10, i11, this.mapFieldSchema.forMapMetadata(mapFieldDefaultEntry), this.mapFieldSchema.forMutableMapData(object), bVar);
    }

    private int parseOneofField(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, c.b bVar) throws IOException {
        Unsafe unsafe = UNSAFE;
        long j11 = this.buffer[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(t10, j10, Double.valueOf(c.decodeDouble(bArr, i10)));
                int i18 = i10 + 8;
                unsafe.putInt(t10, j11, i13);
                return i18;
            case 52:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(t10, j10, Float.valueOf(c.decodeFloat(bArr, i10)));
                int i19 = i10 + 4;
                unsafe.putInt(t10, j11, i13);
                return i19;
            case 53:
            case 54:
                if (i14 != 0) {
                    return i10;
                }
                int iDecodeVarint64 = c.decodeVarint64(bArr, i10, bVar);
                unsafe.putObject(t10, j10, Long.valueOf(bVar.long1));
                unsafe.putInt(t10, j11, i13);
                return iDecodeVarint64;
            case 55:
            case 62:
                if (i14 != 0) {
                    return i10;
                }
                int iDecodeVarint32 = c.decodeVarint32(bArr, i10, bVar);
                unsafe.putObject(t10, j10, Integer.valueOf(bVar.int1));
                unsafe.putInt(t10, j11, i13);
                return iDecodeVarint32;
            case 56:
            case 65:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(t10, j10, Long.valueOf(c.decodeFixed64(bArr, i10)));
                int i20 = i10 + 8;
                unsafe.putInt(t10, j11, i13);
                return i20;
            case 57:
            case 64:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(t10, j10, Integer.valueOf(c.decodeFixed32(bArr, i10)));
                int i21 = i10 + 4;
                unsafe.putInt(t10, j11, i13);
                return i21;
            case 58:
                if (i14 != 0) {
                    return i10;
                }
                int iDecodeVarint642 = c.decodeVarint64(bArr, i10, bVar);
                unsafe.putObject(t10, j10, Boolean.valueOf(bVar.long1 != 0));
                unsafe.putInt(t10, j11, i13);
                return iDecodeVarint642;
            case 59:
                if (i14 != 2) {
                    return i10;
                }
                int iDecodeVarint322 = c.decodeVarint32(bArr, i10, bVar);
                int i22 = bVar.int1;
                if (i22 == 0) {
                    unsafe.putObject(t10, j10, "");
                } else {
                    if ((i15 & 536870912) != 0 && !Utf8.isValidUtf8(bArr, iDecodeVarint322, iDecodeVarint322 + i22)) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    unsafe.putObject(t10, j10, new String(bArr, iDecodeVarint322, i22, Internal.UTF_8));
                    iDecodeVarint322 += i22;
                }
                unsafe.putInt(t10, j11, i13);
                return iDecodeVarint322;
            case 60:
                if (i14 != 2) {
                    return i10;
                }
                Object objMutableOneofMessageFieldForMerge = mutableOneofMessageFieldForMerge(t10, i13, i17);
                int iMergeMessageField = c.mergeMessageField(objMutableOneofMessageFieldForMerge, getMessageFieldSchema(i17), bArr, i10, i11, bVar);
                storeOneofMessageField(t10, i13, i17, objMutableOneofMessageFieldForMerge);
                return iMergeMessageField;
            case 61:
                if (i14 != 2) {
                    return i10;
                }
                int iDecodeBytes = c.decodeBytes(bArr, i10, bVar);
                unsafe.putObject(t10, j10, bVar.object1);
                unsafe.putInt(t10, j11, i13);
                return iDecodeBytes;
            case 63:
                if (i14 != 0) {
                    return i10;
                }
                int iDecodeVarint323 = c.decodeVarint32(bArr, i10, bVar);
                int i23 = bVar.int1;
                Internal.EnumVerifier enumFieldVerifier = getEnumFieldVerifier(i17);
                if (enumFieldVerifier == null || enumFieldVerifier.isInRange(i23)) {
                    unsafe.putObject(t10, j10, Integer.valueOf(i23));
                    unsafe.putInt(t10, j11, i13);
                } else {
                    getMutableUnknownFields(t10).storeField(i12, Long.valueOf(i23));
                }
                return iDecodeVarint323;
            case 66:
                if (i14 != 0) {
                    return i10;
                }
                int iDecodeVarint324 = c.decodeVarint32(bArr, i10, bVar);
                unsafe.putObject(t10, j10, Integer.valueOf(CodedInputStream.decodeZigZag32(bVar.int1)));
                unsafe.putInt(t10, j11, i13);
                return iDecodeVarint324;
            case 67:
                if (i14 != 0) {
                    return i10;
                }
                int iDecodeVarint643 = c.decodeVarint64(bArr, i10, bVar);
                unsafe.putObject(t10, j10, Long.valueOf(CodedInputStream.decodeZigZag64(bVar.long1)));
                unsafe.putInt(t10, j11, i13);
                return iDecodeVarint643;
            case 68:
                if (i14 != 3) {
                    return i10;
                }
                Object objMutableOneofMessageFieldForMerge2 = mutableOneofMessageFieldForMerge(t10, i13, i17);
                int iMergeGroupField = c.mergeGroupField(objMutableOneofMessageFieldForMerge2, getMessageFieldSchema(i17), bArr, i10, i11, (i12 & (-8)) | 4, bVar);
                storeOneofMessageField(t10, i13, i17, objMutableOneofMessageFieldForMerge2);
                return iMergeGroupField;
            default:
                return i10;
        }
    }

    private int parseRepeatedField(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, c.b bVar) throws IOException {
        int iDecodeVarint32List;
        Unsafe unsafe = UNSAFE;
        Internal.ProtobufList protobufListMutableCopyWithCapacity2 = (Internal.ProtobufList) unsafe.getObject(t10, j11);
        if (!protobufListMutableCopyWithCapacity2.isModifiable()) {
            int size = protobufListMutableCopyWithCapacity2.size();
            protobufListMutableCopyWithCapacity2 = protobufListMutableCopyWithCapacity2.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
            unsafe.putObject(t10, j11, protobufListMutableCopyWithCapacity2);
        }
        switch (i16) {
            case 18:
            case 35:
                return i14 == 2 ? c.decodePackedDoubleList(bArr, i10, protobufListMutableCopyWithCapacity2, bVar) : i14 == 1 ? c.decodeDoubleList(i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, bVar) : i10;
            case 19:
            case 36:
                return i14 == 2 ? c.decodePackedFloatList(bArr, i10, protobufListMutableCopyWithCapacity2, bVar) : i14 == 5 ? c.decodeFloatList(i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, bVar) : i10;
            case 20:
            case 21:
            case 37:
            case 38:
                return i14 == 2 ? c.decodePackedVarint64List(bArr, i10, protobufListMutableCopyWithCapacity2, bVar) : i14 == 0 ? c.decodeVarint64List(i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, bVar) : i10;
            case 22:
            case 29:
            case 39:
            case 43:
                return i14 == 2 ? c.decodePackedVarint32List(bArr, i10, protobufListMutableCopyWithCapacity2, bVar) : i14 == 0 ? c.decodeVarint32List(i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, bVar) : i10;
            case 23:
            case 32:
            case 40:
            case 46:
                return i14 == 2 ? c.decodePackedFixed64List(bArr, i10, protobufListMutableCopyWithCapacity2, bVar) : i14 == 1 ? c.decodeFixed64List(i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, bVar) : i10;
            case 24:
            case 31:
            case 41:
            case 45:
                return i14 == 2 ? c.decodePackedFixed32List(bArr, i10, protobufListMutableCopyWithCapacity2, bVar) : i14 == 5 ? c.decodeFixed32List(i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, bVar) : i10;
            case 25:
            case 42:
                return i14 == 2 ? c.decodePackedBoolList(bArr, i10, protobufListMutableCopyWithCapacity2, bVar) : i14 == 0 ? c.decodeBoolList(i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, bVar) : i10;
            case 26:
                return i14 == 2 ? (j10 & 536870912) == 0 ? c.decodeStringList(i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, bVar) : c.decodeStringListRequireUtf8(i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, bVar) : i10;
            case 27:
                return i14 == 2 ? c.decodeMessageList(getMessageFieldSchema(i15), i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, bVar) : i10;
            case 28:
                return i14 == 2 ? c.decodeBytesList(i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, bVar) : i10;
            case 30:
            case 44:
                if (i14 == 2) {
                    iDecodeVarint32List = c.decodePackedVarint32List(bArr, i10, protobufListMutableCopyWithCapacity2, bVar);
                } else {
                    if (i14 != 0) {
                        return i10;
                    }
                    iDecodeVarint32List = c.decodeVarint32List(i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, bVar);
                }
                n0.filterUnknownEnumList((Object) t10, i13, (List<Integer>) protobufListMutableCopyWithCapacity2, getEnumFieldVerifier(i15), (Object) null, (q0<UT, Object>) this.unknownFieldSchema);
                return iDecodeVarint32List;
            case 33:
            case 47:
                return i14 == 2 ? c.decodePackedSInt32List(bArr, i10, protobufListMutableCopyWithCapacity2, bVar) : i14 == 0 ? c.decodeSInt32List(i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, bVar) : i10;
            case 34:
            case 48:
                return i14 == 2 ? c.decodePackedSInt64List(bArr, i10, protobufListMutableCopyWithCapacity2, bVar) : i14 == 0 ? c.decodeSInt64List(i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, bVar) : i10;
            case 49:
                return i14 == 3 ? c.decodeGroupList(getMessageFieldSchema(i15), i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, bVar) : i10;
            default:
                return i10;
        }
    }

    private int positionForFieldNumber(int i10) {
        if (i10 < this.minFieldNumber || i10 > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i10, 0);
    }

    private int positionForFieldNumber(int i10, int i11) {
        if (i10 < this.minFieldNumber || i10 > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i10, i11);
    }

    private int presenceMaskAndOffsetAt(int i10) {
        return this.buffer[i10 + 2];
    }

    private <E> void readGroupList(Object obj, long j10, k0 k0Var, l0<E> l0Var, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        k0Var.readGroupList(this.listFieldSchema.mutableListAt(obj, j10), l0Var, extensionRegistryLite);
    }

    private <E> void readMessageList(Object obj, int i10, k0 k0Var, l0<E> l0Var, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        k0Var.readMessageList(this.listFieldSchema.mutableListAt(obj, offset(i10)), l0Var, extensionRegistryLite);
    }

    private void readString(Object obj, int i10, k0 k0Var) throws IOException {
        if (isEnforceUtf8(i10)) {
            s0.putObject(obj, offset(i10), k0Var.readStringRequireUtf8());
        } else if (this.lite) {
            s0.putObject(obj, offset(i10), k0Var.readString());
        } else {
            s0.putObject(obj, offset(i10), k0Var.readBytes());
        }
    }

    private void readStringList(Object obj, int i10, k0 k0Var) throws IOException {
        if (isEnforceUtf8(i10)) {
            k0Var.readStringListRequireUtf8(this.listFieldSchema.mutableListAt(obj, offset(i10)));
        } else {
            k0Var.readStringList(this.listFieldSchema.mutableListAt(obj, offset(i10)));
        }
    }

    private static java.lang.reflect.Field reflectField(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private void setFieldPresent(T t10, int i10) {
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i10);
        long j10 = 1048575 & iPresenceMaskAndOffsetAt;
        if (j10 == 1048575) {
            return;
        }
        s0.putInt(t10, j10, (1 << (iPresenceMaskAndOffsetAt >>> 20)) | s0.getInt(t10, j10));
    }

    private void setOneofPresent(T t10, int i10, int i11) {
        s0.putInt(t10, presenceMaskAndOffsetAt(i11) & 1048575, i10);
    }

    private int slowPositionForFieldNumber(int i10, int i11) {
        int length = (this.buffer.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int iNumberAt = numberAt(i13);
            if (i10 == iNumberAt) {
                return i13;
            }
            if (i10 < iNumberAt) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void storeFieldData(com.google.protobuf.FieldInfo r8, int[] r9, int r10, java.lang.Object[] r11) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.a0.storeFieldData(com.google.protobuf.FieldInfo, int[], int, java.lang.Object[]):void");
    }

    private void storeMessageField(T t10, int i10, Object obj) {
        UNSAFE.putObject(t10, offset(typeAndOffsetAt(i10)), obj);
        setFieldPresent(t10, i10);
    }

    private void storeOneofMessageField(T t10, int i10, int i11, Object obj) {
        UNSAFE.putObject(t10, offset(typeAndOffsetAt(i11)), obj);
        setOneofPresent(t10, i10, i11);
    }

    private static int type(int i10) {
        return (i10 & FIELD_TYPE_MASK) >>> 20;
    }

    private int typeAndOffsetAt(int i10) {
        return this.buffer[i10 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void writeFieldsInAscendingOrder(T r22, com.google.protobuf.Writer r23) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.a0.writeFieldsInAscendingOrder(java.lang.Object, com.google.protobuf.Writer):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void writeFieldsInDescendingOrder(T r11, com.google.protobuf.Writer r12) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.a0.writeFieldsInDescendingOrder(java.lang.Object, com.google.protobuf.Writer):void");
    }

    private <K, V> void writeMapHelper(Writer writer, int i10, Object obj, int i11) throws IOException {
        if (obj != null) {
            writer.writeMap(i10, this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i11)), this.mapFieldSchema.forMapData(obj));
        }
    }

    private void writeString(int i10, Object obj, Writer writer) throws IOException {
        if (obj instanceof String) {
            writer.writeString(i10, (String) obj);
        } else {
            writer.writeBytes(i10, (ByteString) obj);
        }
    }

    private <UT, UB> void writeUnknownInMessageTo(q0<UT, UB> q0Var, T t10, Writer writer) throws IOException {
        q0Var.writeTo(q0Var.getFromMessage(t10), writer);
    }

    @Override // com.google.protobuf.l0
    public boolean equals(T t10, T t11) {
        int length = this.buffer.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!equals(t10, t11, i10)) {
                return false;
            }
        }
        if (!this.unknownFieldSchema.getFromMessage(t10).equals(this.unknownFieldSchema.getFromMessage(t11))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(t10).equals(this.extensionSchema.getExtensions(t11));
        }
        return true;
    }

    public int getSchemaSize() {
        return this.buffer.length * 3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v215 */
    /* JADX WARN: Type inference failed for: r0v217 */
    /* JADX WARN: Type inference failed for: r0v219 */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v75 */
    /* JADX WARN: Type inference failed for: r1v76 */
    /* JADX WARN: Type inference failed for: r1v78 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // com.google.protobuf.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getSerializedSize(T r19) {
        /*
            Method dump skipped, instruction units count: 1708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.a0.getSerializedSize(java.lang.Object):int");
    }

    @Override // com.google.protobuf.l0
    public int hashCode(T t10) {
        int i10;
        int iHashLong;
        int length = this.buffer.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i12);
            int iNumberAt = numberAt(i12);
            long jOffset = offset(iTypeAndOffsetAt);
            int iHashCode = 37;
            switch (type(iTypeAndOffsetAt)) {
                case 0:
                    i10 = i11 * 53;
                    iHashLong = Internal.hashLong(Double.doubleToLongBits(s0.getDouble(t10, jOffset)));
                    i11 = i10 + iHashLong;
                    break;
                case 1:
                    i10 = i11 * 53;
                    iHashLong = Float.floatToIntBits(s0.getFloat(t10, jOffset));
                    i11 = i10 + iHashLong;
                    break;
                case 2:
                    i10 = i11 * 53;
                    iHashLong = Internal.hashLong(s0.getLong(t10, jOffset));
                    i11 = i10 + iHashLong;
                    break;
                case 3:
                    i10 = i11 * 53;
                    iHashLong = Internal.hashLong(s0.getLong(t10, jOffset));
                    i11 = i10 + iHashLong;
                    break;
                case 4:
                    i10 = i11 * 53;
                    iHashLong = s0.getInt(t10, jOffset);
                    i11 = i10 + iHashLong;
                    break;
                case 5:
                    i10 = i11 * 53;
                    iHashLong = Internal.hashLong(s0.getLong(t10, jOffset));
                    i11 = i10 + iHashLong;
                    break;
                case 6:
                    i10 = i11 * 53;
                    iHashLong = s0.getInt(t10, jOffset);
                    i11 = i10 + iHashLong;
                    break;
                case 7:
                    i10 = i11 * 53;
                    iHashLong = Internal.hashBoolean(s0.getBoolean(t10, jOffset));
                    i11 = i10 + iHashLong;
                    break;
                case 8:
                    i10 = i11 * 53;
                    iHashLong = ((String) s0.getObject(t10, jOffset)).hashCode();
                    i11 = i10 + iHashLong;
                    break;
                case 9:
                    Object object = s0.getObject(t10, jOffset);
                    if (object != null) {
                        iHashCode = object.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i11 * 53;
                    iHashLong = s0.getObject(t10, jOffset).hashCode();
                    i11 = i10 + iHashLong;
                    break;
                case 11:
                    i10 = i11 * 53;
                    iHashLong = s0.getInt(t10, jOffset);
                    i11 = i10 + iHashLong;
                    break;
                case 12:
                    i10 = i11 * 53;
                    iHashLong = s0.getInt(t10, jOffset);
                    i11 = i10 + iHashLong;
                    break;
                case 13:
                    i10 = i11 * 53;
                    iHashLong = s0.getInt(t10, jOffset);
                    i11 = i10 + iHashLong;
                    break;
                case 14:
                    i10 = i11 * 53;
                    iHashLong = Internal.hashLong(s0.getLong(t10, jOffset));
                    i11 = i10 + iHashLong;
                    break;
                case 15:
                    i10 = i11 * 53;
                    iHashLong = s0.getInt(t10, jOffset);
                    i11 = i10 + iHashLong;
                    break;
                case 16:
                    i10 = i11 * 53;
                    iHashLong = Internal.hashLong(s0.getLong(t10, jOffset));
                    i11 = i10 + iHashLong;
                    break;
                case 17:
                    Object object2 = s0.getObject(t10, jOffset);
                    if (object2 != null) {
                        iHashCode = object2.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i10 = i11 * 53;
                    iHashLong = s0.getObject(t10, jOffset).hashCode();
                    i11 = i10 + iHashLong;
                    break;
                case 50:
                    i10 = i11 * 53;
                    iHashLong = s0.getObject(t10, jOffset).hashCode();
                    i11 = i10 + iHashLong;
                    break;
                case 51:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = Internal.hashLong(Double.doubleToLongBits(oneofDoubleAt(t10, jOffset)));
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 52:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = Float.floatToIntBits(oneofFloatAt(t10, jOffset));
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 53:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t10, jOffset));
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 54:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t10, jOffset));
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 55:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = oneofIntAt(t10, jOffset);
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 56:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t10, jOffset));
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 57:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = oneofIntAt(t10, jOffset);
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 58:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = Internal.hashBoolean(oneofBooleanAt(t10, jOffset));
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 59:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = ((String) s0.getObject(t10, jOffset)).hashCode();
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 60:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = s0.getObject(t10, jOffset).hashCode();
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 61:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = s0.getObject(t10, jOffset).hashCode();
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 62:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = oneofIntAt(t10, jOffset);
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 63:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = oneofIntAt(t10, jOffset);
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 64:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = oneofIntAt(t10, jOffset);
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 65:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t10, jOffset));
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 66:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = oneofIntAt(t10, jOffset);
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 67:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t10, jOffset));
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 68:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = s0.getObject(t10, jOffset).hashCode();
                        i11 = i10 + iHashLong;
                    }
                    break;
            }
        }
        int iHashCode2 = (i11 * 53) + this.unknownFieldSchema.getFromMessage(t10).hashCode();
        return this.hasExtensions ? (iHashCode2 * 53) + this.extensionSchema.getExtensions(t10).hashCode() : iHashCode2;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    @Override // com.google.protobuf.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isInitialized(T r18) {
        /*
            r17 = this;
            r6 = r17
            r7 = r18
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r9 = 0
            r0 = r8
            r1 = r9
            r10 = r1
        Lb:
            int r2 = r6.checkInitializedCount
            r3 = 1
            if (r10 >= r2) goto Lb1
            int[] r2 = r6.intArray
            r11 = r2[r10]
            int r12 = r6.numberAt(r11)
            int r13 = r6.typeAndOffsetAt(r11)
            int[] r2 = r6.buffer
            int r4 = r11 + 2
            r2 = r2[r4]
            r4 = r2 & r8
            int r2 = r2 >>> 20
            int r14 = r3 << r2
            if (r4 == r0) goto L37
            if (r4 == r8) goto L33
            sun.misc.Unsafe r0 = com.google.protobuf.a0.UNSAFE
            long r1 = (long) r4
            int r1 = r0.getInt(r7, r1)
        L33:
            r16 = r1
            r15 = r4
            goto L3a
        L37:
            r15 = r0
            r16 = r1
        L3a:
            boolean r0 = isRequired(r13)
            if (r0 == 0) goto L50
            r0 = r17
            r1 = r18
            r2 = r11
            r3 = r15
            r4 = r16
            r5 = r14
            boolean r0 = r0.isFieldPresent(r1, r2, r3, r4, r5)
            if (r0 != 0) goto L50
            return r9
        L50:
            int r0 = type(r13)
            r1 = 9
            if (r0 == r1) goto L90
            r1 = 17
            if (r0 == r1) goto L90
            r1 = 27
            if (r0 == r1) goto L89
            r1 = 60
            if (r0 == r1) goto L78
            r1 = 68
            if (r0 == r1) goto L78
            r1 = 49
            if (r0 == r1) goto L89
            r1 = 50
            if (r0 == r1) goto L71
            goto Laa
        L71:
            boolean r0 = r6.isMapInitialized(r7, r13, r11)
            if (r0 != 0) goto Laa
            return r9
        L78:
            boolean r0 = r6.isOneofPresent(r7, r12, r11)
            if (r0 == 0) goto Laa
            com.google.protobuf.l0 r0 = r6.getMessageFieldSchema(r11)
            boolean r0 = isInitialized(r7, r13, r0)
            if (r0 != 0) goto Laa
            return r9
        L89:
            boolean r0 = r6.isListInitialized(r7, r13, r11)
            if (r0 != 0) goto Laa
            return r9
        L90:
            r0 = r17
            r1 = r18
            r2 = r11
            r3 = r15
            r4 = r16
            r5 = r14
            boolean r0 = r0.isFieldPresent(r1, r2, r3, r4, r5)
            if (r0 == 0) goto Laa
            com.google.protobuf.l0 r0 = r6.getMessageFieldSchema(r11)
            boolean r0 = isInitialized(r7, r13, r0)
            if (r0 != 0) goto Laa
            return r9
        Laa:
            int r10 = r10 + 1
            r0 = r15
            r1 = r16
            goto Lb
        Lb1:
            boolean r0 = r6.hasExtensions
            if (r0 == 0) goto Lc2
            com.google.protobuf.j<?> r0 = r6.extensionSchema
            com.google.protobuf.FieldSet r0 = r0.getExtensions(r7)
            boolean r0 = r0.isInitialized()
            if (r0 != 0) goto Lc2
            return r9
        Lc2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.a0.isInitialized(java.lang.Object):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    @Override // com.google.protobuf.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void makeImmutable(T r8) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.a0.makeImmutable(java.lang.Object):void");
    }

    @Override // com.google.protobuf.l0
    public void mergeFrom(T t10, k0 k0Var, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
        extensionRegistryLite.getClass();
        checkMutable(t10);
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, t10, k0Var, extensionRegistryLite);
    }

    @Override // com.google.protobuf.l0
    public void mergeFrom(T t10, T t11) {
        checkMutable(t10);
        t11.getClass();
        for (int i10 = 0; i10 < this.buffer.length; i10 += 3) {
            mergeSingleField(t10, t11, i10);
        }
        n0.mergeUnknownFields(this.unknownFieldSchema, t10, t11);
        if (this.hasExtensions) {
            n0.mergeExtensions(this.extensionSchema, t10, t11);
        }
    }

    @Override // com.google.protobuf.l0
    public void mergeFrom(T t10, byte[] bArr, int i10, int i11, c.b bVar) throws IOException {
        parseMessage(t10, bArr, i10, i11, 0, bVar);
    }

    @Override // com.google.protobuf.l0
    public T newInstance() {
        return (T) this.newInstanceSchema.newInstance(this.defaultInstance);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x0099. Please report as an issue. */
    public int parseMessage(T t10, byte[] bArr, int i10, int i11, int i12, c.b bVar) throws IOException {
        Unsafe unsafe;
        int i13;
        a0<T> a0Var;
        int i14;
        int i15;
        int i16;
        int i17;
        T t11;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        byte[] bArr2;
        int i25;
        int i26;
        byte b10;
        byte[] bArr3;
        int iDecodeVarint64;
        int i27;
        int i28;
        a0<T> a0Var2 = this;
        T t12 = t10;
        byte[] bArr4 = bArr;
        int i29 = i11;
        int i30 = i12;
        c.b bVar2 = bVar;
        checkMutable(t10);
        Unsafe unsafe2 = UNSAFE;
        int iDecodeUnknownField = i10;
        int i31 = 0;
        int i32 = 0;
        int i33 = 0;
        int i34 = -1;
        int i35 = 1048575;
        while (true) {
            if (iDecodeUnknownField < i29) {
                int i36 = iDecodeUnknownField + 1;
                byte b11 = bArr4[iDecodeUnknownField];
                if (b11 < 0) {
                    int iDecodeVarint32 = c.decodeVarint32(b11, bArr4, i36, bVar2);
                    i18 = bVar2.int1;
                    i36 = iDecodeVarint32;
                } else {
                    i18 = b11;
                }
                int i37 = i18 >>> 3;
                int i38 = i18 & 7;
                int iPositionForFieldNumber = i37 > i34 ? a0Var2.positionForFieldNumber(i37, i31 / 3) : a0Var2.positionForFieldNumber(i37);
                if (iPositionForFieldNumber == -1) {
                    i19 = i37;
                    i20 = i36;
                    i15 = i18;
                    i21 = i33;
                    i22 = i35;
                    unsafe = unsafe2;
                    i13 = i30;
                    i23 = 0;
                } else {
                    int i39 = a0Var2.buffer[iPositionForFieldNumber + 1];
                    int iType = type(i39);
                    long jOffset = offset(i39);
                    int i40 = i18;
                    if (iType <= 17) {
                        int i41 = a0Var2.buffer[iPositionForFieldNumber + 2];
                        int i42 = 1 << (i41 >>> 20);
                        int i43 = 1048575;
                        int i44 = i41 & 1048575;
                        if (i44 != i35) {
                            if (i35 != 1048575) {
                                unsafe2.putInt(t12, i35, i33);
                                i43 = 1048575;
                            }
                            i22 = i44;
                            i24 = i44 == i43 ? 0 : unsafe2.getInt(t12, i44);
                        } else {
                            i24 = i33;
                            i22 = i35;
                        }
                        switch (iType) {
                            case 0:
                                bArr2 = bArr;
                                i19 = i37;
                                i25 = iPositionForFieldNumber;
                                i26 = i40;
                                b10 = -1;
                                if (i38 == 1) {
                                    s0.putDouble(t12, jOffset, c.decodeDouble(bArr2, i36));
                                    iDecodeUnknownField = i36 + 8;
                                    i33 = i24 | i42;
                                    i30 = i12;
                                    bArr4 = bArr2;
                                    i31 = i25;
                                    i32 = i26;
                                    i35 = i22;
                                    i34 = i19;
                                    i29 = i11;
                                } else {
                                    i20 = i36;
                                    i23 = i25;
                                    unsafe = unsafe2;
                                    i21 = i24;
                                    i15 = i26;
                                    i13 = i12;
                                }
                                break;
                            case 1:
                                bArr2 = bArr;
                                i19 = i37;
                                i25 = iPositionForFieldNumber;
                                i26 = i40;
                                b10 = -1;
                                if (i38 == 5) {
                                    s0.putFloat(t12, jOffset, c.decodeFloat(bArr2, i36));
                                    iDecodeUnknownField = i36 + 4;
                                    i33 = i24 | i42;
                                    i30 = i12;
                                    bArr4 = bArr2;
                                    i31 = i25;
                                    i32 = i26;
                                    i35 = i22;
                                    i34 = i19;
                                    i29 = i11;
                                } else {
                                    i20 = i36;
                                    i23 = i25;
                                    unsafe = unsafe2;
                                    i21 = i24;
                                    i15 = i26;
                                    i13 = i12;
                                }
                                break;
                            case 2:
                            case 3:
                                bArr3 = bArr;
                                i19 = i37;
                                i25 = iPositionForFieldNumber;
                                i26 = i40;
                                b10 = -1;
                                if (i38 == 0) {
                                    iDecodeVarint64 = c.decodeVarint64(bArr3, i36, bVar2);
                                    unsafe2.putLong(t10, jOffset, bVar2.long1);
                                    i33 = i24 | i42;
                                    i30 = i12;
                                    bArr4 = bArr3;
                                    iDecodeUnknownField = iDecodeVarint64;
                                    i31 = i25;
                                    i32 = i26;
                                    i35 = i22;
                                    i34 = i19;
                                    i29 = i11;
                                } else {
                                    i20 = i36;
                                    i23 = i25;
                                    unsafe = unsafe2;
                                    i21 = i24;
                                    i15 = i26;
                                    i13 = i12;
                                }
                                break;
                            case 4:
                            case 11:
                                bArr2 = bArr;
                                i19 = i37;
                                i25 = iPositionForFieldNumber;
                                i26 = i40;
                                b10 = -1;
                                if (i38 == 0) {
                                    iDecodeUnknownField = c.decodeVarint32(bArr2, i36, bVar2);
                                    unsafe2.putInt(t12, jOffset, bVar2.int1);
                                    i33 = i24 | i42;
                                    i30 = i12;
                                    bArr4 = bArr2;
                                    i31 = i25;
                                    i32 = i26;
                                    i35 = i22;
                                    i34 = i19;
                                    i29 = i11;
                                } else {
                                    i20 = i36;
                                    i23 = i25;
                                    unsafe = unsafe2;
                                    i21 = i24;
                                    i15 = i26;
                                    i13 = i12;
                                }
                                break;
                            case 5:
                            case 14:
                                bArr2 = bArr;
                                i19 = i37;
                                i25 = iPositionForFieldNumber;
                                i26 = i40;
                                b10 = -1;
                                if (i38 == 1) {
                                    unsafe2.putLong(t10, jOffset, c.decodeFixed64(bArr2, i36));
                                    iDecodeUnknownField = i36 + 8;
                                    i33 = i24 | i42;
                                    i30 = i12;
                                    bArr4 = bArr2;
                                    i31 = i25;
                                    i32 = i26;
                                    i35 = i22;
                                    i34 = i19;
                                    i29 = i11;
                                } else {
                                    i20 = i36;
                                    i23 = i25;
                                    unsafe = unsafe2;
                                    i21 = i24;
                                    i15 = i26;
                                    i13 = i12;
                                }
                                break;
                            case 6:
                            case 13:
                                bArr2 = bArr;
                                i19 = i37;
                                i25 = iPositionForFieldNumber;
                                i26 = i40;
                                b10 = -1;
                                if (i38 == 5) {
                                    unsafe2.putInt(t12, jOffset, c.decodeFixed32(bArr2, i36));
                                    iDecodeUnknownField = i36 + 4;
                                    i33 = i24 | i42;
                                    i30 = i12;
                                    bArr4 = bArr2;
                                    i31 = i25;
                                    i32 = i26;
                                    i35 = i22;
                                    i34 = i19;
                                    i29 = i11;
                                } else {
                                    i20 = i36;
                                    i23 = i25;
                                    unsafe = unsafe2;
                                    i21 = i24;
                                    i15 = i26;
                                    i13 = i12;
                                }
                                break;
                            case 7:
                                bArr2 = bArr;
                                i19 = i37;
                                i25 = iPositionForFieldNumber;
                                i26 = i40;
                                b10 = -1;
                                if (i38 == 0) {
                                    iDecodeUnknownField = c.decodeVarint64(bArr2, i36, bVar2);
                                    s0.putBoolean(t12, jOffset, bVar2.long1 != 0);
                                    i33 = i24 | i42;
                                    i30 = i12;
                                    bArr4 = bArr2;
                                    i31 = i25;
                                    i32 = i26;
                                    i35 = i22;
                                    i34 = i19;
                                    i29 = i11;
                                } else {
                                    i20 = i36;
                                    i23 = i25;
                                    unsafe = unsafe2;
                                    i21 = i24;
                                    i15 = i26;
                                    i13 = i12;
                                }
                                break;
                            case 8:
                                bArr2 = bArr;
                                i19 = i37;
                                i25 = iPositionForFieldNumber;
                                i26 = i40;
                                b10 = -1;
                                if (i38 == 2) {
                                    iDecodeUnknownField = isEnforceUtf8(i39) ? c.decodeStringRequireUtf8(bArr2, i36, bVar2) : c.decodeString(bArr2, i36, bVar2);
                                    unsafe2.putObject(t12, jOffset, bVar2.object1);
                                    i33 = i24 | i42;
                                    i30 = i12;
                                    bArr4 = bArr2;
                                    i31 = i25;
                                    i32 = i26;
                                    i35 = i22;
                                    i34 = i19;
                                    i29 = i11;
                                } else {
                                    i20 = i36;
                                    i23 = i25;
                                    unsafe = unsafe2;
                                    i21 = i24;
                                    i15 = i26;
                                    i13 = i12;
                                }
                                break;
                            case 9:
                                bArr2 = bArr;
                                i19 = i37;
                                i25 = iPositionForFieldNumber;
                                i26 = i40;
                                b10 = -1;
                                if (i38 == 2) {
                                    Object objMutableMessageFieldForMerge = a0Var2.mutableMessageFieldForMerge(t12, i25);
                                    iDecodeUnknownField = c.mergeMessageField(objMutableMessageFieldForMerge, a0Var2.getMessageFieldSchema(i25), bArr, i36, i11, bVar);
                                    a0Var2.storeMessageField(t12, i25, objMutableMessageFieldForMerge);
                                    i33 = i24 | i42;
                                    i30 = i12;
                                    bArr4 = bArr2;
                                    i31 = i25;
                                    i32 = i26;
                                    i35 = i22;
                                    i34 = i19;
                                    i29 = i11;
                                } else {
                                    i20 = i36;
                                    i23 = i25;
                                    unsafe = unsafe2;
                                    i21 = i24;
                                    i15 = i26;
                                    i13 = i12;
                                }
                                break;
                            case 10:
                                bArr2 = bArr;
                                i19 = i37;
                                i25 = iPositionForFieldNumber;
                                i26 = i40;
                                b10 = -1;
                                if (i38 == 2) {
                                    iDecodeUnknownField = c.decodeBytes(bArr2, i36, bVar2);
                                    unsafe2.putObject(t12, jOffset, bVar2.object1);
                                    i33 = i24 | i42;
                                    i30 = i12;
                                    bArr4 = bArr2;
                                    i31 = i25;
                                    i32 = i26;
                                    i35 = i22;
                                    i34 = i19;
                                    i29 = i11;
                                } else {
                                    i20 = i36;
                                    i23 = i25;
                                    unsafe = unsafe2;
                                    i21 = i24;
                                    i15 = i26;
                                    i13 = i12;
                                }
                                break;
                            case 12:
                                bArr2 = bArr;
                                i19 = i37;
                                i25 = iPositionForFieldNumber;
                                i26 = i40;
                                b10 = -1;
                                if (i38 == 0) {
                                    iDecodeUnknownField = c.decodeVarint32(bArr2, i36, bVar2);
                                    int i45 = bVar2.int1;
                                    Internal.EnumVerifier enumFieldVerifier = a0Var2.getEnumFieldVerifier(i25);
                                    if (!isLegacyEnumIsClosed(i39) || enumFieldVerifier == null || enumFieldVerifier.isInRange(i45)) {
                                        unsafe2.putInt(t12, jOffset, i45);
                                        i33 = i24 | i42;
                                        i30 = i12;
                                        bArr4 = bArr2;
                                        i31 = i25;
                                        i32 = i26;
                                        i35 = i22;
                                        i34 = i19;
                                        i29 = i11;
                                    } else {
                                        getMutableUnknownFields(t10).storeField(i26, Long.valueOf(i45));
                                        i30 = i12;
                                        i31 = i25;
                                        i33 = i24;
                                        i32 = i26;
                                        i34 = i19;
                                        i29 = i11;
                                        bArr4 = bArr2;
                                        i35 = i22;
                                    }
                                } else {
                                    i20 = i36;
                                    i23 = i25;
                                    unsafe = unsafe2;
                                    i21 = i24;
                                    i15 = i26;
                                    i13 = i12;
                                }
                                break;
                            case 15:
                                bArr2 = bArr;
                                i19 = i37;
                                i25 = iPositionForFieldNumber;
                                i26 = i40;
                                b10 = -1;
                                if (i38 == 0) {
                                    iDecodeUnknownField = c.decodeVarint32(bArr2, i36, bVar2);
                                    unsafe2.putInt(t12, jOffset, CodedInputStream.decodeZigZag32(bVar2.int1));
                                    i33 = i24 | i42;
                                    i30 = i12;
                                    bArr4 = bArr2;
                                    i31 = i25;
                                    i32 = i26;
                                    i35 = i22;
                                    i34 = i19;
                                    i29 = i11;
                                } else {
                                    i20 = i36;
                                    i23 = i25;
                                    unsafe = unsafe2;
                                    i21 = i24;
                                    i15 = i26;
                                    i13 = i12;
                                }
                                break;
                            case 16:
                                i19 = i37;
                                i25 = iPositionForFieldNumber;
                                i26 = i40;
                                b10 = -1;
                                bArr3 = bArr;
                                if (i38 == 0) {
                                    iDecodeVarint64 = c.decodeVarint64(bArr3, i36, bVar2);
                                    unsafe2.putLong(t10, jOffset, CodedInputStream.decodeZigZag64(bVar2.long1));
                                    i33 = i24 | i42;
                                    i30 = i12;
                                    bArr4 = bArr3;
                                    iDecodeUnknownField = iDecodeVarint64;
                                    i31 = i25;
                                    i32 = i26;
                                    i35 = i22;
                                    i34 = i19;
                                    i29 = i11;
                                } else {
                                    i20 = i36;
                                    i23 = i25;
                                    unsafe = unsafe2;
                                    i21 = i24;
                                    i15 = i26;
                                    i13 = i12;
                                }
                                break;
                            case 17:
                                if (i38 == 3) {
                                    Object objMutableMessageFieldForMerge2 = a0Var2.mutableMessageFieldForMerge(t12, iPositionForFieldNumber);
                                    i19 = i37;
                                    i25 = iPositionForFieldNumber;
                                    i26 = i40;
                                    iDecodeUnknownField = c.mergeGroupField(objMutableMessageFieldForMerge2, a0Var2.getMessageFieldSchema(iPositionForFieldNumber), bArr, i36, i11, (i37 << 3) | 4, bVar);
                                    a0Var2.storeMessageField(t12, i25, objMutableMessageFieldForMerge2);
                                    i33 = i24 | i42;
                                    bArr4 = bArr;
                                    i30 = i12;
                                    i31 = i25;
                                    i32 = i26;
                                    i35 = i22;
                                    i34 = i19;
                                    i29 = i11;
                                } else {
                                    i19 = i37;
                                    i25 = iPositionForFieldNumber;
                                    i26 = i40;
                                    b10 = -1;
                                    i20 = i36;
                                    i23 = i25;
                                    unsafe = unsafe2;
                                    i21 = i24;
                                    i15 = i26;
                                    i13 = i12;
                                }
                                break;
                            default:
                                i19 = i37;
                                i25 = iPositionForFieldNumber;
                                i26 = i40;
                                b10 = -1;
                                i20 = i36;
                                i23 = i25;
                                unsafe = unsafe2;
                                i21 = i24;
                                i15 = i26;
                                i13 = i12;
                                break;
                        }
                    } else {
                        i19 = i37;
                        int i46 = i35;
                        i21 = i33;
                        if (iType != 27) {
                            i22 = i46;
                            if (iType <= 49) {
                                int i47 = i36;
                                unsafe = unsafe2;
                                i23 = iPositionForFieldNumber;
                                i28 = i40;
                                iDecodeUnknownField = parseRepeatedField(t10, bArr, i36, i11, i40, i19, i38, iPositionForFieldNumber, i39, iType, jOffset, bVar);
                                if (iDecodeUnknownField != i47) {
                                    a0Var2 = this;
                                    t12 = t10;
                                    bArr4 = bArr;
                                    i29 = i11;
                                    i30 = i12;
                                    bVar2 = bVar;
                                    i32 = i28;
                                    i33 = i21;
                                    i31 = i23;
                                    i35 = i22;
                                    i34 = i19;
                                    unsafe2 = unsafe;
                                } else {
                                    i13 = i12;
                                    i20 = iDecodeUnknownField;
                                    i15 = i28;
                                }
                            } else {
                                i27 = i36;
                                unsafe = unsafe2;
                                i23 = iPositionForFieldNumber;
                                i28 = i40;
                                if (iType != 50) {
                                    iDecodeUnknownField = parseOneofField(t10, bArr, i27, i11, i28, i19, i38, i39, iType, jOffset, i23, bVar);
                                    if (iDecodeUnknownField != i27) {
                                        a0Var2 = this;
                                        t12 = t10;
                                        bArr4 = bArr;
                                        i29 = i11;
                                        i30 = i12;
                                        bVar2 = bVar;
                                        i32 = i28;
                                        i33 = i21;
                                        i31 = i23;
                                        i35 = i22;
                                        i34 = i19;
                                        unsafe2 = unsafe;
                                    } else {
                                        i13 = i12;
                                        i20 = iDecodeUnknownField;
                                        i15 = i28;
                                    }
                                } else if (i38 == 2) {
                                    iDecodeUnknownField = parseMapField(t10, bArr, i27, i11, i23, jOffset, bVar);
                                    if (iDecodeUnknownField != i27) {
                                        a0Var2 = this;
                                        t12 = t10;
                                        bArr4 = bArr;
                                        i29 = i11;
                                        i30 = i12;
                                        bVar2 = bVar;
                                        i32 = i28;
                                        i33 = i21;
                                        i31 = i23;
                                        i35 = i22;
                                        i34 = i19;
                                        unsafe2 = unsafe;
                                    } else {
                                        i13 = i12;
                                        i20 = iDecodeUnknownField;
                                        i15 = i28;
                                    }
                                }
                            }
                        } else if (i38 == 2) {
                            Internal.ProtobufList protobufListMutableCopyWithCapacity2 = (Internal.ProtobufList) unsafe2.getObject(t12, jOffset);
                            if (!protobufListMutableCopyWithCapacity2.isModifiable()) {
                                int size = protobufListMutableCopyWithCapacity2.size();
                                protobufListMutableCopyWithCapacity2 = protobufListMutableCopyWithCapacity2.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
                                unsafe2.putObject(t12, jOffset, protobufListMutableCopyWithCapacity2);
                            }
                            iDecodeUnknownField = c.decodeMessageList(a0Var2.getMessageFieldSchema(iPositionForFieldNumber), i40, bArr, i36, i11, protobufListMutableCopyWithCapacity2, bVar);
                            i30 = i12;
                            i31 = iPositionForFieldNumber;
                            i32 = i40;
                            i33 = i21;
                            i35 = i46;
                            i34 = i19;
                            bArr4 = bArr;
                            i29 = i11;
                        } else {
                            i22 = i46;
                            i27 = i36;
                            unsafe = unsafe2;
                            i23 = iPositionForFieldNumber;
                            i28 = i40;
                        }
                        i13 = i12;
                        i20 = i27;
                        i15 = i28;
                    }
                }
                if (i15 != i13 || i13 == 0) {
                    iDecodeUnknownField = (!this.hasExtensions || bVar.extensionRegistry == ExtensionRegistryLite.getEmptyRegistry()) ? c.decodeUnknownField(i15, bArr, i20, i11, getMutableUnknownFields(t10), bVar) : c.decodeExtensionOrUnknownField(i15, bArr, i20, i11, t10, this.defaultInstance, this.unknownFieldSchema, bVar);
                    t12 = t10;
                    bArr4 = bArr;
                    i29 = i11;
                    i32 = i15;
                    a0Var2 = this;
                    bVar2 = bVar;
                    i33 = i21;
                    i31 = i23;
                    i35 = i22;
                    i34 = i19;
                    unsafe2 = unsafe;
                    i30 = i13;
                } else {
                    i17 = 1048575;
                    a0Var = this;
                    i14 = i20;
                    i33 = i21;
                    i16 = i22;
                }
            } else {
                int i48 = i35;
                unsafe = unsafe2;
                i13 = i30;
                a0Var = a0Var2;
                i14 = iDecodeUnknownField;
                i15 = i32;
                i16 = i48;
                i17 = 1048575;
            }
        }
        if (i16 != i17) {
            t11 = t10;
            unsafe.putInt(t11, i16, i33);
        } else {
            t11 = t10;
        }
        UnknownFieldSetLite unknownFieldSetLite = null;
        for (int i49 = a0Var.checkInitializedCount; i49 < a0Var.repeatedFieldOffsetStart; i49++) {
            unknownFieldSetLite = (UnknownFieldSetLite) filterMapUnknownEnumValues(t10, a0Var.intArray[i49], unknownFieldSetLite, a0Var.unknownFieldSchema, t10);
        }
        if (unknownFieldSetLite != null) {
            a0Var.unknownFieldSchema.setBuilderToMessage(t11, unknownFieldSetLite);
        }
        if (i13 == 0) {
            if (i14 != i11) {
                throw InvalidProtocolBufferException.parseFailure();
            }
        } else if (i14 > i11 || i15 != i13) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        return i14;
    }

    @Override // com.google.protobuf.l0
    public void writeTo(T t10, Writer writer) throws IOException {
        if (writer.fieldOrder() == Writer.FieldOrder.DESCENDING) {
            writeFieldsInDescendingOrder(t10, writer);
        } else {
            writeFieldsInAscendingOrder(t10, writer);
        }
    }
}
