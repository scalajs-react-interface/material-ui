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
 @JSImport("material-ui/Toolbar",JSImport.Default)
object MuiToolbarComponent extends JSComponent[js.Object] {
   
 
 }
 
 object MuiToolbar {
    
    @inline
    def apply(id : OptionalParam[String] = OptDefault,
className : OptionalParam[String] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
disableGutters : OptionalParam[Boolean] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiToolbarComponent.type, Unit] = null)(children: ReactNode*): ReactElement { type Instance = MuiToolbarComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiToolbarComponent.type](
      MuiToolbarComponent,
      props,
      key,
      ref,children.toJSArray)
    }
 }

 
 
 object MuiToolbarC {
   
   @inline
   def apply(children:ReactNode*) = {
     CreateElementJS[MuiToolbarComponent.type](
      MuiToolbarComponent,
      json(),
      children = children.toJSArray)
   }
 
 }
 
          
       
         


     

         
