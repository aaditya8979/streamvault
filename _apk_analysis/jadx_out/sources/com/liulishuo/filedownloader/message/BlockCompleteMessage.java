package com.liulishuo.filedownloader.message;

import ia.f;

/* JADX INFO: loaded from: classes11.dex */
public interface BlockCompleteMessage {

    public static class BlockCompleteMessageImpl extends MessageSnapshot implements BlockCompleteMessage {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final MessageSnapshot f34668d;

        public BlockCompleteMessageImpl(MessageSnapshot messageSnapshot) {
            super(messageSnapshot.g());
            if (messageSnapshot.getStatus() != -3) {
                throw new IllegalArgumentException(f.o("can't create the block complete message for id[%d], status[%d]", Integer.valueOf(messageSnapshot.g()), Byte.valueOf(messageSnapshot.getStatus())));
            }
            this.f34668d = messageSnapshot;
        }

        @Override // com.liulishuo.filedownloader.message.BlockCompleteMessage
        public MessageSnapshot d() {
            return this.f34668d;
        }

        @Override // ea.b
        public byte getStatus() {
            return (byte) 4;
        }
    }

    MessageSnapshot d();
}
