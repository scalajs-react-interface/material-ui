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
 @JSImport("material-ui/Progress","CircularProgress")
object MuiCircularProgressComponent extends JSComponent[js.Object] {
   
 
 }
 
 object MuiCircularProgress {
    
    @inline
    def apply(id : OptionalParam[String] = OptDefault,
min : OptionalParam[Double | Int] = OptDefault,
size : OptionalParam[Double | Int] = OptDefault,
className : OptionalParam[String] = OptDefault,
max : OptionalParam[Double | Int] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
value : OptionalParam[Double | Int] = OptDefault,
mode : OptionalParam[MuiCircularProgressMode] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiCircularProgressComponent.type, Unit] = null): ReactElement { type Instance = MuiCircularProgressComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiCircularProgressComponent.type](
      MuiCircularProgressComponent,
      props,
      key,
      ref)
    }
 }

 
       
         
 @js.native
 trait MuiCircularProgressMode extends js.Object
 
 object MuiCircularProgressMode {
   @inline def DETERMINATE = "determinate".asInstanceOf[MuiCircularProgressMode] 
@inline def INDETERMINATE = "indeterminate".asInstanceOf[MuiCircularProgressMode] 
 } 
 
       


     

         
