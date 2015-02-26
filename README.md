# Competition
MassBay Programming team solutions

# Command line compilation
So why is there a whole new git? Because git is super annoying! I tried to add a new branch from a second directory, and then it wouldn't work. Incidentally I figured out what was wrong while making this new respository, but I'm also lazy.

So anyway, Moussavi said that Apache Ant will likely be available to us, so I wrote a Ant build file that will take care of all that noise for us. We do have to be careful about adding package information, but we probably shouldn't rely on an IDE for that stuff forever anyway. 

## Use build.xml
To compile using Ant, install ant. 

Then from the command line enter:
```
    Ant -buildfile build.xml
```

Then run it with:
```
    java -cp bin com.Main
```
So yea, thats it.
