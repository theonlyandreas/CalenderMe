package server;

import proto.CalenderMessagesProto.ClientBasic;
import proto.CalenderMessagesProto.Request;

public class RequestHandler extends Handler {

	private Request message;

	public RequestHandler(Request request) {
		database = super.getDatabase();
		this.message = request;
	}

	@Override
	protected ClientBasic process() {
		return ClientBasic.newBuilder().setType(ClientBasic.MessageType.SUCCESS).build();
	}

}
