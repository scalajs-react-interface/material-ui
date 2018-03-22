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
 @JSImport("material-ui/Dialog","DialogContent")
object MuiDialogContentComponent extends JSComponent[js.Object] {
   
 
 }
 
 object MuiDialogContent {
    
    @inline
    def apply(id : OptionalParam[String] = OptDefault,
className : OptionalParam[String] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiDialogContentComponent.type, Unit] = null)(children: ReactNode*): ReactElement { type Instance = MuiDialogContentComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiDialogContentComponent.type](
      MuiDialogContentComponent,
      props,
      key,
      ref,children.toJSArray)
    }
 }

 
 
 object MuiDialogContentC {
   
   @inline
   def apply(children:ReactNode*) = {
     CreateElementJS[MuiDialogContentComponent.type](
      MuiDialogContentComponent,
      json(),
      children = children.toJSArray)
   }
 
 }
 
          
       
         


     

         
