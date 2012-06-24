package net.tomp2p.message;
import java.io.IOException;
import java.nio.channels.FileChannel;

import org.jboss.netty.buffer.ChannelBuffer;

public interface ProtocolChunked
{
	public abstract void copyToCurrent(byte[] byteArray);

	public abstract void copyToCurrent(int size);

	public abstract void copyToCurrent(byte size);

	public abstract void copyToCurrent(long long1);

	public abstract void copyToCurrent(short short1);

	public abstract void copyToCurrent(ChannelBuffer slice);

	public abstract void copyToCurrent(byte[] array, int offset, int length);

	public abstract void transferToCurrent(FileChannel inChannel, long length) throws IOException;
}