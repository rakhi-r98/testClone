package com.gm.gdat.ecs.scmproxy.util;

import java.io.File;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.api.errors.InvalidRemoteException;
import org.eclipse.jgit.api.errors.TransportException;
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;

import com.gm.gdat.ecs.scmproxy.config.CryptoHandler;
import com.gm.gdat.ecs.scmproxy.config.JsonFileHandler;

public class GitClone {

	public static void main(String[] args) throws InvalidRemoteException, TransportException, GitAPIException {
		long start = System.currentTimeMillis();
		System.setProperty("GIT_LFS_SKIP_SMUDGE", "true");
		Git.cloneRepository().setURI("https://github.com/microsoft/vscode")
				.setDirectory(new File("D:\my space\MyGitWorkspace"))
				//.setBranch("refs/heads/Phase-2_Release_Final")
				//.setCredentialsProvider(new UsernamePasswordCredentialsProvider("mafarukb", "Jeddah@11"))
				.call();
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

}
