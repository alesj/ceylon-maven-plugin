def root = new File(basedir, 'target/other/modules/javax/inject/javax/inject/1')
return new File(root, 'javax.inject.javax.inject-1.jar').exists() &&
    new File(root, 'javax.inject.javax.inject-1.jar.sha1').exists()
