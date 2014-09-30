import System.IO (isEOF)
import Data.Char
main = myLoop
myLoop = do done <- isEOF
            if done
              then return ()
              else do
                inp <- getLine
                if teststr inp
                    then putStrLn inp
                    else return ()
                myLoop
teststr s = take 3 (map toLower s) == "hi " && toLower (s !! 3) /= 'd'
