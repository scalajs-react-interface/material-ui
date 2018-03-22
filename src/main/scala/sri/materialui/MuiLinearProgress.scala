package sri.materialui


import sri.core._
import sri.universal._

import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.annotation.JSName
import sri.web.vdom.DOMProps
import org.scalajs.dom
import scalajsplus.macros.{FunctionObjectMacro, exclude}
import scalajsplus.{OptDefault, OptionalParam, DangerousUnionToJSAnyImplicit}
import sri.web.vdom.ReactEventAliases._

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav
import scala.scalajs.js.|
     




 @js.native
 @JSImport("material-ui/Progress","LinearProgress")
object MuiLinearProgressComponent extends JSComponent[js.Object] {
   
 
 }
 
 object MuiLinearProgress {
    
    @inline
    def apply(mode : OptionalParam[MuiLinearProgressMode] = OptDefault,
id : OptionalParam[String] = OptDefault,
className : OptionalParam[String] = OptDefault,
valueBuffer : OptionalParam[Double | Int] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
value : OptionalParam[Double | Int] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiLinearProgressComponent.type, Unit] = null): ReactElement { type Instance = MuiLinearProgressComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiLinearProgressComponent.type](
      MuiLinearProgressComponent,
      props,
      key,
      ref)
    }
 }

 
       
         
 @js.native
 trait MuiLinearProgressMode extends js.Object
 
 object MuiLinearProgressMode {
   @inline def DETERMINATE = "determinate".asInstanceOf[MuiLinearProgressMode] 
@inline def INDETERMINATE = "indeterminate".asInstanceOf[MuiLinearProgressMode] 
@inline def BUFFER = "buffer".asInstanceOf[MuiLinearProgressMode] 
@inline def QUERY = "query".asInstanceOf[MuiLinearProgressMode] 
 } 
 
       


     

         
