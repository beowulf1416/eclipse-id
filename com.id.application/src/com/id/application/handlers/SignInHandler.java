package com.id.application.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.ui.handlers.HandlerUtil;

import com.id.application.dialogs.PasswordDialog;

public class SignInHandler extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		PasswordDialog dialog = new PasswordDialog(HandlerUtil.getActiveShell(event));
		dialog.setBlockOnOpen(true);
		dialog.open();
		
		return null;
	}

}
