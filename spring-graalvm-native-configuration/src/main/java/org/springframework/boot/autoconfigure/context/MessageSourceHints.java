package org.springframework.boot.autoconfigure.context;

import org.springframework.graalvm.extension.NativeImageConfiguration;
import org.springframework.graalvm.extension.NativeImageHint;
import org.springframework.graalvm.extension.TypeInfo;
import org.springframework.graalvm.type.AccessBits;

@NativeImageHint(trigger = MessageSourceAutoConfiguration.class,
	typeInfos = 
		@TypeInfo(types= MessageSourceProperties.class, access = AccessBits.CLASS|AccessBits.DECLARED_METHODS))
public class MessageSourceHints implements NativeImageConfiguration  {
}
