package com.google.protobuf;

import com.google.protobuf.FieldSet;
import com.google.protobuf.LazyField;
import com.google.protobuf.WireFormat;
import java.io.IOException;

/* JADX INFO: compiled from: MessageSetSchema.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b0<T> implements l0<T> {
    private final MessageLite defaultInstance;
    private final j<?> extensionSchema;
    private final boolean hasExtensions;
    private final q0<?, ?> unknownFieldSchema;

    private b0(q0<?, ?> q0Var, j<?> jVar, MessageLite messageLite) {
        this.unknownFieldSchema = q0Var;
        this.hasExtensions = jVar.hasExtensions(messageLite);
        this.extensionSchema = jVar;
        this.defaultInstance = messageLite;
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(q0<UT, UB> q0Var, T t10) {
        return q0Var.getSerializedSizeAsMessageSet(q0Var.getFromMessage(t10));
    }

    private <UT, UB, ET extends FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(q0<UT, UB> q0Var, j<ET> jVar, T t10, k0 k0Var, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        UB builderFromMessage = q0Var.getBuilderFromMessage(t10);
        FieldSet<ET> mutableExtensions = jVar.getMutableExtensions(t10);
        while (k0Var.getFieldNumber() != Integer.MAX_VALUE) {
            try {
                if (!parseMessageSetItemOrUnknownField(k0Var, extensionRegistryLite, jVar, mutableExtensions, q0Var, builderFromMessage)) {
                    return;
                }
            } finally {
                q0Var.setBuilderToMessage(t10, builderFromMessage);
            }
        }
    }

    public static <T> b0<T> newSchema(q0<?, ?> q0Var, j<?> jVar, MessageLite messageLite) {
        return new b0<>(q0Var, jVar, messageLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends FieldSet.FieldDescriptorLite<ET>> boolean parseMessageSetItemOrUnknownField(k0 k0Var, ExtensionRegistryLite extensionRegistryLite, j<ET> jVar, FieldSet<ET> fieldSet, q0<UT, UB> q0Var, UB ub2) throws IOException {
        int tag = k0Var.getTag();
        int uInt32 = 0;
        if (tag != WireFormat.MESSAGE_SET_ITEM_TAG) {
            if (WireFormat.getTagWireType(tag) != 2) {
                return k0Var.skipField();
            }
            Object objFindExtensionByNumber = jVar.findExtensionByNumber(extensionRegistryLite, this.defaultInstance, WireFormat.getTagFieldNumber(tag));
            if (objFindExtensionByNumber == null) {
                return q0Var.mergeOneFieldFrom(ub2, k0Var, 0);
            }
            jVar.parseLengthPrefixedMessageSetItem(k0Var, objFindExtensionByNumber, extensionRegistryLite, fieldSet);
            return true;
        }
        Object objFindExtensionByNumber2 = null;
        ByteString bytes = null;
        while (k0Var.getFieldNumber() != Integer.MAX_VALUE) {
            int tag2 = k0Var.getTag();
            if (tag2 == WireFormat.MESSAGE_SET_TYPE_ID_TAG) {
                uInt32 = k0Var.readUInt32();
                objFindExtensionByNumber2 = jVar.findExtensionByNumber(extensionRegistryLite, this.defaultInstance, uInt32);
            } else if (tag2 == WireFormat.MESSAGE_SET_MESSAGE_TAG) {
                if (objFindExtensionByNumber2 != null) {
                    jVar.parseLengthPrefixedMessageSetItem(k0Var, objFindExtensionByNumber2, extensionRegistryLite, fieldSet);
                } else {
                    bytes = k0Var.readBytes();
                }
            } else if (!k0Var.skipField()) {
                break;
            }
        }
        if (k0Var.getTag() != WireFormat.MESSAGE_SET_ITEM_END_TAG) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        if (bytes != null) {
            if (objFindExtensionByNumber2 != null) {
                jVar.parseMessageSetItem(bytes, objFindExtensionByNumber2, extensionRegistryLite, fieldSet);
            } else {
                q0Var.addLengthDelimited(ub2, uInt32, bytes);
            }
        }
        return true;
    }

    private <UT, UB> void writeUnknownFieldsHelper(q0<UT, UB> q0Var, T t10, Writer writer) throws IOException {
        q0Var.writeAsMessageSetTo(q0Var.getFromMessage(t10), writer);
    }

    @Override // com.google.protobuf.l0
    public boolean equals(T t10, T t11) {
        if (!this.unknownFieldSchema.getFromMessage(t10).equals(this.unknownFieldSchema.getFromMessage(t11))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(t10).equals(this.extensionSchema.getExtensions(t11));
        }
        return true;
    }

    @Override // com.google.protobuf.l0
    public int getSerializedSize(T t10) {
        int unknownFieldsSerializedSize = getUnknownFieldsSerializedSize(this.unknownFieldSchema, t10) + 0;
        return this.hasExtensions ? unknownFieldsSerializedSize + this.extensionSchema.getExtensions(t10).getMessageSetSerializedSize() : unknownFieldsSerializedSize;
    }

    @Override // com.google.protobuf.l0
    public int hashCode(T t10) {
        int iHashCode = this.unknownFieldSchema.getFromMessage(t10).hashCode();
        return this.hasExtensions ? (iHashCode * 53) + this.extensionSchema.getExtensions(t10).hashCode() : iHashCode;
    }

    @Override // com.google.protobuf.l0
    public final boolean isInitialized(T t10) {
        return this.extensionSchema.getExtensions(t10).isInitialized();
    }

    @Override // com.google.protobuf.l0
    public void makeImmutable(T t10) {
        this.unknownFieldSchema.makeImmutable(t10);
        this.extensionSchema.makeImmutable(t10);
    }

    @Override // com.google.protobuf.l0
    public void mergeFrom(T t10, k0 k0Var, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, t10, k0Var, extensionRegistryLite);
    }

    @Override // com.google.protobuf.l0
    public void mergeFrom(T t10, T t11) {
        n0.mergeUnknownFields(this.unknownFieldSchema, t10, t11);
        if (this.hasExtensions) {
            n0.mergeExtensions(this.extensionSchema, t10, t11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cb A[EDGE_INSN: B:58:0x00cb->B:34:0x00cb BREAK  A[LOOP:1: B:18:0x006d->B:61:0x006d], SYNTHETIC] */
    @Override // com.google.protobuf.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mergeFrom(T r11, byte[] r12, int r13, int r14, com.google.protobuf.c.b r15) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.b0.mergeFrom(java.lang.Object, byte[], int, int, com.google.protobuf.c$b):void");
    }

    @Override // com.google.protobuf.l0
    public T newInstance() {
        MessageLite messageLite = this.defaultInstance;
        return messageLite instanceof GeneratedMessageLite ? (T) ((GeneratedMessageLite) messageLite).newMutableInstance() : (T) messageLite.newBuilderForType().buildPartial();
    }

    @Override // com.google.protobuf.l0
    public void writeTo(T t10, Writer writer) throws IOException {
        for (T t11 : this.extensionSchema.getExtensions(t10)) {
            FieldSet.FieldDescriptorLite fieldDescriptorLite = (FieldSet.FieldDescriptorLite) t11.getKey();
            if (fieldDescriptorLite.getLiteJavaType() != WireFormat.JavaType.MESSAGE || fieldDescriptorLite.isRepeated() || fieldDescriptorLite.isPacked()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (t11 instanceof LazyField.b) {
                writer.writeMessageSetItem(fieldDescriptorLite.getNumber(), ((LazyField.b) t11).getField().toByteString());
            } else {
                writer.writeMessageSetItem(fieldDescriptorLite.getNumber(), t11.getValue());
            }
        }
        writeUnknownFieldsHelper(this.unknownFieldSchema, t10, writer);
    }
}
